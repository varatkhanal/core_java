package singleInheritance;

public abstract class Three{
	

	public Three() {

		//super();//it will call default constructor of parenet class
		//super("overloded/parameterized");
		//super.a=9;
		System.out.println("constructor of three");
	}
//	public void printMessage() {
//		//a=67;
//		super.printMessage();
//		System.out.println("hello child three");
//	}
	
	abstract int sum(int a);
}
