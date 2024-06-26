package fileOperation;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectIntputStreamExample {
	public static void main(String[] args) {
        Employee emp = new Employee();

        try {
        	FileInputStream fileIn = new FileInputStream("E://teaching//java//employee.ser");;
             ObjectInputStream in = new ObjectInputStream(fileIn);
             emp = (Employee)in.readObject();
             System.out.println("Serialized employee object is : "+emp);
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

}
