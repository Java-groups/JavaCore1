package HW13;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class PracticalTask {
    public static void main(String[] args) {
        System.out.println("Start of the first practical task");
        List<String> list = Arrays.asList("bla", "", "simp",
                "", "second", "third", "third", "sec", "blablabla");
        System.out.println(list);
        long count = list.stream()
                .filter(string -> string.isEmpty())
                .count();
        System.out.println("Empty Count: " + count);

        List<String> filtered = list.stream()
                .filter(x -> !x.isEmpty())
                .collect(Collectors.toList());
        filtered.forEach(System.out::println);
        String listString = list.stream().map(Object::toString)
                .collect(Collectors.joining(", "));
        System.out.println(listString.toUpperCase());
        System.out.println("Start of the second practical task");
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        IntSummaryStatistics stats = primes.stream()
                .mapToInt((x) -> x).summaryStatistics();
        System.out.println("Max number in List: " + stats.getMax());
        System.out.println("Min number in List: " + stats.getMin());
        System.out.println("Sum of all numbers: " + stats.getSum());
        System.out.println("Average of all numbers: " + stats.getAverage());




    }
}
