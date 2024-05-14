package InheritanceStudent;

public class TestStudent {
	
	public void testAge(Student objOne,Student objTwo) {
		if(objOne.getAge() > objTwo.getAge()) {
			System.out.println("older student is "+objOne.getRoll());
		}
		else {
			System.out.println("older student is "+objTwo.getRoll());
		}
		
	}
	public void testGrade(Student objOne,Student objTwo) {
		if(objOne.getGrade() < objTwo.getGrade()) {
			System.out.println("topper student is "+objOne.getRoll());
		}
		else {
			System.out.println("tpper student is "+objTwo.getRoll());
		}
		
	}
	
	public Student testWeight(Student objOne,Student objTwo) {
		if(objOne.getWeight() > objTwo.getWeight()) {
			return objOne;
		}
		else {
			return objTwo;
		}
	}
	

}
