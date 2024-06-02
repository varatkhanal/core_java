package singleInheritance;

public class Two extends One{
	int b;	
	public Two() {
		//this("overloded/parameterized");
		// calls default constructor
		//this("parameterized ");
		//super.a=7; 
		
		System.out.println("constructor of two");
		
	}
	public Two(String str) {
		System.out.println(str+" constructor of two");
	}
	public void show() {
		System.out.println("hello child show");
	}	
	public void display() {	
		System.out.println("hello child display");
		//super.display();
	}
	public void display(String str) {	
		System.out.println("hello child "+str+ " display");
		//super.display();
	}
}
