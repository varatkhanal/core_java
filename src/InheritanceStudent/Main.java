package InheritanceStudent;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){	
	Student s=new Student(); //first object creation	
		
	//user input for object s 
		Scanner sc = new Scanner(System.in);
		int age, roll,wt;
		String cn,n;
		char ch;		
//		
		age=sc.nextInt();
		roll=sc.nextInt();
		n = sc.next();
		wt=sc.nextInt();
		cn = sc.next();
		ch= sc.next().charAt(0);	
		
		s.setAge(age);
		s.setRoll(roll);
		s.setGrade(ch);
		s.setWeight(wt);
		s.setCollegeName(cn);
		s.setName(n);
		
		int a,r,w;
		String c; char g;
		a= s.getAge();
		r=s.getRoll();
		g=s.getGrade();
		w=s.getWeight();
		c= s.getCollegeName();
		
		System.out.println("first student record:"+s.getName()+" "+a+" "+r+" "+g+" "+w+" "+c);
		
//		int a,r,wt;
//		String c;
//		char g;
//		float w;
		
	Student ss=new Student(); //second object creation	
		
		ss.setAge(24);
		ss.setRoll(11);
		ss.setGrade('B');
		ss.setWeight(69);
		ss.setCollegeName("Apex");
		ss.setName("gaurav");
		
		a= ss.getAge();
		r=ss.getRoll();
		g=ss.getGrade();
		w = ss.getWeight();
		c = ss.getCollegeName();
		
		System.out.println("student record:"+ss.getName()+" "+a+" "+r+" "+g+" "+w+" "+c);
		
		TestStudent ts = new TestStudent();
		
		
		ts.testGrade(s,ss);
		
		Student returnedObject = ts.testWeight(s,ss);
		
		System.out.println("student with higher weight is : "+returnedObject.getName());
		
		
		
		//Student ss=new Student(7,26,77);
//		BCISStudent bcis = new BCISStudent();
//		bcis.setAge(26);
//		bcis.setRoll(7);
//		bcis.setGrade('A');
//		bcis.setWeight(77);
//		bcis.setCollegeName("Apex");
//		bcis.setName("Ashutosh");
//		
//		bcis.setNoOfProject(3);
//		bcis.setNoOfLab(20);
//	
//		a= bcis.getAge();
//		r=bcis.getRoll();
//		g=bcis.getGrade();
//		w = bcis.getWeight();
//		c = bcis.getCollegeName();
//		int n = bcis.getNoOfLab();
//		int p= bcis.getNoOfProject();
//		String name=bcis.getName();
//		
//		bcis.example();
//
//		System.out.println("BCIS student record:"+a+" "+r+" "+g+" "+w+" "+c+" "+n+" "+p+" "+name);
//		
//		BBAStudent bba = new BBAStudent();
//		bba.setAge(26);
//		bba.setRoll(3);
//		bba.setGrade('A');
//		bba.setWeight(77);
//		bba.setCollegeName("Apex");
//		bba.setName("Rajan");
//		
//		bba.setNoOfBDP(2);
//		bba.setNoOfCaseStudy(10);
//	
//		a= bba.getAge();
//		r=bba.getRoll();
//		g=bba.getGrade();
//		w = bba.getWeight();
//		c = bba.getCollegeName();
//		int bdp = bba.getNoOfBDP();
//		int cs= bba.getNoOfCaseStudy();
//		String name_b=bba.getName();
//		
//		System.out.println("BBA student record:"+a+" "+r+" "+g+" "+w+" "+c+" "+name_b+" "+bdp+" "+cs);;
//		
	}

}
