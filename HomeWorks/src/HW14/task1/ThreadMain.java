package HW14.task1;

public class ThreadMain {
	
	/**
	 * Run three threads and output there different messages for 5 times. The third thread
	 * supposed to start after finishing working of the two previous threads.
	 */

	public static void main(String[] args) {
		MyThread t1 = new MyThread(5, "First thread");
		MyThread t2 = new MyThread(5, "Second thread");
		MyThread t3 = new MyThread(5, "Third thread");

		t1.start();		
		t2.start();
			
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.getMessage();
		}
		
		t3.start();
		try {
			t3.join();
		} catch (InterruptedException e1) {
			e1.getMessage();
		}
	}

}
