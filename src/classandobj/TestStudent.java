package classandobj;

public class TestStudent{
	public void testAge(Student a, Student std_sec) {
		if(a.age>std_sec.age) {
			System.out.println("student "+a.getName()+" is older");
		}else{
			System.out.println("student "+std_sec.getName()+"is older");

		}
	}
	
}
