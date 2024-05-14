package exception.userDefined;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {
	public static void main(String[] args) {
	    
	    //ArrayList 
	    // datastructure => indexed array element, contagious block of memory
	    //advantage :> stores duplicate data/object
	    //methods :> 
	        //1. add(object/element) :  add element/object at the end -> from Collection interface
	        //2. remove(object/element) : remove element/object from the end -> from Collection interface
	        
	        //3. add(int index, object/element) :  add element/object at the given index -> from List interface
	        //4. remove(int index) : remove element/object from the end -> from List interface
	        
	        //5. set(int i,Object obj) : add element at certain index/position, replaces existing-> from ArrayList Class
	        //6. get(int i) : get element from certain index -> from ArrayList Class
	
		
		// what is the difference between add(int index, Object ob) and 
		// set(int index, Object ob) ?
	    
		ArrayList arrayList = new ArrayList(); // array of heterogenous object
	
		arrayList.add(6);
		arrayList.add(5);
		arrayList.add('A');
		arrayList.add("hello");
		arrayList.add("hello");
		arrayList.add(6);
		arrayList.add(null);
		arrayList.add(null);
		
		arrayList.add(4,67); // it adds item/element/object in 4 th index, does not replace element
		arrayList.remove("hello");
		
		arrayList.set(7,67);  // it adds item/element/object in 7 th index, replace element
		
		System.out.println(arrayList.contains(11)); //searching an element/object 11 
		System.out.println("item in index 2 "+arrayList.get(2));
		
		//array list object
		Iterator itr = arrayList.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		ArrayList al =new ArrayList();
		al = (ArrayList)arrayList.clone(); // it creates exact duplicates of existing array objectsd
		
		//al pbject 
		ListIterator iterator = al.listIterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		arrayList.clear();
		
		
//		ArrayList<String> osList = new ArrayList<String>(); // string array
//		osList.add("windows");
//		osList.add("Linux");
//		osList.add("ubuntu");
//		osList.add("lubuntu");
//		osList.add("mac");
//		osList.add(null);
//		
//		Iterator itr = osList.iterator();
//		
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		
		
		
	}
}
