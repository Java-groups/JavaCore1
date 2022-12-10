package HW4;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] numbers = {8, 2, -25, 2, -35};
        int min = numbers[0];
        int minIndex = 0;
        int product = 1;
        for (int i = 0;i < numbers.length;i++) {
            if (numbers[i] < min ) {
                min = numbers[i];
                minIndex = i;
            } if (numbers[i]%2 == 0) {
                product *= numbers[i];
            }
        }
//        int minIndex = Arrays.binarySearch(numbers, min ); it does not work if I use this line
        System.out.println("min is " + min + " on position " + minIndex);
        System.out.println("product of all even numbers is " + product);
    }
}
