package Basic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;

public class PresentationRunner {
	public static boolean contains(int teams[][],int n) {
		for(int k = 0;k<9;k++) {
			for(int l=0;l<3;l++) {
				if(n==teams[k][l])
					return true;
			}
		}
			
		return false;
	}

	public static void main(String[] args) {
		int[] rolls = new int[28];
		int[][] teams = new int[9][3];
		
		ArrayList<Integer> rollList = new ArrayList<>();
		for(int i=0;i<28;i++) {
			rollList.add(i+1);
		}
		int count=0;
		Random r = new Random();
		for(int i = 0;i<9;i++) {
			//int num = r.nextInt(28-i);
			for(int j = 0;j<3;j++) {				
				int n=r.nextInt(28-count);
				count++;					
				teams[i][j]=rollList.get(n-1).intValue();
				rollList.remove(rollList.get(n-1));
			}
		}
		
		for(int i = 0;i<9;i++) {
			//int num = r.nextInt(28);
			System.out.print("team "+(i+1)+":");
			for(int j = 0;j<3;j++) {
				System.out.print(teams[i][j]+" ");
			}
			System.out.println();
		}
		
//		double radius = 2;
//		System.out.println("The area of the circle is: " + Math.PI * radius * radius);
	}
}
