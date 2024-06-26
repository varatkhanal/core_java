package fileOperation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;

public class WordOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			BufferedReader bff = new BufferedReader(new FileReader("E://second.txt"));
			boolean isGood=false;
			String str = bff.readLine();
			while(str!=null) {
				System.out.println(str+"$");
				String[] arr= str.split(" ");
				for(int i = 0;i<arr.length;i++) {
					if(arr[i].equals("Salary")) {
						isGood=true;
						break;
					}else {

						System.out.println(arr[i]+" ");
					}
					if(isGood) break;
					str = bff.readLine();
				}
			}
		
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
