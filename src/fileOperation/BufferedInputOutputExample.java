package fileOperation;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedInputOutputExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] byteArray={'h','e','l','l','o',',','t','h','e','r','e',' ','h','o','w',' ','a','r','e',' ','y','o','u'};
    	byte[] emptyArr= new byte[100];
    	
		try {
			FileOutputStream fout = new FileOutputStream("E:\\byte_arr.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fout);
			bos.write(byteArray);
			bos.close(); 
			
			FileInputStream fis = new FileInputStream("E:\\byte_arr.txt");
			BufferedInputStream bis = new BufferedInputStream(fis);
			bis.read(emptyArr);
			bis.close(); 
			for(byte b : emptyArr) {
				System.out.print((char)b);
			}
			 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
