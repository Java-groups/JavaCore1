package homework3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Conditionals {

	public static void main(String[] args) throws NumberFormatException, IOException {
	
		System.out.println(floatCheck());
		max();
		min();
		errorsTypes();
	}

	public static boolean floatCheck() throws NumberFormatException, IOException {

		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		System.out.println ("Let's check if your numbers are in range [-5, 5]");
		System.out.println("Enter 3 numbers");
		float number1 = Float.parseFloat(read.readLine());
		float number2 = Float.parseFloat(read.readLine());
		float number3 = Float.parseFloat(read.readLine());

		if ((number1 >= -5 && number1 <= 5) && (number2 >= -5 && number2 <= 5) && (number3 >= -5 && number3 <= 5)) {

			return true;

		}
		return false;

	}

	public static void max() throws NumberFormatException, IOException {

		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		System.out.println ("Let's find the max number");
		System.out.println("Enter 3 numbers");
		int number1 = Integer.parseInt(read.readLine());
		int number2 = Integer.parseInt(read.readLine());
		int number3 = Integer.parseInt(read.readLine());

		int max = 0;
		if (number1 > number2 && number1 > number3) {
			max = number1;
		} else if (number2 > number1 && number2 > number3) {
			max = number2;
		} else
			max = number3;
		System.out.println("Max number is " + max);
	}

	public static void min() throws NumberFormatException, IOException {

		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Let's find the min number");
		System.out.println("Enter 3 numbers");
		int number1 = Integer.parseInt(read.readLine());
		int number2 = Integer.parseInt(read.readLine());
		int number3 = Integer.parseInt(read.readLine());

		int min = 0;
		if (number1 < number2 && number1 < number3) {
			min = number1;
		} else if (number2 < number1 && number2 < number3) {
			min = number2;
		} else
			min = number3;
		System.out.println("Min number is " + min);
	}


	public enum httpsErrors {

		ERROR400, ERROR401, ERROR402, ERROR403;

	}
	
	public static void errorsTypes() throws IOException {
	
	BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Write the number of your error: ERROR400, ERROR401, ERROR402, ERROR403");
	String error = read.readLine();
	
	//String number = num.readLine();
	switch (error.toUpperCase()) {
	case "ERROR400":
		System.out.println("Bad Request");
		break;
	case "ERROR401":
		System.out.println(" Unauthorized");
		break;
	case "ERROR402":
		System.out.println("Payment Required");
		break;
	case "ERROR403":
		System.out.println("Forbidden");
		break;
	default: System.out.println("Unknown error");
	}
	
}
}



