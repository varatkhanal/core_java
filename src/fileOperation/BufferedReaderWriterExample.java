package fileOperation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BufferedReaderWriterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] charArray={'h','e','l','l','o',',','t','h','e','r','e',' ','h','o','w',' ','a','r','e',' ','y','o','u'};
		char[] emptyArray= new char[100];
		
//		String str_one= "now time for string ";
//		String str_two;
//		try {
//			//to write string in a file
//			FileWriter fw = new FileWriter("E:\\xyz.txt");
//			BufferedWriter bw = new BufferedWriter(fw);
//			bw.write(str_one);
//			bw.close();
//	
//			//to read content from a file
//			FileReader fr = new FileReader("E:\\xyz.txt");
//			BufferedReader br = new BufferedReader(fr);
//			
//			str_two= br.readLine();
//			br.close();
//			System.out.println(str_two);
//			
//						
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		Scanner scan = new Scanner(System.in);
		//String ste = scan.nextLine();
		
		String str_one= "now time for string ";
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter("E:\\mobile.txt");
			bw = new BufferedWriter(fw);		
			bw.write(str_one);
//			for(char ch:emptyArray) {
//				//System.out.print(ch);
//				bw.write(ch);
//			}
			//fw.close();
			//bw.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader("E:\\mobile.txt");
			br = new BufferedReader(fr);		
			int b = br.read();
			while(b!=-1) {
				System.out.print((char)b);
				b= br.read();
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
