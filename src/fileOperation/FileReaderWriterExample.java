package fileOperation;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class FileReaderWriterExample {
	public static void main(String[] args) { 
		char[] charArray={'h','e','l','l','o',',','t','h','e','r','e',' ','h','o','w',' ','a','r','e',' ','y','o','u'};
		char[] emptyArray= new char[100];
		
		String str= "now time for string ";
	
		//reading and writing characters using loop
		//using function write(char ch)
		//using function int read(char ch)
		
		try {
			FileWriter fw = new FileWriter("E:\\chitwan_java.txt");// to establish output stream to write data in charcter format = 8 bytes = 16 bits
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(str);
			//fw.write(charArray);
			
//			for(char ch:charArray) {
//				fw.write(ch);
//			}
//			
			fw.close();
		
			//reading character one by one
			FileReader fr = new FileReader("E:\\chitwan_java.txt");
			BufferedReader br = new BufferedReader(fr);
			//int n =fr.read();
			br.read(emptyArray);
			for(char ch:emptyArray) {
				System.out.print(ch);
		}
			//System.out.print((char)n);

			fr.close();								
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//write all the character using character array	
		//using function write(char[] arr)
		//using function read(char[] arr)
//		try {
//			FileWriter fw = new FileWriter("E:\\xyz.txt");
//			fw.write(charArray); 
//			fw.close();
//			
//			//to read content from a file
//			FileReader fr = new FileReader("E:\\xyz.txt");
//			fr.read(emptyArray); 
//			fr.close();
//			
//			for(char ch : emptyArray) {
//				System.out.print(ch);
//			}
//			
//		}catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}
}



