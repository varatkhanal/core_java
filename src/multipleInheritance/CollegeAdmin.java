package multipleInheritance;

public class CollegeAdmin {

	public static void main(String[] args) {
		
		TribhuwanUniversity bachelor = new BCADepartment();
		bachelor.attendance();
		bachelor.nqCriteria();
		
		bachelor = new BBADepartment();
		bachelor.attendance();
		bachelor.nqCriteria();
	
		
	}
	

}
