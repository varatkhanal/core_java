 package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<Integer> hashSet = new HashSet<Integer>();
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<10;i++) {
			int num = sc.nextInt();
			hashSet.add(num);
		}
		
		System.out.println("checks if hashset is empty  : "+hashSet.isEmpty()); //searching
		System.out.println("returns the size of hashset: "+hashSet.size());
		System.out.println("cheks if elemet is present : "+hashSet.contains(6));
		Iterator iterator = hashSet.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("copy operation:");
		HashSet hs_next =new HashSet();
		hs_next=(HashSet)hashSet.clone();
		
		Iterator itr = hashSet.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
		
	}
}
