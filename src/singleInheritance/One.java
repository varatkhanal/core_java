package singleInheritance;
public final class One {

	final int a;	
	
	public One() {
		a=6;
		System.out.println("constructor of one");
	}
	public void display() {	
		//a=8;
		System.out.println("hello parent display");
	}
	public  final void printMessage() {		
		System.out.println("hello parent print");
	}
}
