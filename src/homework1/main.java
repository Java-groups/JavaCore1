
package homework1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {

	public static void main(String[] args) throws IOException {

		task1();
		task2();
		task3();
	}

	public static void task1() throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter radius of Flower bed");
		double radius = Double.parseDouble(read.readLine());
		double perimeter = 2 * radius * Math.PI;
		double s = Math.PI * (radius * radius);
		System.out.println("Perimeter of Flower bed is " + perimeter);
		System.out.println("Square of Flower bed is " + s);

	}

	public static void task2() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("What is your name?");
		String name = br.readLine();
		System.out.println("My name is " + name);
		System.out.println("Where do you live?");
		String address = br.readLine();
		System.out.println("I live in " + address);
		System.out.println("Let's double check: your name is " + name + "; You live in " + address + ".");

	}

	public static void task3() throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter # of calls from the first country");
		double c1 = Double.parseDouble(br.readLine());
		System.out.println("How much time did it take?");
		double t1 = Double.parseDouble(br.readLine());
		double time1 = c1 * t1;
		System.out.println("You spoke: " + time1 + " mins");
		System.out.println("Enter # of calls from the second country");
		double c2 = Double.parseDouble(br.readLine());
		System.out.println("How much time did it take?");
		double t2 = Double.parseDouble(br.readLine());
		double time2 = c2 * t2;
		System.out.println("You spoke: " + time2 + " mins");
		System.out.println("Enter # of calls from the third country");
		double c3 = Double.parseDouble(br.readLine());
		System.out.println("How much time did it take?");
		double t3 = Double.parseDouble(br.readLine());
		double time3 = c3 * t3;
		System.out.println("You spoke: " + time3 + " mins");
		double allTime = time1 + time2 + time3;
		System.out.println("Overall you had been speaking for: " + allTime + " mins");

	}

}
