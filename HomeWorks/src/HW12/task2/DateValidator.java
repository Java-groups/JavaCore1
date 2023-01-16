package HW12.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateValidator {
	
	/**
	 *  Create method to validate date according to format "mm.dd.yy"
	 */

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String date = null;
		try {
			System.out.println("Enter valid date (MM.DD.YYYY): ");
			date = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		isValid(date);
	}

	public static void isValid(String date) {
		Pattern pattern = Pattern.compile("^(1[0-2]|0[1-9]).(3[01]|[12][0-9]|0[1-9]).[0-9]{4}$");
		Matcher matcher = pattern.matcher(date);

		boolean bool = matcher.matches();
		if (bool) {
			System.out.println("Date is valid");
		} else
			System.out.println("Date is not valid");
	}
}
