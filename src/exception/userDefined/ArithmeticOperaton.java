package exception.userDefined;

public class ArithmeticOperaton {
	
	/* this method doesn't handle the exception itself,it delegates exception handling to caller 
	 * method*/
	public void division(int a, int b) throws ArithmeticException{
		System.out.println(a/b);	
	}
	
	/*this method handles exception itself. caller method doesn't handles the exception */
	public void divisionAlternate(int a, int b) {
		try {
			System.out.println(a/b);
		}catch(ArithmeticException ae) {
			ae.printStackTrace();
		}
	}
	
	public void div() throws ArithmeticException{

		System.out.println(8/0);
		
	}	
}
