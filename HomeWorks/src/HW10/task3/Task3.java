package HW10.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
	private static final String US_DOLLAR_PATTERN = "\\$\\d+([.][0-9]{0,2})?";

	public static void main(String[] args) {
		/**
		 * Implement a pattern for US currency: the first symbol "$", then any number of
		 * digits, dot and two digits after the dot. Enter the text from the console
		 * that contains several occurrences of US currency. Display all occurrences on
		 * the screen.
		 */

		dollarOccurrences(inputText());
	}

	public static void dollarOccurrences(String text) {
		System.out.println(text);
		Pattern p = Pattern.compile(US_DOLLAR_PATTERN);
		Matcher m = p.matcher(text);
		System.out.println("\nAll occurrences:");

		while (m.find()) {
			System.out.print(text.substring(m.start(), m.end()) + "\n");
		}
	}

	public static String inputText() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your sentence which contains the words with more than one space between: ");

		String text = null;
		try {
			text = br.readLine();
		} catch (IOException e) {
			System.out.println("\nOOPS! SOMETHING WENT WRONG!\n");
			e.printStackTrace();
		}
		return text;
	}
}
