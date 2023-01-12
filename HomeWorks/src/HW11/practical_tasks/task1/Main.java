package HW11.practical_tasks.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	private static int a;
	private static int b;

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Rectangle rectangle = new Rectangle();

		System.out.println("Enter width of your rectangle: ");
		try {
			a = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			throw new NumberFormatException("\nYour input needs to be a number!\n");
		} catch (IOException e) {
			System.out.println("\nOOPS! SOMETHING WENT WRONG!\n");
			e.printStackTrace();
		}

		System.out.println("Enter height of your rectangle: ");
		try {
			b = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			throw new NumberFormatException("\nYour input needs to be a number!\n");
		} catch (IOException e) {
			System.out.println("\nOOPS! SOMETHING WENT WRONG!\n");
			e.printStackTrace();
		}

		int c = rectangle.squareRectangle(a, b);
		if (c != 0) {
			System.out.println("Your rectangle squear is: " + c);
		}

	}
}
