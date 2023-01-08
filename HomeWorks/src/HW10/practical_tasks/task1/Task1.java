package HW10.practical_tasks.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

	public static void main(String[] args) {
		/**
		 * Enter the two variables of type String. Determine whether the first variable
		 * substring second. For example, if you typed «IT» and «IT Academy» you must
		 * receive true.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String text = "This sentence contains 'find me' string, and you can choose it to find!";
		System.out.print(text + "\nChoose your word: ");

		String key = null;
		boolean result = false;

		try {
			key = br.readLine();
		} catch (IOException e) {
			System.out.println("\nOOPS! SOMETHING WENT WRONG!\n");
			e.printStackTrace();
		}

		if (text.toLowerCase().matches("(.|\\s)*\\b" + key + "\\b(.|\\s)*")) {
			result = true;
		}

		System.out.println(result);
	}
}
