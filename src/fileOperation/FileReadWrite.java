package fileOperation;

import java.util.Scanner;

public class FileReadWrite {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner("E:\\teaching\\java\\login.txt");
		
		String one = scan.nextLine();
		//int two = scan.nextInt();
		//int three = scan.nextInt();
		
		System.out.println(one);

	}

}
