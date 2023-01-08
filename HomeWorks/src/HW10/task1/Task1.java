package HW10.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

	public static void main(String[] args) {
		/**
		 * Enter in the console sentence of five words. • display the longest word in
		 * the sentence; • determine the number of its letters ; • bring the second word
		 * in reverse order.
		 */

		String[] sentense = inputSentense();
		findLargestWord(sentense);
		makeWordReverced(sentense);
	}

	public static void findLargestWord(String[] sentense) {
		int size = 0;
		int bigestWordIndex = 0;
		for (int i = 0; i < sentense.length; i++) {
			if (sentense[i].length() > size) {
				size = sentense[i].length();
				bigestWordIndex = i;
			}
		}
		System.out.println(
				"\nThe bigest word in your sentence is " + sentense[bigestWordIndex] + ", it's length is " + size);
	}

	public static String makeWordReverced(String[] sentense) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Which word do you want to reverse?");
		int index = 0;
		try {
			index = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			System.out.println("\nOOPS! SOMETHING WENT WRONG!\nIT'S NOT A NUMBER!");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("\nOOPS! SOMETHING WENT WRONG!\n");
			e.printStackTrace();
		}
		String word = sentense[index - 1];

		word = new StringBuilder(word).reverse().toString();
		System.out.println("\nThe '" + index + "' word in the sentence in reverse order is:  \"" + word + "\"");
		return word;
	}

	private static String[] inputSentense() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter your sentense: ");

		String sentence = null;
		try {
			sentence = br.readLine();
		} catch (IOException e) {
			System.out.println("\nOOPS! SOMETHING WENT WRONG!\n");
			e.printStackTrace();
		}
		String[] splitted = sentence.split(" ");
		return splitted;
	}

}
