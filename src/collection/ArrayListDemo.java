package collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		//ArrayList 
	    // datastructure => indexed array element, contagious block of memory
	    //advantage :> stores duplicate data/object
	    //methods :> 
	        //add(object/element) :  add element/object at the end -> from Collection interface
	        //remove(object/element) : remove element/object from the end -> from Collection interface
	        
	        //add(int index, object/element) :  add element/object at the given index -> from List interface
	        //remove(int index) : remove element/object from the end -> from List interface
	        
	        //set(int i,Object obj) : add element at certain index/position -> from ArrayList Class
	        //get(int i) : get element from certain index -> from ArrayList Class
		
		ArrayList colorList = new ArrayList();
		colorList.add("red");
		colorList.add("white");
		colorList.add("yellow");
		colorList.add("pink");
		colorList.add("brown");
		colorList.add(8);
		colorList.add(8);
		colorList.add(8);
		colorList.add(5.6);
		colorList.add('A');
		
		
		System.out.println(colorList);
		
//		for(String color:colorList) {
//			System.out.println(color);
//		}
		
		ListIterator li = colorList.listIterator();
		
		while(li.hasNext()) {
			System.out.println(li.next());
			
		}
		
		
		
		
		
	}

}
