package classandobj.intel;

public class Main{		
	public static void main(String[] args){			
		Student std = new Student(5,25,"Rohit","baneshwor");
		//std.init(5,25,"Rohit","address");
//		std.setAge(25);
//		std.setRoll(5);
//		std.setName("Rohit Rawal ");
//		std.setAddress("baneshwor");
		System.out.println(std.toString());		
		
		Student std_sec = new Student();
		std_sec.setRoll(6);
		std_sec.setAge(22);
		std_sec.setName("Rakesh");		
//		//std_sec.init(6,"rakesh");
//		//std_sec.display();
		System.out.println("Student [ Roll : "+std_sec.getRoll()+", Name : "+std_sec.getName()+"]");

		TestStudent ts = new TestStudent();		
		ts.testAge(std,std_sec);
		
		Student stdThird = ts.testAges(std,std_sec);
		System.out.println("Student : "+stdThird.getName());

		
	}		
			
}
