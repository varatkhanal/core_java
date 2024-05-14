package fileOperation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReadWrite {
	public static void main(String []args) throws IOException {
		
		///Files.createFile("abc.txt");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int str = br.read();
		
		System.out.println(str);
		
		//System.out.write('s');
		
	}
}
