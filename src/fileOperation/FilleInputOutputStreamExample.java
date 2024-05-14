package fileOperation;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FilleInputOutputStreamExample {
	public static void main(String[] args) {	
		//reading all bytes using loop 
		byte[] byteArray={1,5,6,7,-1,8,9,9};
		
		File file = new File("E:\\mno.txt");
		try {
			FileOutputStream fout = new FileOutputStream(file);
			//fout.write(6);
			
			for(byte b:byteArray) {
				fout.write(b);
			}
			fout.close();
			
			long len=file.length();
			
			byte[] nextArr=new byte[(int)len];
			
			FileInputStream fis = new FileInputStream("E:\\mno.txt");
			
			int data = fis.read();
			while(data!=-1) {
				System.out.println(data);
				data = fis.read();
			}
			
			
			fis.read(nextArr);
				
				for(int i=0;i<nextArr.length;i++) {
					System.out.print(nextArr[i]+" ");
				}
				System.out.println();
				System.out.println("using for-advanced");
				for(byte ch:nextArr) {
					System.out.print(ch+" ");
				}
				

			fis.close();
			
		}catch(IOException e){
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
