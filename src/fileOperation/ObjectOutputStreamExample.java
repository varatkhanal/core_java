package fileOperation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamExample {
	    public static void main(String[] args) {
	        Employee emp = new Employee(101,"John Doe", "downstreet",23,986767);

	        try {
	        	FileOutputStream fileOut = new FileOutputStream("E://teaching//java//employee.ser");;
	             ObjectOutputStream out = new ObjectOutputStream(fileOut);
	            out.writeObject(emp);
	             System.out.println("Serialized data is saved in employee.ser");
	        
//	             
//	             FileInputStream fileIn = new FileInputStream("E://teaching//java//employee.ser");;
//	             ObjectInputStream in = new ObjectInputStream(fileIn);
//	              Employee employee = (Employee)in.readObject();
//	              
//	              System.out.println(employee);
	        
	        } catch (IOException i) {
	            i.printStackTrace();
	        } 
	    }
	}
