package HW14.task2;

public class Deadlock extends Thread {

	/**
	 * Cause a deadlock. Organize the expectations of ending a thread in main(), and
	 * make the end of the method main() in this thread.
	 */

	final static String first = new String();
	final static String second = new String();

	public static void main(String[] args) {
		t1.start();
		
		synchronized (second) {
		    try {
		    	Thread.sleep(1000);
				System.out.println("Thread t1: " + t1.getState());
		    } catch (InterruptedException e) {
		    	e.getMessage();
		    }
		    synchronized (first) {
		    	System.out.println("Succes main!");
		    }
		}
	}

	static Thread t1 = new Thread() {
		
		public void run() {
			synchronized (first) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.getMessage();
				}
				synchronized (second) {
					System.out.println("Succes T1!");
				}
			}
		}
	};
}
