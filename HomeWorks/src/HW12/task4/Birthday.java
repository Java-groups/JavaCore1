package HW12.task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class Birthday {
	private final static LocalDate birthday = LocalDate.of(1992, 03, 28);

	/**
	 * Create variable LocalDate birthday and set to that variable date your
	 * birthday. Create method that take as a parameter object LocalDate and print
	 * the day of the week and what was the day of the week after 6 months and what
	 * was the day of the week after 12 months.
	 */

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int months = 0;

		System.out.println("My birthday: " + birthday + ".\nDay of the week: " + dayOfTheWeek(birthday));
		try {
			System.out.print("\nEnter how many months you want to add to birthday: ");
			months = Integer.parseInt(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}

		LocalDate newDate = birthday.plusMonths(months);
		System.out.println("\nDate: " + newDate + ".\nDay of the week: " + dayOfTheWeek(newDate));

	}

	public static DayOfWeek dayOfTheWeek(LocalDate date) {
		return LocalDate.from(date).getDayOfWeek();
	}
}
