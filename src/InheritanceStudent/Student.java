package InheritanceStudent;


public class Student {
	private static String collegeName; //java style
	//char collegeName[10]; c style
	private int roll;
	private int age;
	private char grade;
	private int weight;
	private String name;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	int num;
	
	//default constructor
	public Student(){
		roll=5;
		age=24;
		weight=88;
		
		//System.out.println("constructor of Student class:"+num);
	}
	
	//parameterized constructor
	public Student(int r, int a, int w){ 
		//this keyword points current object
		//this();
		roll=r;
		age=a;
		weight= w;
		//System.out.println("parameterized constructor of Student class");
		
	}
	
	public void setRoll(int roll){
		this.roll=roll;
	}
	public void setAge(int age){
		this.age=age;
	}
	public void setGrade(char grade){
		this.grade=grade;
	}

	public int getRoll(){
		return roll;
	}
	public int getAge(){
		return age;
	}
	
	public char getGrade(){
		return grade;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
	public void example() {
		System.out.println("example in student");
	}
	
}
