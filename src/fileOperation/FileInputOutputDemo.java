package fileOperation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputOutputDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			FileInputStream fis =new FileInputStream("E:\\Teaching\\Java\\Arrays_in_java.txt");
			byte[] byteArr=new byte[400];
			fis.read(byteArr);
			System.out.println(byteArr);
			//
			System.out.println("using for loop");
			for(int i=0;i<byteArr.length;i++) {
				System.out.print((char)byteArr[i]);
			}
			/*//syntax for advance for loop
			 * for(datatype variable:arrayVariable){
			 * 
			 * }
			 * 
			 * 
			 */
			System.out.println("using advance for loop");
			for(byte b : byteArr) {
				System.out.print((char)b);
			}
			
			
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}



}
