package multilevelInheritance;

public class Student extends PokharaUniversityStudent{
	String name;
	int rollNO;
	String college;
	int semester;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the rollNO
	 */
	public int getRollNO() {
		return rollNO;
	}
	/**
	 * @param rollNO the rollNO to set
	 */
	public void setRollNO(int rollNO) {
		this.rollNO = rollNO;
	}
	/**
	 * @return the college
	 */
	public String getCollege() {
		return college;
	}
	/**
	 * @param college the college to set
	 */
	public void setCollege(String college) {
		this.college = college;
	}
	/**
	 * @return the semester
	 */
	public int getSemester() {
		return semester;
	}
	/**
	 * @param semester the semester to set
	 */
	public void setSemester(int semester) {
		this.semester = semester;
	}

}
