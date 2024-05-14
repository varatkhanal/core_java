package collection;


import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		
		HashMap<Integer,String> hs = new HashMap<>(); 
		hs.put(1, "kathmandu");
		 hs.put(2, "butwal"); 
		 hs.put(3, "butwal"); 
		 hs.put(4, "chitwan"); 
		 hs.put(5,"kathmandu"); 
		 hs.put(6, "butwal");
		 
		 for(Map.Entry e:hs.entrySet()) {
			 System.out.println(e.getKey()+" "+e.getValue());
		}
		 
    	 Set keys =hs.keySet();
    	 
    	 Iterator iterator = keys.iterator();
 		
 		while(iterator.hasNext()) {
 			System.out.println(iterator.next());
 		}
		 
		 Collection<String> values =  hs.values();
		 
		 for(String str:values) {
			 System.out.println(str);
		 }
		 
//		 System.out.println(values);
//		 
//		 
//		 System.out.println(keys);
		 
		 
		  
		 //HashMap<String,List<Student>> hss = new HashMap<>();
	}

}
