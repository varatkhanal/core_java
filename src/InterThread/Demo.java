package InterThread;

public class Demo {

	public static void main(String[] args) {
				
		SavingAccount ac= new SavingAccount();
				
			//ac.setAmount(10000);			
			Thread.currentThread().setPriority(10);	
			
			ChequeWithdraw cw = new ChequeWithdraw(ac,20000);			
			ATMWithdraw aw = new ATMWithdraw(ac,95000);
			
			CashDeposit cd = new CashDeposit(ac,100000);
							
			cw.start();
			aw.start();
			cd.start();
				
//				Thread chequeWithdraw= new Thread(){
//					
//		            public void run(){
//		            	int amt =12000;
//		            	if(ac.getAmount()>amt)
//		            		ac.withdraw(amt);
//		            }
//		        };
//		        chequeWithdraw.setPriority(1);
//		        chequeWithdraw.start();
//		        
//		        
//		       Thread atmWithdraw= new Thread() {
//		            public void run() {
//		            	int amt=15000;
//		            	if(ac.getAmount()>amt) {
//		            		//System.out.println("method withdraw");
//		            		ac.withdraw(amt);		            		
//		            	}		                
//		            }
//		        };
//		        atmWithdraw.setPriority(10);
//		        atmWithdraw.start();
				
//		 		Thread chequeDeposit= new Thread() {
//		            public void run() {
//		            	   
//		                ac.deposit(15000);
//		            }
//		        };
//				chequeDeposit.start();
				

	}

}
