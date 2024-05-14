package exception;

public class Basic {
public static void main(String[] args) {
		
		System.out.println("hello enter two number");
		
		int a=8,b=0;		
			
		ArithmeticOperaton ao = new ArithmeticOperaton();
		
		try {
			ao.div();		
		}catch(ArithmeticException ee) {
			ee.printStackTrace();
		}
		
//		
//		
//		
//		
//		
//		ao.divisionAlternate(a, b);  // we are not handling exception at the call time because 
//									//divisionAlternate() is handling exception itself in 
//									//ArithmeticOperation class
//		
//		try {
//			ao.division(a,b); // we are handling exception at the call time because 
//			//division() is not handling exception itself in ArithmeticOperation class, 
//			//infact it is asking us to handle exception by using throws keywords 
//			// that means exception has to be handled at the call time
//		}catch(ArithmeticException e) {
//			e.printStackTrace();
//		}
//		
//		
//		
//		
		System.out.println("rest");
		
	}
}
