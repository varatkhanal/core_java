package interfaceAndAbstractClass;

public abstract class BasicAccount implements Account{
	double withdrawLimit;	
	double interestRate;
	static long amount;
	String branchName;
	
	public BasicAccount(double withdrawLimit, double interestRate, long amount, String branchName) {
		this.withdrawLimit = withdrawLimit;
		this.interestRate = interestRate;
		this.amount = amount;
		this.branchName = branchName;
	}

	public String getBranchName() {
		return this.branchName;
	}
	
	public long getBalance() {
		//return balance
		return this.amount;
	}
	
	public void setRate(double rate) {
		//initialize rate 
		this.interestRate=rate;
	}
	public double getRate() {
		//return rate
		return this.interestRate;
	}
	

	

}
