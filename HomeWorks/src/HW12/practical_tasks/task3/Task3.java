package HW12.practical_tasks.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {

	/**
	 * Write a method for sorting list of Strings using Java 8
	 */

	public static void main(String[] args) {
		List<String> listString = new ArrayList<>(Arrays.asList("Nazar", "Viktoria", "Andrij", "Olha"));
		List<Integer> listInteger = new ArrayList<>(Arrays.asList(4, 1, 2, 3, 7, 5, 6));

		System.out.println(listString);
		System.out.println(sortList(listString));

		System.out.println(listInteger);
		System.out.println(sortList(listInteger));

	}

	public static <T> List<T> sortList(List<T> list) {
		List<T> sortedlist = list.stream().sorted().collect(Collectors.toList());
		return sortedlist;
	}

}
