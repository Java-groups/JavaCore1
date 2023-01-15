package Lesson14;

import java.util.Arrays;
import java.util.List;

public class Task_2 {
    public static void main(String[] args) {
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);

        long total = primes.stream()
                .count();
        int minNumber = primes.stream()
                .min(Integer::compare).get();
        int maxNumber = primes.stream()
                .max(Integer::compare).get();
        int sumOfPrimes = primes.stream()
                .reduce(0, (Integer::sum));

        System.out.println("The count of numbers is " + total);
        System.out.println("The minimum value is " + minNumber);
        System.out.println("The maximum value is " + maxNumber);
        System.out.println("The sum of numbers is " + sumOfPrimes);
    }
}
