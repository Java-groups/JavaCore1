package HW8.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Main {
	private static List<Integer> myCollection;

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		TaskCollection tc = new TaskCollection();

//    Declare collection myCollection of 10 integers and fill it (from 
//    the console or random)
		System.out.println("\nHow many elements do you want in list?");
		int e = 0;
		try {
			e = Integer.parseInt(br.readLine());
		} catch (NumberFormatException | IOException e1) {
			System.out.println("\nOOPS! SOMETHING WENT WRONG!\n");
			e1.printStackTrace();
		}
		myCollection = tc.getRandomList(e);

//    Swap the maximum and minimum elements in the list.
		System.out.println("============ SWAP MIN/MAX ============\n");
		System.out.println(myCollection);
		System.out.println(tc.swapMinMax(myCollection));

//    Insert a random three-digit number before the first negative 
//    element of the list.
		System.out.println("\n============ AFTER INSERT ============\n");
		System.out.println(tc.insertToList(myCollection, 3));

//    Insert a zero between all neighboring elements collection myCollection
//    with different signs
		System.out.println("\n========== AFTER INSERT '0' ==========\n");
		System.out.println(tc.insertZero(myCollection));

//    Copy the first k elements of the myCollection to the list1, in direct order, and 
//    the rest to the list2 in reverse order
		System.out.println("\n============ DEVIDED LIST ============\n");
		System.out.println("How many elements do you want to divide into the first list?");
		int k = 0;
		try {
			k = Integer.parseInt(br.readLine());
		} catch (NumberFormatException | IOException e1) {
			System.out.println("\nOOPS! SOMETHING WENT WRONG!\n");
			e1.printStackTrace();
		}
		System.out.println("List: " + myCollection + "\n");
		tc.divideList(myCollection, k);

//    In a list myCollection remove the last even element (if there are even elements in 
//    the list). If there is no such element, display a message.
		System.out.println("\n========== REMOVE LAST EVEN ==========\n");
		System.out.println("Before: " + myCollection);
		tc.removeLastEven(myCollection);
		System.out.println("After:  " + myCollection);

//    Remove from the list myCollection the element following the first minimum. If the 
//    minimum element is the last one, nothing needs to be removed.
		System.out.println("\n====== REMOVE ELEMENT AFTER MIN ======\n");
		System.out.println("Before: " + myCollection);
		tc.removeLastMin(myCollection);
		System.out.println("After:  " + myCollection);
	}
}
