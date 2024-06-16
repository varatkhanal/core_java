package exception;

public class Basic {
	public static void main(String[] args) {	
		   //Arithmetic Exception
			System.out.println("first statement");	
			int a=8,b=0;
			try {
				System.out.println(a/b);
			}catch(ArithmeticException e) {
				e.printStackTrace();
			}
			System.out.println("last statement");
			
			//-----------------------------------------------------------
			
	}
}