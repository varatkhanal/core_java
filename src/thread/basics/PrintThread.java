package thread.basics;

import java.util.Scanner;

//import basic.SumThread;

public class PrintThread extends Thread{
	SumThread st;
	public PrintThread(SumThread st){
		this.st=st;
	}
	
	public void run() {	
		
		try {
			
			st.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String name; 
		Scanner scan = new Scanner(System.in);
		System.out.println("enter name :");
		name  = scan.next();
		for(int i=0;i<10;i++) {
			System.out.println("hello : "+name);
		}
	}
}
