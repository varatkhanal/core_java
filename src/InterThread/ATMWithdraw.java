package InterThread;

public class ATMWithdraw extends Thread{
	SavingAccount ac;
	int amt;
	public ATMWithdraw(SavingAccount ac, int amt){
		this.ac = ac;
		this.amt = amt;
	}
	public void run(){
    	ac.withdraw(amt);
    }

}
