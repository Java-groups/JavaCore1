package HW13.practical_tasks.task1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
	
	/**
	 * Suppose you have next list.
	 * 	   Print how many empty strings are in this list;
	 * 	   Remove all empty Strings from list and print the result;
	 * 	   Convert String to upper case and Join them with comma. Print the result.
	 */
	
	static List<String> list = Arrays.asList("bla", "", "simp", "", "second", "third", "third", "sec", "blablabla");

	public static void main(String[] args) {
		System.out.println("There are " + countAllEmpty(list) + " empty strings in the list you entered\n");
		System.out.println(removeAllEmpty(list));
		System.out.println("\nMerged String: " + mergeAllAndTransformToUpperCase(list));
	}

	public static long countAllEmpty(List<String> list) {
		return list.stream().filter(string -> string.isEmpty()).count();
	}
	
	public static List<String> removeAllEmpty(List<String> list) {
		return list.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
	}
	
	public static String mergeAllAndTransformToUpperCase(List<String> list) {
		return list.stream().map(string -> string.toUpperCase()).collect(Collectors.joining(", "));
	}
}
