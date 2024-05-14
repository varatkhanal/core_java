package fileOperation;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class DataInputOutputStreamExample {
	public static void main(String[] args){
		try {	
			File file= new File("E:\\rand_file.dat");
			FileOutputStream fout = new FileOutputStream(file);
			DataOutputStream dos = new DataOutputStream(fout);
			dos.writeInt(5);
			dos.writeLong(55);
			dos.writeFloat(5.6f);
			dos.writeChar('b');
			dos.writeBoolean(false);
			dos.close();
			
			FileInputStream fis = new FileInputStream("E:\\rand_file.dat");
			DataInputStream dis = new DataInputStream(fis);
			int n= dis.readInt();
			long l = dis.readLong();
			float f = dis.readFloat();
			char ch = dis.readChar();
			boolean b = dis.readBoolean();
			dis.close(); 
			
System.out.println("integer :"+n+" long "+l+" decimal "+f+" character "+ch+" boolean "+b);		 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
