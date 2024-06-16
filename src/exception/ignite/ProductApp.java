package exception.ignite;

public class ProductApp {
	
	public long product(int a, int b) throws InvalidNumberException{
		if(a<0 || b<0) {
			throw new InvalidNumberException("one of these number is negetive");
		}
		
		return a*b;
		
	}

}
