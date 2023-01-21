package HW14.practical_tasks.task2;

public class Main {
	
	/**
	 * Output two messages «Hello, world» and «Peace in the peace» 5 times each with the
	 * intervals of 2 seconds, and the second - 3 seconds. After printing messages, print the
	 * text «My name is …»
	 */

	public static void main(String[] args) {
		NewThread t1 = new NewThread(5, 2000, "Hello, World");
		NewThread t2 = new NewThread(5, 3000, "Peace in the peace");
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.getMessage();
		}
		
		System.out.println("My name is Nazar!");
	}
}
