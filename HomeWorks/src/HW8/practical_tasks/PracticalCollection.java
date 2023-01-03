package HW8.practical_tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PracticalCollection {
	private static List<Integer> myCollection;
	private static List<Integer> newCollection;

	public List<Integer> getMyCollection() {
		return myCollection;
	}

	public void setMyCollection(List<Integer> myCollection) {
		PracticalCollection.myCollection = myCollection;
	}

	public List<Integer> getNewCollection() {
		return newCollection;
	}

	public void setNewCollection(List<Integer> newCollection) {
		PracticalCollection.newCollection = newCollection;
	}

	public List<Integer> randomNumbers(int quantity) {
		myCollection = new ArrayList<>();
		Random random = new Random();
		int r;
		for (int i = 0; i < quantity; i++) {
			r = random.nextInt(25);
			myCollection.add(r);
		}
		return myCollection;
	}

	public List<Integer> findPosition(int number) {
		newCollection = new ArrayList<>();
		for (int i = 0; i < myCollection.size(); i++)
			if (myCollection.get(i) > number) {
				newCollection.add(i);
			}
		return newCollection;
	}

	public List<Integer> removeElements(int largestNumber) {
		for (int i = 0; i < myCollection.size(); i++)
			if (myCollection.get(i) > largestNumber) {
				myCollection.remove(i);
			}
		return myCollection;
	}

	public List<Integer> insertInPosition(int numbers) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i = 0;
		while (i < numbers) {
			System.out.print("\nEnter the position in the list where you want to insert a number: ");

			try {
				int position = Integer.parseInt(br.readLine());
				if (position > myCollection.size()) {
					System.out.println("\nINDEX '" + position + "' IS OUT OF BOUND!\nTRY AGAIN!");
					continue;
				} else {
					System.out.print("\nEnter number you want to add in position " + position + ": ");
					int element = Integer.parseInt(br.readLine());
					myCollection.add(position, element);
					i++;
				}
			} catch (NumberFormatException e) {
				System.out.println("\nYOU NEED TO ENTER AN INTEGER!\nTRY AGAIN!");
				continue;
			}
		}
		return myCollection;
	}
}
