package thread.basics;

public class DeadLockExample {
	    public static void main(String[] args) {
	        // Two shared resources (locks)
	        Object lock1 = new Object();
	        Object lock2 = new Object();

	        // Thread 1
	        Thread thread1 = new Thread(() -> {
	            synchronized (lock1) {
	                System.out.println("Thread 1: Holding lock1...");
	                try {
	                    Thread.sleep(100); // Simulate some work
	                } catch (InterruptedException e) {
	                }
	                System.out.println("Thread 1: Waiting for lock2...");
	                synchronized (lock2) {
	                    System.out.println("Thread 1: Acquired lock2.");
	                }
	            }
	        });

	        // Thread 2
	        Thread thread2 = new Thread(() -> {
	            synchronized (lock2) {
	                System.out.println("Thread 2: Holding lock2...");
	                try {
	                    Thread.sleep(100); // Simulate some work
	                } catch (InterruptedException e) {
	                }
	                System.out.println("Thread 2: Waiting for lock1...");
	                synchronized (lock1) {
	                    System.out.println("Thread 2: Acquired lock1.");
	                }
	            }
	        });

	        // Start both threads
	        thread1.start();
	        thread2.start();
	    }

}
