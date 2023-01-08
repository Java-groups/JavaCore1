package HW10.practical_tasks.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {

	public static void main(String[] args) {
		/**
		 * Enter surname, name and patronymic on the console as a variable of type String. Output
		 * on the console:
		 *    • surnames and initials
		 *    • name
		 *    • name, middle name and last name
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter surname, name and patronymic: ");

		String text = null;
		try {
			text = br.readLine();
		} catch (IOException e) {
			System.out.println("\nOOPS! SOMETHING WENT WRONG!\n");
			e.printStackTrace();
		}
        
		String[] splitted = text.split(" ");
		
		System.out.println("\nSurname and initials: " + splitted[0] + " " + splitted[1].charAt(0) + ". " + splitted[2].charAt(0) + ".");
		System.out.println("Name: " + splitted[1]);
		System.out.println("Name, middle name and last name: " + splitted[1] + " " + splitted[2] + " " + splitted[0]);
	}

}
