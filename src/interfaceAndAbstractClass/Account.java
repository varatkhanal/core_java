package interfaceAndAbstractClass;

import exception.InvalidWithdrawException;

public interface Account {
	String getBranchName();
	long getBalance();
	void deposit(double amount);
	void withdraw(double amount) throws InvalidWithdrawException;
	void setRate(double rate);
	double computeInterest();
}
