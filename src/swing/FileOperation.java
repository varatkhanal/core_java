package swing;

import java.io.*;
import java.util.*;


public class FileOperation{
	
	static File file = new File("E://teaching//java//studentsData.txt");

	//writing to a file
	public static void writeFile(User user){
		try{
		BufferedWriter bw=new BufferedWriter(new FileWriter(file,true));
		
		String tempFirstName= user.getFirstName();
		String tempLastName= user.getSecondName();
		String tempGender= user.getGender();
		//String tempAddress= user.getAddress();
		//String tempContact= user.getContact();
		String tempSection= user.getSection();
		String tempProgram= user.getProgram();
		
		//String tempJava= user.getJava();
		//String tempMath= user.getMaths();
		//String tempEnglish= user.getEnglish();
		//String tempMacro= user.getMacro();
		
		//adding all the data to a single string
		String st=tempFirstName+" "+tempLastName+" "+tempGender+" "+tempProgram+" "+tempSection+" "+user.getBookTaken()+"\n";
		bw.write(st);
		bw.close();
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
			BufferedReader br=new BufferedReader(new FileReader(file));
			//BufferedReader br1=new BufferedReader(new FileReader(file));

			String line="";
			int i=0;
			int count=0;
//			while((line=br.readLine())!=null){
//				count++;
//			}
		//	String line="";
			while((line=br.readLine())!=null){
				
				String[] arr=line.split(" ");

				User usr=new User();
			
				//usr=new User();
				
				usr.setFirstName(arr[0]);
				usr.setSecondName(arr[1]);
				usr.setGender(arr[2]);
				//usr[i].setAddress(arr[3]);
				//usr[i].setContact(arr[4]);
				usr.setSection(arr[3]);
				usr.setProgram(arr[4]);
				usr.setBookTaken(arr[5]);
				//usr[i].setMaths(arr[8]);
				//usr[i].setEnglish(arr[9]);
				//usr[i].setMacro(arr[10]);
				i++;					
				list.add(usr);
			}
			br.close();
			//br1.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		System.out.println(list);

		return list;
	}
}