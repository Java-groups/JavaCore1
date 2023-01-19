package HW13.practical_tasks.task2;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Task2 {
	
	/**
	 * For given collection calculate count, min, max, sum, for numbers and print all results
	 */
	
	static List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);

	public static void main(String[] args) {
		IntSummaryStatistics numbers = primes.stream().mapToInt((x) -> x).summaryStatistics();
		
		System.out.println("Count of all numbers : " + numbers.getCount());
		System.out.println("Mininum number in List : " + numbers.getMin());
		System.out.println("Highest number in List : " + numbers.getMax());
		System.out.println("Sum of all numbers : " + numbers.getSum());
	}
}
