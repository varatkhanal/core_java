package swing;

import java.io.Serializable;

public class User implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4343L;
	
	String rollNo;
	String firstName, secondName, gender, address, contact,program;
	String java, maths, english, macro, ds;
	String bookTaken,section;
	

	public void setFirstName(String firstName){
		this.firstName= firstName;
	}
	public String getFirstName(){
		return firstName;
	}

	public void setSecondName(String secondName){
		this.secondName= secondName;
	}
	public String getSecondName(){
		return secondName;
	}

	public void setRollNo(String rollNo){
		this.rollNo= rollNo;
	}
	public String getRollNo(){
		return rollNo;
	}

	public void setGender(String gender){
		this.gender= gender;
	}
	public String getGender(){
		return gender;
	}

	public void setAddress(String address){
		this.address= address;
	}
	public String getAddress(){
		return address;
	}

	public void setContact(String contact){
		this.contact= contact;
	}
	public String getContact(){
		return contact;
	}

	public void setProgram(String program){
		this.program= program;
	}
	public String getProgram(){
		return program;
	}

	public void setJava(String java){
		this.java= java;
	}
	public String getJava(){
		return java;
	}

	public void setMaths(String maths){
		this.maths= maths;
	}
	public String getMaths(){
		return maths;
	}

	public void setEnglish(String english){
		this.english= english;
	}
	public String getEnglish(){
		return english;
	}

	public void setMacro(String macro){
		this.macro= macro;
	}
	public String getMacro(){
		return macro;
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
	public void setDS(String ds){
		this.ds= ds;
	}
	public String getDS(){
		return ds;
	}
}