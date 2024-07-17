package swing;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.*;


public class FileOperation{
	
	static File file = new File("E://teaching//java//studentsData.txt");

	//writing to a file
	public static void writeFile(User user){
		try{
//		BufferedWriter bw=new BufferedWriter(new FileWriter(file,true));
		
			ObjectOutputStream objOutput = new ObjectOutputStream(new FileOutputStream(file,true));
				objOutput.writeObject(user);
		
		
//		String tempFirstName= user.getFirstName();
//		String tempLastName= user.getSecondName();
//		String tempGender= user.getGender();
//		//String tempAddress= user.getAddress();
//		//String tempContact= user.getContact();
//		String tempSection= user.getSection();
//		String tempProgram= user.getProgram();
//		
//		//String tempJava= user.getJava();
//		//String tempMath= user.getMaths();
//		//String tempEnglish= user.getEnglish();
//		//String tempMacro= user.getMacro();
		
		//adding all the data to a single string
//		String st=tempFirstName+" "+tempLastName+" "+tempGender+" "+tempProgram+" "+tempSection+" "+user.getBookTaken()+"\n";
//		bw.write(st);
//		bw.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	//reading a file
	public static ArrayList<User> readFile(){
		
		User user=new User();
		ArrayList<User> list=new ArrayList<User>();
		try{
//			BufferedReader br=new BufferedReader(new FileReader(file));
//			//BufferedReader br1=new BufferedReader(new FileReader(file));
			
			ObjectInputStream objOutput = new ObjectInputStream(new FileInputStream(file));
			user = (User) objOutput.readObject();
	

			
			while((user = (User) objOutput.readObject())!=null){									
				list.add(user);
			}
			objOutput.close();
			//br1.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		System.out.println(list);

		return list;
	}
}