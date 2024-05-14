package InterThread;

public class CashDeposit extends Thread {
	
	SavingAccount ac;
	int amt;
	public CashDeposit(SavingAccount ac, int amt){
		this.ac = ac;
		this.amt = amt;
	}
	public void run() {
         ac.deposit(amt);
    }
	
}
