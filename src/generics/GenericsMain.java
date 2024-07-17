package generics;



public class GenericsMain {
	public static void main(String[] args) {
		
		//Generic methods
		Integer[] intArray = {1, 2, 3, 4, 5};
		GenericMethod.printArray(intArray);
		
		String[] strArray = {"Hello", "World"};
		GenericMethod.printArray(strArray);
		
		Book[] bookList = new Book[3];
		
		bookList[0]=new Book("The Great Gatsby", "F. Scott Fitzgerald",5677, "pearson");
		bookList[1]=new Book("To Kill a Mockingbird", "Harper Lee", 1234,"lotus");
		bookList[2]=new Book("1984", "George Orwell",950, "pearson");
		GenericMethod.printArray(bookList);
		

		//GenericMethod.printArray(intArray); // Outputs: 1 2 3 4 5
		//GenericMethod.printArray(strArray); // Outputs: Hello World
		
		// TODO Auto-generated method stub
		// Generic Class 
//		Box<Integer> integerBox = new Box<>(); 
//		integerBox.set(10); 
//		System.out.println("Integer Value: " + integerBox.get());
//		
//		Box<Float> floatBox = new Box<>(); 
//		floatBox.set(8.7f); 
//		System.out.println("Integer Value: " + integerBox.get());
//		
//		Box<Character> characterBox = new Box<>(); 
//		characterBox.set('t'); 
//		System.out.println("Integer Value: " + integerBox.get());
		
		

	}

}
