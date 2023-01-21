package HW14.practical_tasks.task1;

public class Task1 {
	
	/**
	 * Output text «I study Java» 10 times with the intervals of one second
	 * (Thread.sleep(1000);).
	 */

	public static void main(String[] args) {
		multiPrint("I study Java", 10);
	}

	public static void multiPrint(String message, int times) {
		int i = 1;
		while (i < times + 1)
			try {
				System.out.println(message + " " + i);
				Thread.sleep(1000);
				i++;
			} catch (InterruptedException e) {
				e.getMessage();
			}
	}
}
