package HW4.task1_2_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//    Task #1
		System.out.print("Tell me the number of month and I'll tell you how many days it has: ");
		int id = Integer.parseInt(br.readLine());
		getDaysInMonth(id);
		
//	  Task #2
        System.out.print("\nEnter how many numbers you want in array? ");
        int a = Integer.parseInt(br.readLine());
        int[] numbers = getNumbersArray(a);

		getSum(numbers);
		
//    Task #3(a)
		getSecondPositiveNumberId(numbers);
		
//	  Task #3(b)
		getMinNumberPositionInArray(numbers);
		
//	  Task #3(c)
        getSumOfOddNumbers(numbers);

	}
    
	public static int getDaysInMonth(int id) throws NumberFormatException, IOException {
		
	    final int[] DAYSINMONTH = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		final String[] MONTH = {"January", "February", "March", "April", "May", "June",
				"July", "August", "September", "October", "November", "December"};
	
		int days = DAYSINMONTH[id - 1];
		System.out.println("There are " + days + " days in " + MONTH[id - 1] + "! Cool, isn't it?!");
		return days;
	}
	
	public static int getSum(int[] numbers) throws NumberFormatException, IOException {        
		int sum = 0;

		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		System.out.println("\nThe sum of first your all numbers is: " + sum + ".");
		return sum;
	}
	
	public static int getSecondPositiveNumberId(int[] numbers) throws NumberFormatException, IOException {
		List<Integer> positiveNumbers = new ArrayList<>();
		int j = 0;

		for (int i = 0; i < numbers.length; i++) {
		    if (numbers[i] > 0) {
		    	positiveNumbers.add(j, numbers[i]);
		    	++j;
		    }
		}
        int secondPositiveNumber = positiveNumbers.get(1);
		    System.out.println("\nYour positive numbers: " + positiveNumbers);
		    System.out.println("The second positive number in array is: " + secondPositiveNumber);
		    return secondPositiveNumber;
	}
	
	public static int getMinNumberPositionInArray(int[] numbers) throws NumberFormatException, IOException {
		int[] input = numbers.clone();
		
		Arrays.sort(input);
		int index = Arrays.binarySearch(numbers, input[0]);
		System.out.println("\nYour numbers: " + Arrays.toString(numbers));
		System.out.println("The minimum number in array is: " + input[0]);
		System.out.println("Position of element with value '"+ input[0] +"' is: " + index);
		return index;
	}
	
	public static int getSumOfOddNumbers(int[] numbers) throws NumberFormatException, IOException {
		
		int[] oddNumbers = new int[numbers.length];
		int sum = 0;
		int i = 0;
		int j = 0;
		
		for (i = 0; i < numbers.length; i++) {
		    if (numbers[i] > 0 && numbers[i] % 2 != 0) {
		    	oddNumbers[j] = numbers[i];
		    	++j;
		    }
		}
		System.out.println("\nYour numbers: " + Arrays.toString(numbers));
		
		for (int k = 0; k < oddNumbers.length; k++) { sum += oddNumbers[k];}
		System.out.println("The sum of all odd numbers is: " + sum);
		return sum;
	}
	
	
	public static int[] getNumbersArray(int n) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        if (n < 0) {n = n * (-1);}
        int numbers[] = new int[n];
        
		System.out.println("Enter your " + n + " positive or negative numbers: ");
		for (int j = 0; j < numbers.length; j++) {
		    int id = Integer.parseInt(br.readLine());
		    numbers[j] = id;
		}
		return numbers;
	}

}
