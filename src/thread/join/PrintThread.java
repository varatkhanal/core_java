package thread.join;

//import basic.SumThread;

public class PrintThread extends Thread{
	
	SumThread st;
	public PrintThread(SumThread st) {
		this.st = st;
	}	
	public void run() {		
		
		for(int i=0;i<10;i++) {
			System.out.println("hello child thread one"+i);
		}
	}
}
