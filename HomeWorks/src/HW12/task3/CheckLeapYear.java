package HW12.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.*;

public class CheckLeapYear {

	/**
	 * Create method which take year as a parameter and return true if year is a
	 * leap
	 */

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int year = 0;

		try {
			System.out.print("Enter year you want to check: ");
			year = Integer.parseInt(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(isLeap(year));
	}

	public static boolean isLeap(int year) {
		Year y = Year.of(year);
		boolean result = y.isLeap();
		return result;
	}
}
