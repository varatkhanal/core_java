package thread.basics;

import java.util.Scanner;

public class CircleThread extends Thread {
	
	public void run() {
		System.out.println("hello child Thread");
		Scanner sc = new Scanner(System.in);
		System.out.println("radious : ");
		int r=sc.nextInt();
		double area= 3.14*r*r;
		System.out.println("Area is  : "+area);
	}
}
