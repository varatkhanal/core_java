package generics;

public class GenericMethod {
	public static <T> void printArray(T[] array) { 
		for (T element : array) {
			 System.out.println(element); 
		}
	}
	
	public static void printStringArray(String[] arr) {
		for (String str : arr) {
			 System.out.println(str); 
		}
	}
	public static void printStringArray(Integer[] iArr) {
		for (Integer n : iArr) {
			 System.out.println(n); 
		}
	}
}
