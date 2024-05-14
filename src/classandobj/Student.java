package classandobj;

import java.util.Scanner;
public class Student {
	private int roll;
	int age;
	String name;
	String address;
	static String collegeName;
	
	//default constructor /no - args constructor
	public Student(){
		
		System.out.println("Hello constructor");
	}
	//parameterized constructor
	public Student(int roll, int age, String name, String address) {
		
		this.roll=roll;
		this.age=age;
		this.name=name;
		this.address=address;
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
	public int getRoll(){
		return roll;
	}
	public int getAge(){
		return age;
	}
	public String getName(){
		return name;
	}
	public String getAddress(){
		return address;
	}
	
	public String toString() {
		return "Student [Roll=" + 
	roll + ", Age=" + age + ", "
	+ "Name=" + name + ", Address="
	+ address+" ]";		
	}	
	
	
	public void display() {
		
		System.out.println("hello default");
	}
	public void display(String str) {
		System.out.println("hello parameterized "+str);	
		this.display();	

	}
}

