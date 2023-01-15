package edu.homeworks.hw13.practicalTask;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;


public class Main {
    public static void main(String[] args) {
        //Task 1
        List<String> list = Arrays.asList("bla", "", "simp",
                "", "second", "third", "third", "sec", "blablabla");
        System.out.println(list
                .stream()
                .filter(element -> element.isEmpty())
                .count());

        System.out.println(list
                .stream()
                .filter(element -> !element.isEmpty())
                .collect(Collectors.toUnmodifiableList()));

        System.out.println(list
                .stream()
                .map(element -> element.toUpperCase()) // String::toUpperCase
                .filter(element -> !element.isEmpty())
                .collect(Collectors.joining(",")));

        //Task 2
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        System.out.println(primes
                .stream()
                .count());

        System.out.println(primes
                .stream()
                .min(Comparator.comparing(Integer::valueOf)));

        System.out.println(primes
                .stream()
                .max(Comparator.comparing(Integer::valueOf)));

        System.out.println(primes
                .stream()
                .reduce(Integer::sum));

    }
}
