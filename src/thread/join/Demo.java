package thread.join;

public class Demo {
		public static void main(String[] args){
			SumThread sth= new SumThread();
			//Thread t = new Thread(sth);
			PrintThread pt = new PrintThread(sth);
			pt.start();
			
			
//			OddEvenThread oth= new OddEvenThread();	
//			Thread th_two = new Thread(oth);
//			th_two.start();
		}
}