package stringHandling;

public class StringBuilderDemo {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("simple string");
		sb.append(" in java");
		System.out.println("appended string : "+sb);		
		sb.delete(0, 6);
		System.out.println("after deletion : "+sb);
		String sub= sb.substring(1, 7);
		System.out.println("sub string:"+sub);
		sb.reverse();
		System.out.println(sb);
	}
}
