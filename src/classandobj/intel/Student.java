package classandobj.intel;

public class Student {
	int roll;
	int age;
	String name;
	String address;
	
	//Default constructor
	public Student() {
		this(5,25,"rohit","baneshwor");
		System.out.println("Hello Default Constructor");
	}
	
	//parameterized constructor
	public Student(int roll,int age, String name, String address) {
		
		this.roll=roll;
		this.age=age;
		this.name=name;
		this.address=address;
		//System.out.println("Hello Parameterized Constructor : "+a);
	}
	
	public void setAge(int a) {
		age=a;
	}
	public void setRoll(int r) {
		roll=r;
	}
	public void setName(String na) {
		name=na;	
	}
	public void setAddress(String add) {
		address=add;	
	}	
	
	public int getAge(){
		return age;
	}
	
	public int getRoll(){
		return roll;
	}
	public String getName(){
		return name;
	}
	public String getAddress(){
		return address;
	}
	public String toString() {
		return "Student [Roll=" + roll + ", Age=" + age + ", Name=" + name + ", Address="+ address+" ]";		
	}
	public void display() {
		
		System.out.println("hello default");
	}
	public void display(String str) {
		this.display();
		System.out.println("hello parameterized "+str);	

	}
}

