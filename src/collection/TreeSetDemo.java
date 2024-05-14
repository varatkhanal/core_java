package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet treeSet = new TreeSet();
	
		treeSet.add(11);
		treeSet.add(5);
		treeSet.add(17);
		treeSet.add(56);
		treeSet.add(13);
		treeSet.add(13);
		
		System.out.println("checks if hashset is empty  : "+treeSet.isEmpty()); //searching
		System.out.println("returns the size of hashset: "+treeSet.size());
		System.out.println("cheks if elemet is present : "+treeSet.contains(6));
		Iterator iterator = treeSet.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
