package thread.basics;

public class Demo {

	public static void main(String[] args) {
		SumThread st = new SumThread();
		st.setPriority(Thread.MAX_PRIORITY);	
		PrintThread pt = new PrintThread(st);
		
		
		st.start();
		pt.start();
		st.setName("sum thread");
		pt.setName("print thread");
		Thread t= Thread.currentThread();
		
		System.out.println(t.isAlive());
		
		System.out.println(st.getName());
		System.out.println(pt.getName());
		System.out.println(t.getName());
		pt.setPriority(Thread.MIN_PRIORITY);
		
		System.out.println(st.isAlive());
		System.out.println(pt.isAlive());

	}

}
