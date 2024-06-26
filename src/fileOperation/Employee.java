package fileOperation;

import java.io.Serializable;

public class Employee implements Serializable{

	private static final long serialVersionUID = 102L;
	private int eid;
	private String name;
	private String address;
	private int age;
	private long phoneNo;
	
	public Employee() {
		
		
	}
	
	public Employee(int eid, String name, String address, int age, long phoneNo) {
		//super();
		this.eid = eid;
		this.name = name;
		this.address = address;
		this.age = age;
		this.phoneNo = phoneNo;
	}
	/**
	 * @return the eid
	 */
	public int getEid() {
		return eid;
	}
	/**
	 * @param eid the eid to set
	 */
	public void setEid(int eid) {
		this.eid = eid;
	}
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
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the phoneNo
	 */
	public long getPhoneNo() {
		return phoneNo;
	}
	/**
	 * @param phoneNo the phoneNo to set
	 */
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", address=" + address + ", age=" + age + ", phoneNo="
				+ phoneNo + "]";
	}
	
}
