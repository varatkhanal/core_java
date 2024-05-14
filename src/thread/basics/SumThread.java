package thread.basics;

import java.util.Scanner;

public class SumThread extends Thread{
	int a,b;
	
	
	public void run() {
		try {
			Thread.sleep(10000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		SumThread st = (SumThread)Thread.currentThread();
		System.out.println(st.isAlive());
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two no");
		int a=sc.nextInt();
		int b=sc.nextInt();
			
		System.out.println("sum is : "+(a+b));
	}

}
