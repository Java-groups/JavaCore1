package HW14.task3;

public class Threads extends Thread {
	final static String first = new String();
	final static String second = new String();

	public static void main(String[] args) {
		t1.start();

		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	static Thread t1 = new Thread() {

		public void run() {
			System.out.println("Thread - 1 started...");
			t2.start();
			System.out.println("Done...");
		}
	};

	static Thread t2 = new Thread() {

		public void run() {
			System.out.println("\nThread - 2 started...");
			int i = 0;
			while (i < 3) {
				System.out.println("Thread number two");
				i++;
			}
			System.out.println("Done...");
			t3.start();
		}
	};

	static Thread t3 = new Thread() {

		public void run() {
			System.out.println("\nThread - 3 started...");
			int i = 0;
			while (i < 5) {
				System.out.println("Thread number three");
				i++;
			}
			System.out.println("Done...");

		}
	};
}