package interfaceAndAbstractClass;

public class CurrentAccount extends BasicAccount{
	
	public CurrentAccount(double withdrawLimit, double interestRate, long amount,
			String branchName) {
		super(withdrawLimit, interestRate, amount, branchName);
	}

	public void withdraw(double amount) {
		//withdraw and return true if amount to be withdrawn is less than amount in account
		if(amount>this.withdrawLimit)
			System.out.println("withdraw limit exceded");
			//return false;
		else {
			if(amount>this.amount) {
				System.out.println("less balance");
				//return false;
			}
			else {
				this.amount-=amount;
				System.out.println("withdraw completed");
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
    }

	@Override
	public double computeInterest() {
		return this.amount*getRate();
	}


}
