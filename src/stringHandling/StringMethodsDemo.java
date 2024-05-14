package stringHandling;

public class StringMethodsDemo {
	
	public static void main(String[] args) {
		String first_str="hello world";
		String second_str="this is java class!";
		String third_str="THIS IS UPPER CASE STRING!";
		
		
		System.out.println(first_str.length()); // to find length of string
		System.out.println(first_str.toUpperCase()); // to upper case
		System.out.println(third_str.toLowerCase()); // to lower case
		String subStr=second_str.substring(8, 12);
		System.out.println("sub string :"+subStr);
		System.out.println("index of l :"+first_str.indexOf('l'));
		System.out.println("index of l :"+first_str.indexOf('l',4));	
		
		//concat
		first_str=first_str.concat(second_str);
		System.out.println(first_str);
		
		String hel= "  hello ";
		
	
		
		System.out.println(hel.trim());
		System.out.println(second_str.replace('j','h'));
		
		String greet = "Namaste";
		String greet_sec = "Namaste";
		String greet_third = new String("Namaste");
		String greet_fourth = new String("Namaste");
		//----------------------------------------
		if(greet.equals(greet_sec)) {
			System.out.println("strings are equal ");
		}
		//---------------------------
		if(greet==greet_sec) {
			System.out.println("reference of strings is same ");
		}else {
			System.out.println("reference of strings is not same ");
		}
		//----------------------------------------
		if(greet==greet_third) {
			System.out.println("reference of strings is same ");
		}else {
			System.out.println("reference of strings is not same ");
		}
		//-----------------------------------------
		if(greet.equals(greet_third)) {
			System.out.println("contents of strings are same ");
		}
		//content
		System.out.println("greet_third and greet_fourth");
		if(greet_third.equals(greet_fourth)) {
			System.out.println("contents of strings are same ");
		}
		//reference
		if(greet_third==greet_fourth) {
			System.out.println("reference of strings are same ");
		}else {
			System.out.println("reference of strings are not same ");
			
		}
		
	}
}
