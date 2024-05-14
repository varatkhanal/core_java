package chapter_two;

import java.util.Scanner;

public class Student {
	int roll;
	int age;
	String name;
	String address;
	//static String collegeName;

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
}

