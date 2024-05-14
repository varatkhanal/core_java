package fileOperation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadFIleScanner {
	
	public static void main(String[] args) {
		
		File file= new File("E:\\abc.txt");
		
		Scanner scan;
		try {
			//file.createNewFile();
			scan = new Scanner(file);
			//System.out.println("enter String : ");
			String line = scan.nextLine();
			
			System.out.println("String is "+line);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}

}
