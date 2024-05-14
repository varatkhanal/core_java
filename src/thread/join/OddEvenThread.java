package thread.join;

import java.util.Scanner;

public class OddEvenThread implements Runnable{		
		public void run(){
			System.out.println("enter number: ");
			Scanner scan = new Scanner(System.in);		
			int a=scan.nextInt();
			if(a%2==0)
				System.out.println(a+" number is even");
			else
				System.out.println(a+" number is odd");	
		}
}
