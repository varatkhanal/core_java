package labInterfaceQuestion;

public interface Calculate {
	public int diff(int x,int y);
	public int sum(int x, int y);
	
	public static int product(int x, int y) {
		return x*y;
	}
	default double division(int x, int y) {
		return (double)x/(double)y;
	}

}
