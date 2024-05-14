package classWork;

import java.util.ArrayList;
import java.util.Scanner;

public class MovieDemo {
	
	public static void main(String[] args) {
		Movie one = new Movie();
		
		Scanner sc = new Scanner (System.in);
		
		String t= sc.next();
		String s= sc.next();
		double r = sc.nextDouble();
		
		Movie two = new Movie(t,s,r);
		
		System.out.println("[Movie one :"+one.getTitle()+" "+one.getStudio()+" "+one.getRating());
		System.out.println("[Movie two :"+two.getTitle()+" "+two.getStudio()+" "+two.getRating());
	
		ArrayList<Movie> arrayList = new ArrayList<>();
		arrayList.add(one);
		arrayList.add(two);
//		arrayList.add(three);
//		arrayList.add(four);
//		arrayList.add(five);
//		arrayList.add(six);
//		arrayList.add(seven);
//		arrayList.add(eight);
		
		BestMovie bm = new BestMovie();
		Movie bestM = bm.testRating(arrayList);
		
		System.out.println("[Best Movie :"+bestM.getTitle()+" "+bestM.getStudio()+" "+bestM.getRating());
		
		
	
	}

}
