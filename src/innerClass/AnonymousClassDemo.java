package innerClass;

abstract class Person{  
	  abstract void eat();  
} 
public class AnonymousClassDemo {
	  
	 public static void main(String args[]){  
		  Person p=new Person(){  
			  void eat(){System.out.println("nice fruits");}  
		  };  
		  p.eat();  
	 }  
}
