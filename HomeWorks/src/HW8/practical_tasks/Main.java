package HW8.practical_tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws IOException {
		PracticalCollection collection = new PracticalCollection();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("How many random numbers you want to add in array?");
		int quantity = Integer.parseInt(br.readLine());

		collection.randomNumbers(quantity);
		System.out.println("\n=========== myCollection: ===========\n" + collection.getMyCollection());

		System.out.println("\nFind and save in list all positions of element more than: ");
		int number = Integer.parseInt(br.readLine());

		collection.findPosition(number);
		System.out.println("\n=========== newCollection: ===========\n" + collection.getNewCollection());

		System.out.println("\nRemove from collection elements, which are greater then: ");
		int largestNumber = Integer.parseInt(br.readLine());

		collection.removeElements(largestNumber);
		System.out.println("\n=========== AFTER REMOVE: ===========\n" + collection.getMyCollection());

		System.out.println("\nHow many elements you want to insert? ");
		int numbers = Integer.parseInt(br.readLine());
		collection.insertInPosition(numbers);
		System.out.println("\n=========== AFTER INSERT: ===========\n" + collection.getMyCollection());

		Collections.sort(collection.getMyCollection());
		System.out.println("\n=========== AFTER SORT: ===========\n" + collection.getMyCollection());

	}

}
