package classandobj;

abstract class Shape{
	int a;
	public Shape(){
		System.out.println("shape class constructor");
	}
	//non- abstract
	public void print() {
		System.out.println("this is geometrical shape");
	}
	
	//abstract : not defined : child class gives implementation
	public abstract void calculateArea(); //method with out defination 
}
class Circle extends Shape{
	
	public void calculateArea() {
		float r=6;
		System.out.println("area of circle "+(3.14*r*r));
	}
}
class Rectangle extends Circle{
	int a,b;

	public Rectangle(int ab){
		System.out.println("rectangle class parameterized constructor");
	}

	public void calculateArea() {
		int l =4; int b=8;
		System.out.println("area of Rectangle "+(l*b));
	}
}

public class DemoShape {
	public static void main(String[] args) {
		 //TODO Auto-generated method stub		
				
				//s.calculateArea();
				Circle c = new Circle();
				c.print();
				c.calculateArea();
				Rectangle r = new Rectangle(5);
				r.print();
				r.calculateArea();


	}

}

