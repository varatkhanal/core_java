package classandobj.intel;

public class TestStudent {
	
	
	public void testAge(Student s, Student ss) {
		if(s.getAge() > ss.getAge()) {
			System.out.println("Student "+s.getName()+" is oldest");
		}else {
			System.out.println("Student "+ss.getName()+" is oldest");
		}
	}
	public Student testAges(Student s, Student ss) {
		if(s.getAge() > ss.getAge()) {
			return s;
		}else {
			return ss;
		}
	}
}
