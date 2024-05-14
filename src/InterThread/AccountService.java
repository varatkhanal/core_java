package InterThread;

public class AccountService {
    int amount;
    synchronized void withdraw(int amount,SavingAccount ac) {
		//int amount = 10000;
		this.amount=ac.getAmount();
		System.out.println("================================");
		System.out.println("Current Balance in your account is:"+this.amount);
		System.out.println("================================");
		
        System.out.println("Withdraw initiated....");
        //if (this.amount < amount) {
			System.out.println("================================");
            System.out.println("Less balance cannot withdraw "+amount+" waiting for the deposit...");
			System.out.println("================================");
            try {
                //wait();
				withdraw(amount,ac);
            } catch (Exception e) {
	 			e.printStackTrace();
            }
        //}
		
        this.amount -= amount;
		ac.setAmount(this.amount);
		this.amount=0;
		System.out.println("================================");
        System.out.println("withdraw of amount "+amount+" has been completed");
		System.out.println("================================");
    }
    synchronized void deposit(int amount,SavingAccount ac) {
		this.amount =ac.getAmount();
		System.out.println("================================");
		System.out.println("Current balance before deposit is:"+this.amount);
		System.out.println("================================");
        System.out.println("Deposit initiated");
        
		this.amount+= amount;
		ac.setAmount(this.amount);
		System.out.println("================================");
        System.out.println("Deposit of amount "+amount+" completed... ");
       // notify();
    }
}
