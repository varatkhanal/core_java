package generics;

public class GenericMethod {

	public static <T> void printArray(T[] arr) {
		for (T t : arr) {
			 System.out.println(t); 
		}
	}

}
