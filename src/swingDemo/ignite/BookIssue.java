package swingDemo.ignite;

import java.io.Serializable;

public class BookIssue implements Serializable{
	

	private static final long serialVersionUID = 1L;
	
	String firstName, lastName, gender, section,program;
	String bookTaken;
	
	
	public BookIssue() {
		
		
	}
	public BookIssue(String firstName, String lastName, String gender, String section, String program,
			String bookTaken) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.section = section;
		this.program = program;
		this.bookTaken = bookTaken;
	}
	public void setFirstName(String firstName){
		this.firstName= firstName;
	}
	public String getFirstName(){
		return firstName;
	}

	public void setGender(String gender){
		this.gender= gender;
	}
	public String getGender(){
		return gender;
	}

	public void setProgram(String program){
		this.program= program;
	}
	public String getProgram(){
		return program;
	}

	/**
	 * @return the bookTaken
	 */
	public String getBookTaken() {
		return bookTaken;
	}
	/**
	 * @param bookTaken the bookTaken to set
	 */
	public void setBookTaken(String bookTaken) {
		this.bookTaken = bookTaken;
	}
	/**
	 * @return the section
	 */
	public String getSection() {
		return section;
	}
	/**
	 * @param section the section to set
	 */
	public void setSection(String section) {
		this.section = section;
	}
	@Override
	public String toString() {
		return "BookIssue [firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + ", section="
				+ section + ", program=" + program + ", bookTaken=" + bookTaken + "]";
	}
	

}