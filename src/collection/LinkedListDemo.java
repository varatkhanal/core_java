package collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {
		public static void main(String[] args) {
		    
			
			//datastructure ;> double linkedlist
			
			LinkedList linkedList = new LinkedList(); // array of heterogenous object
		
			linkedList.add(6);
			linkedList.add(5);
			linkedList.add('A');
			linkedList.add("hello");
			linkedList.add("hello");
			linkedList.add(6);
			linkedList.add(null);
			linkedList.add(null);
			
			
			linkedList.add(4,67); // it adds item/element/object in 4 th index, does not replace element
			linkedList.remove("hello");
			
			linkedList.set(7,67);  // it adds item/element/object in 7 th index, replace element
			
			System.out.println(linkedList.contains(11)); //searching an element/object 11 
			System.out.println("item in index 2 "+linkedList.get(2));
			
			//array list object
			ListIterator itr = linkedList.listIterator(4);
			
			while(itr.hasPrevious()) {
				System.out.println(itr.next());
			}

//			
//			ArrayList al =new ArrayList();
//			al = (ArrayList)arrayList.clone(); // it creates exact duplicates of existing array objectsd
//			
//			//al pbject 
//			ListIterator iterator = al.listIterator();
//			
//			while(iterator.hasNext()) {
//				System.out.println(iterator.next());
//			}
//			
			linkedList.clear();
			
		
			
			
		}

}
