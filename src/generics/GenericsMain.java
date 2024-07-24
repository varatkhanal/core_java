package generics;

import java.util.LinkedList;

import chapter_two.Student;

public class GenericsMain {
	
	
	
	public static void main(String[] args) {
		
		
		Integer[] intArray = {1, 2, 3, 4, 5}; // array of object integer		
		GenericMethod.arrayPrint(intArray);
		
		String[] strArray = {"Hello", "World"};
		GenericMethod(strArray);
		
		Student[] std = new Student[4];
	
		std[0] = new Student(1,19,"Amir","kailali");
		std[1] = new Student(2,19,"Aahuti","belaiya");
		std[2] = new Student(3,19,"bikram","kailali");
		std[3] = new Student(4,19,"john","dang");
		
		GenericMethod(std);
		
			
//		Book[] bookList = new Book[3];//array of book
//		
//		bookList[0]=new Book("The Great Gatsby", "F. Scott Fitzgerald",5677, "pearson");
//		bookList[1]=new Book("To Kill a Mockingbird", "Harper Lee", 1234,"lotus");
//		bookList[2]=new Book("1984", "George Orwell",950, "pearson");
//		GenericMethod.printArray(bookList);
//		
//		// TODO Auto-generated method stub
//		
//		// Generic Class 
//		
//		Box<Integer> integerBox = new Box<>(); 
//		integerBox.set(10); 
//		System.out.println("Integer Value: " + integerBox.get());
//		
//		Box<Float> floatBox = new Box<>(); 
//		floatBox.set(8.7f); 
//		System.out.println("Float Value: " + floatBox.get());
//		
//		Box<Character> characterBox = new Box<>(); 
//		characterBox.set('t'); 
//		System.out.println("Character Value: " + characterBox.get());
		
		

	}

}
