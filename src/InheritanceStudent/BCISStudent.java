 package InheritanceStudent;

public class BCISStudent extends Student{
	private int noOfLab;
	private int noOfProject;
	
	 
	public BCISStudent(){
		//super(7,26,77);
		
	}
	
	
	
	
	public int getNoOfLab() {
		return noOfLab;
	}




	public void setNoOfLab(int noOfLab) {
		this.noOfLab = noOfLab;
	}




	public int getNoOfProject() {
		return noOfProject;
	}




	public void setNoOfProject(int noOfProject) {
		this.noOfProject = noOfProject;
	}




	public void example() {
		super.example();
		System.out.println("example of BCISStudent class");
	}
	
	

}
