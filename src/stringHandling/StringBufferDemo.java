package stringHandling;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("simple buffer string");
		
		sb.append(" in java");	
		System.out.println(sb);
		System.out.println("appended string : "+sb);		
		sb.delete(0, 6);
		System.out.println("after deletion : "+sb);
		String sub= sb.substring(1, 7);
		System.out.println("sub string:"+sub);
		sb.reverse();
		System.out.println(sb);
	}
}
