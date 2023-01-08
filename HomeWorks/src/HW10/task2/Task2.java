package HW10.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {

	public static void main(String[] args) {
		/**
		 * Enter a sentence that contains the words between more than one space. Convert
		 * all spaces, consecutive, one. For example, if we introduce the sentence "I am
		 * learning Java Core», we have to get the "I'm learning Java Core»
		 */
		removeSpaces(inputText());

	}

	private static String inputText() {
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

	public static void removeSpaces(String text) {
		String withoutSpaces = text.replaceAll("\\s+", " ");
		System.out.println(withoutSpaces);
	}

}
