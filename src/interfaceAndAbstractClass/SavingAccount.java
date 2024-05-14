package interfaceAndAbstractClass;

import enums.MessagesInfo;

import exception.InvalidWithdrawException;

public class SavingAccount extends BasicAccount{

	int transactionLimit;
	int transact=1;
	
	public SavingAccount(double withdrawLimit, double interestRate, long amount, String branchName, int transactionLimit) {
		//call parent class constructor and  initialize values to instance variable
		super(withdrawLimit, interestRate, amount, branchName);
		this.transactionLimit=transactionLimit;
	}
	public synchronized void withdraw(double amount) throws InvalidWithdrawException {
		System.out.println("================================");
		System.out.println("Current Balance in your account is:"+this.amount);
		System.out.println("================================");		
        System.out.println(MessagesInfo.WITHDRAW_INITIATED);

		if(amount>this.withdrawLimit) {
			throw new InvalidWithdrawException(MessagesInfo.WITHDRAWLIMIT_EXCEEDS.getErrorMessage());
			//System.out.println("cannot withdraw limit " +this.withdrawLimit+" exceded");
			//return false;
		}
		else {
			if(amount>this.amount) {
	    		System.out.println("================================>");
	    		System.out.println("Less balance cannot withdraw "+amount);
	    		System.out.println("================================>");
				try {
	    			wait();
	    		}catch(Exception ie) {
	    			ie.printStackTrace();
	    		}
			}
			else {
				if(transact>transactionLimit) {
					System.out.println("================================");
			        System.out.println("cannot withdraw amount "+amount+" excceded transaction limit");
					System.out.println("================================");
					//return false;
					
				}
				else {
					this.amount-=amount;
					transact++;
					
					System.out.println("================================");
			        System.out.println("withdraw of amount "+amount+" has been completed");
					System.out.println("================================");
					//return true;
					notifyAll();
				}
				notify();
			}
			
		}
	}
	public synchronized void deposit(double amount) {
		//this.amount =ac.getAmount();
		System.out.println("================================");
		System.out.println("Current balance before deposit is:"+this.amount);
		System.out.println("================================");
        System.out.println("Deposit initiated");
        
		this.amount+= amount;
		System.out.println("<================================");
        System.out.println("Deposit of amount "+amount+" completed... ");
    	System.out.println("<================================");
        notify();
    }
	
	public double computeInterest() {
		//compute the interest with the rate you have set
		return amount*getRate();
	}
	
}
