package classandobj;

public class TestStudent{
	public Student testAge(Student a, Student std_sec) {
		if(a.getAge()>std_sec.getAge()) {
			return a;
		}else{
			return std_sec;

		}
	}
	
}
