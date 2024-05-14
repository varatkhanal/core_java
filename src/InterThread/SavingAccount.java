package InterThread;

public class SavingAccount{
	int amount;
	public SavingAccount() {
		this.amount=15000;
	}
	public void setAmount(int amount){
		this.amount=amount;
	}
	public int getAmount(){
		return this.amount;
	}
	synchronized void withdraw(int amt) {
		System.out.println("================================");
		System.out.println("Current Balance in your account is:"+this.amount);
		System.out.println("================================");		
        System.out.println("Withdraw initiated....");
        
        if (this.amount < amt) {
    		System.out.println("================================>");
    		System.out.println("Less balance cannot withdraw "+amt);
    		System.out.println("================================>");		
    		try {
    			wait();
    		}catch(Exception ie) {
    			ie.printStackTrace();
    		}
        }
		
        this.amount -= amt;
		System.out.println("================================");
        System.out.println("withdraw of amount "+amt+" has been completed");
		System.out.println("================================");
    }
	
    synchronized void deposit(int amt) {
		//this.amount =ac.getAmount();
		System.out.println("================================");
		System.out.println("Current balance before deposit is:"+this.amount);
		System.out.println("================================");
        System.out.println("Deposit initiated");
        
		this.amount+= amt;
		System.out.println("<================================");
        System.out.println("Deposit of amount "+amt+" completed... ");
    	System.out.println("<================================");
        notifyAll();
    }
}
