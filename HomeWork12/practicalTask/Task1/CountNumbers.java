package edu.homeworks.hw12.practicalTask.Task1;

import java.util.function.Predicate;

public class CountNumbers {

    public void countNumbers(int[] arr, Predicate<Integer> integerPredicate){
        for (int m: arr) {
            if(integerPredicate.test(m)){
                System.out.println(m);
            }
        }
    }
}
