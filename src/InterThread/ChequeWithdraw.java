package InterThread;

public class ChequeWithdraw extends Thread{
	SavingAccount ac;
	int amt;
	public ChequeWithdraw(SavingAccount ac, int amt){
		this.ac = ac;
		this.amt = amt;
	}
	public void run(){
    	ac.withdraw(amt);
    }
}
