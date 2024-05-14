package thread.join;

import java.util.Scanner;

public class SumThread implements Runnable{
		public void run(){
			System.out.println("enter two number: ");
			Scanner scan = new Scanner(System.in);			
			int a=scan.nextInt();
			int b=scan.nextInt();		
			System.out.println("sum is "+(a+b));
		}
}
