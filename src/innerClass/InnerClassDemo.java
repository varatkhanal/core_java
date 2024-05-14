package innerClass;

public class InnerClassDemo {  
		 private int data=30;  
		 class Inner{  
			 void msg(){
				 System.out.println("data is "+data);
			}  
		 }  
		 public static void main(String args[]){  
			 InnerClassDemo obj=new InnerClassDemo();  
			 InnerClassDemo.Inner in=obj.new Inner();  
			 in.msg();  
		 }  

}
