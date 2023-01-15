package Lesson14;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task_1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("bla", "", "simp", "", "second", "third", "third", "sec", "blablabla");
        long count = list.stream()
                .filter(String::isEmpty)
                .count();
        System.out.println("The count of empty strings = " + count);

        List<String> filtered = list.stream()
                .filter(string -> !string.isEmpty())
                .collect(Collectors.toList());
        System.out.println("Filtered List: " + filtered);

        String result = list.stream()
                .filter(string -> !string.isEmpty())
                .map(String::toUpperCase)
                .collect(Collectors.joining(","));

        System.out.println(result);


    }
}
