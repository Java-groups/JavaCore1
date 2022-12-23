package HW4.practical_tasks;

public class Main {
	static int[] numbers = {23, -11, 27, 31, -4, 17, 9, 43, -18, 5};

	public static void main(String[] args) {
		
	    getMax(numbers);
	    getSum(numbers);
	    getAmount(numbers);
	    getCompare(numbers);
	}
		
	public static int getMax(int[] num) {
		
        int max = num[0];
        int imax = 0;
        int i = 0;
        
        while(i < num.length) {
        	if (num[i] > max) {
        		max = num[i];
        		imax = i;
        	}
        	i++;
        }
        System.out.println("The bigest number is: " + max + "\n");
        return max;
	}
	
	public static int getSum(int[] num) {
		
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		System.out.println("The sum of all positive numbers: " + sum + "\n");
		return sum;
	}
	
	public static int getAmount (int[] num) {
		
		int amount = 0;
		
		for (int a: num) {
			if (a < 0) {
				amount ++;
			}
		}
		System.out.println("The Amount of all negative numbers is: " + amount + "\n");
		return amount;
	}
	
	public static boolean getCompare (int[] num) {
		
		int positive = 0;
		int negative = 0;
		
		for (int c: num) {
			if (c > 0) {
				positive ++;
			} else negative ++;
		}
		if (positive > negative) {
			System.out.println("There are more positive numbers in this array.");
			return true;
		} else {
			System.out.println("There are more negative numbers in this array");
			return false;
		}
		

	}

}
