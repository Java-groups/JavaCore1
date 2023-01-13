package PracticalTask12_Functional_Data_Time;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Task4 {
// Create array Integers which has 10 elements,
// create method count() that takes an array of integers as the first parameter and
// functional interface as the second parameter, that functional interface works with
// integers and defines a condition.
// Method count() return count of elements in array that satisfy the condition defined by the second argument.

    public static void main(String[] args) {

        List<Integer> arrayInt = Arrays.asList(2, 4, 56, 7, 5, 23, 51, 48, 8, 15);

        System.out.println("\nNumber series all: ");
        int numberAllElements = count(arrayInt, i -> true);
        System.out.println("\nThe number of all elements - " + numberAllElements + " elements");

        System.out.println("\nNumber series over 25: ");
        int numberOver25 = count(arrayInt, i -> i > 25);
        System.out.println("\nNumber of numbers greater than 25 - " + numberOver25 + " elements");

        System.out.println("\nNumber series not even: ");
        int notEvenNumbers = count(arrayInt, i -> i % 2 > 0);
        System.out.println("\nNot even numbers - " + notEvenNumbers + " elements");

        System.out.println("\nNumber series multiples of 5: ");
        int multiplesOf5 = count(arrayInt, i -> i % 5 == 0);
        System.out.println("\nMultiples of 5 - " + multiplesOf5 + " elements");

    }

    public static int count(List<Integer> list, Predicate<Integer> predicate) {
        int n = 0;
        for (Integer i : list) {
            if (predicate.test(i)) {
                System.out.print(i + " ");
                n++;
            }
        }
        return n;
    }
}
