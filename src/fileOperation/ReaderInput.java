package fileOperation;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class ReaderInput {

	public static void main(String[] args) {

//		        String fileName = "E:\\abc.txt";
//
//		        try (BufferedReader br = new BufferedReader(new InputStreamReader(
//		                new FileInputStream(fileName), StandardCharsets.UTF_16));) {
//
//		            String line;
//		            
//		            while ((line = br.readLine()) != null) {
//		                
//		                System.out.println(line);
//		            }
//		        } catch (FileNotFoundException e) {
//					e.printStackTrace();
//				} catch (IOException e) {
//					e.printStackTrace();
//				}

		        System.out.println();
		        
		        char c;
		        
		        for(c=2309;c<2362;c++) {
		        	System.out.print(" "+c);
		        }

	}

}
