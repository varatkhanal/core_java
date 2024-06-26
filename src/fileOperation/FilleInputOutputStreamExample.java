package fileOperation;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FilleInputOutputStreamExample {
	public static void main(String[] args) {	
		//reading all bytes using loop 
		
		byte[] bytes = new byte[10];
		
		char[] charArray = {'A', 'B', 'C', 'D','g','E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X'};
//		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("enter 10 ele6ments : ");
//		for(int i=0;i<10;i++) {
//			bytes[i]=(byte)scan.nextInt();
//		}
		
		File file = new File("E:\\intel_file.txt");
		
		System.out.println("file length : "+file.length());
		
		
		try{
			FileOutputStream fout = new FileOutputStream(file);
			//writing single data to a file
			for(int i = 0;i<charArray.length;i++)
				fout.write(charArray[i]);  //this is writing elements in byte array to a file
			
			fout.close();
			
			FileInputStream fis = new FileInputStream(file);
			//reads single data
			
			char ch= (char)fis.read(); // this reads bytes from a file and stores in 
								// readByte
			while(ch!='G' && ch!='g') {
				System.out.print(" "+ch);
				//we will read again (next character)
				ch= (char)fis.read(); 
			}
			
			//using loop to ead array of data from a file

			fis.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}

		
		//reading all bytes using byte array
//	    System.out.println(byteArray.length);
//    	byte[] emptyArr= new byte[100];
//		int num;
//		try {
//			FileOutputStream fout = new FileOutputStream("E:\\byte_arr.txt");
//			fout.write(byteArray);
//			fout.close();
//			
//			FileInputStream fis = new FileInputStream("E:\\byte_arr.txt");
//			fis.read(emptyArr);
//			fis.close(); 
//			
//			for(byte b : emptyArr) {
//				System.out.print((char)b);
//			}
//			 
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

}
