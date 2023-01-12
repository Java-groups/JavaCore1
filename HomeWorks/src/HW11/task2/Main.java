package HW11.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	private static int a = 0;
	private static int b = 0;

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Number n = new Number();

		System.out.print("Enter start number: ");

		try {
			a = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			throw new NumberFormatException("\nYour input needs to be a number!\n");
		} catch (IOException e) {
			System.out.println("\nOOPS! SOMETHING WENT WRONG!\n");
			e.printStackTrace();
		}

		System.out.print("Enter end number: ");

		try {
			b = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			throw new NumberFormatException("\nYour input needs to be a number!\n");
		} catch (IOException e) {
			System.out.println("\nOOPS! SOMETHING WENT WRONG!\n");
			e.printStackTrace();
		}
		if (a > b) {
			throw new IllegalArgumentException("'Start number' can't be bigger than 'end number'!");
		}
		int result = n.readNumber(a, b);

		System.out.println("Your number is: " + result);

	}

}
