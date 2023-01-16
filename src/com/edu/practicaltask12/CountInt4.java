package com.edu.practicaltask12;
/*
       Create array Integers which has 10 elements, create method count() that takes an array
        of integers as the first parameter and functional interface as the second parameter,
        that functional interface works with integers and defines a condition. Method count()
        return count of elements in array that satisfy the condition defined by the second
        argument.
 */

import java.util.function.Predicate;

public class CountInt4 {
    public static void main(String[] args) {
        Integer[] numbers = {32, 2, 8, 6, 56, 23, 98, 5, 43, 10};

        System.out.println("Original array:");
        count(numbers, n -> true);
        System.out.println("\nEven numbers from original array:");
        count(numbers, n -> n % 2 == 0);
        System.out.println("\nNumbers from original array in the range 2 - 25:");
        count(numbers, n -> (n > 2) & (n < 25));

    }

    public static Integer count(Integer[] numbers, Predicate<Integer> predicate) {
        Integer n = 0;
        for (Integer i : numbers) {
            if (predicate.test(i)) {
                System.out.print(i + ", ");
                n++;
            }
        }
        return n;
    }
}
