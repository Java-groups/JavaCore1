package HW12.practical_tasks.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Task4 {

	/**
	 * Create array Integers which has 10 elements, create method count() that takes
	 * an array of integers as the first parameter and functional interface as the
	 * second parameter, that functional interface works with integers and defines a
	 * condition. Method count() return count of elements in array that satisfy the
	 * condition defined by the second argument.
	 */

	public static void main(String[] args) {
		List<Integer> listInteger = new ArrayList<>(Arrays.asList(4, 1, 2, 3, 7, 5, 6, 9, 8, 0));
		System.out.println("List of Integers:\n" + listInteger);

		System.out.print("\nCount all numbers: ");
		System.out.println(count(listInteger, n -> true));

		System.out.print("\nCount even numbers: ");
		System.out.println(count(listInteger, n -> n % 2 == 0));

		System.out.print("\nCount numbers greater than 3: ");
		System.out.println(count(listInteger, n -> n > 3));

	}

	public static <T> int count(List<T> list, Predicate<T> predicate) {
		int i = 0;
		for (T n : list) {
			if (predicate.test(n)) {
				i++;
			}
		}
		return i;
	}

}
