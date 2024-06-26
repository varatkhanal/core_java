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
			
			System.out.println(file.length());
			
			FileOutputStream fout = new FileOutputStream(file);
			DataOutputStream dos = new DataOutputStream(fout);
			int eid = 5;
			String name = "suman";
			String address = "pepsi cola";
			int age = 21;
			
			dos.writeInt(5);
			dos.writeChars(name);
			dos.writeChars(address);
			dos.writeInt(age);
			dos.close();
			
			FileInputStream fis = new FileInputStream(file);
			DataInputStream dis = new DataInputStream(fis);
			
			byte[] b = new byte[name.length()*2];
			int n= dis.readInt();
			String f = Integer.toString(dis.read(b));
			String l = Integer.toString(dis.read(b));
			int a = dis.readInt();
			dis.close(); 
			
			System.out.println("employee eid :"+n+" name "+l+" address "+f+" age "+a);		 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

