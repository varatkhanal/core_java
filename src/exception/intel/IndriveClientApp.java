package exception.intel;

import java.util.Scanner;

public class IndriveClientApp {
	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter location : ");
		String toLocation = scan.next();
		IndriveApp indrive = new IndriveApp();		
		try {
			indrive.setLocation(toLocation);
		} catch (InvalidLocationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
