package enums;

public enum MessagesInfo {
	WITHDRAW_COMPLETED("Withdraw has been completed"),
	WITHDRAWLIMIT_EXCEEDS("Withdraw amount exceeds withdrw limit"),
	DEPOSIT_COMPLETED("Deposit has been completed "),
	TRANSACTION_LIMIT_EXCEEDS("Transaction has exceed the transaction limit "),
	WITHDRAW_INITIATED("withdraw initiated"),
	DEPOSIT_INITIATED("Deposit initiated");

	private String errorMessage;
	
	MessagesInfo(String errorMessage){
		this.errorMessage=errorMessage;
	}
	
	public String getErrorMessage() {
		
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		
		this.errorMessage=errorMessage;
	}
	
}
