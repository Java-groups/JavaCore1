package HW11.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	private static double a;
	private static double b;
	private static double d;

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Divide divide = new Divide();

		System.out.println("Enter first number: ");
		try {
			a = Double.parseDouble(br.readLine());
		} catch (NumberFormatException e) {
			throw new NumberFormatException("\nYour input needs to be a number!\n");
		} catch (IOException e) {
			System.out.println("\nOOPS! SOMETHING WENT WRONG!\n");
			e.printStackTrace();
		}

		System.out.println("Enter second number: ");
		try {
			b = Double.parseDouble(br.readLine());
		} catch (NumberFormatException e) {
			throw new NumberFormatException("\nYour input needs to be a number!\n");
		} catch (IOException e) {
			System.out.println("\nOOPS! SOMETHING WENT WRONG!\n");
			e.printStackTrace();
		}

		d = divide.div(a, b);
		System.out.println("Your answer is: " + d);
	}

}
