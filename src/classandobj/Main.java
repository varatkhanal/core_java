package classandobj;

import java.util.Scanner;

public class Main{		
	public static void main(String[] args){	
		
		
		Student std = new Student(5 ,25,"Rohit","address"); // it calls pareterized construtor		
//		std.setAge(25);
//		std.setRoll(5);
//		std.setName("Rohit");
//		std.setAddress("baneshwor");
		std.collegeName="Apex";
		System.out.println(std.toString()+" "+std.collegeName);
		
		Student std_sec = new Student();//it calls default constructr
		std_sec.setRoll(6);
		std_sec.setAge(22);
		std_sec.setName("Rakesh");		
		System.out.println(std_sec.getRoll()+" "+std_sec.getName()+" "+std_sec.collegeName);	
		
		//std_sec.display();
		std_sec.display("second");
		
		TestStudent ts = new TestStudent();
		Student ss = ts.testAge(std,std_sec);
		
		System.out.println("student "+ss.toString()+" is older");
	}
}		
		

		
	
		
//		std.roll = 5;
//		std.age = 25;
//		std.name = "rohit";
		
		
//	}

	
//	public static void main(String[] args){	
//		Student.collegeName="Apex";	
//		System.out.println(Student.collegeName);
//		
//		
//		Student[] std = new Student[10]; //array of instance variable
//		//user input
//		std[0]=new Student(); // object creation	
//		//std[0].init(5,24,"rohit", "baneshwor");	
//		
//		std[0].setRoll(7);
//		std[0].setAge(19);	
//		std[0].setName("Abhash");
//		std[0].setAddress("sharma");
//		
//		System.out.println(std[0].getRoll()+" "+std[0].getAge()+" "+std[0].getName()+" "+std[0].getAddress());
//		
////		std[1]=new Student(); // object creation	
////		std[1].init(6,21,"pragati","baneshwor");
////		
////		std[2]=new Student(); // object creation	
////		std[2].init(7,19,"tiger","jungle");
////		
////		for(int i=0;i<3;i++)
////			std[i].display();
//	}	
//}
