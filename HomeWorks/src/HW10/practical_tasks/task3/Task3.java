package HW10.practical_tasks.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.*;

public class Task3 {
	private static final String USERNAME_PATTERN = "^[a-zA-Z0-9]([_](?![_])|[a-zA-Z0-9])"
			+ "{3,18}[a-zA-Z0-9]$";

	public static void main(String[] args) {
		/**
		 * The user name can be 3 to 15 characters of the Latin alphabet, numbers, and
		 * underscores. Using regular expressions implement checking the user name for
		 * validity. Input five names in the main method . Output a message to the
		 * console of the validation of each of the entered names.
		 */

		checkValid();

	}

	public static void checkValid() {
		List<String> userNames = addUserNames();
		String result = null;
		for (int i = 0; i < userNames.size(); i++) {
			if (validation(userNames.get(i)) == true) {
				result = "Username '" + userNames.get(i) + "' is valid!";
			} else {
				result = "Username '" + userNames.get(i) + "' is not valid!";
			}
			System.out.println(result);
		}

	}

	private static boolean validation(String userName) {
		final Pattern p = Pattern.compile(USERNAME_PATTERN);
		Matcher m = p.matcher(userName);

		boolean result;
		if (m.matches()) {
			result = true;
		} else {
			result = false;
		}
		m.reset();

		return result;
	}

	private static List<String> addUserNames() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("The user name can be 3 to 15 characters of the Latin alphabet, "
				+ "numbers, and underscores.\n");
		List<String> userNames = new ArrayList<>();

		System.out.print("\nHow many user names you want to check? ");
		int amount = 0;
		try {
			amount = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e1) {
			System.out.println("\nOOPS! SOMETHING WENT WRONG!\nIT'S NOT A NUMBER!");
			e1.printStackTrace();
		} catch (IOException e1) {
			System.out.println("\nOOPS! SOMETHING WENT WRONG!\n");
			e1.printStackTrace();
		}

		for (int i = 0; i < amount; i++) {
			System.out.print("Enter user name: ");
			String name = null;
			try {
				name = br.readLine();
			} catch (IOException e) {
				System.out.println("\nOOPS! SOMETHING WENT WRONG!\n");
				e.printStackTrace();
			}
			userNames.add(name);
		}
		return userNames;
	}

}
