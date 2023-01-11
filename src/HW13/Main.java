package HW13;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        task1
        List<String> list = Arrays.asList("bla", "", "simp", "", "second", "third", "sec", "blablabla");
        System.out.println("There is " + list.stream().filter(String::isEmpty).count() + " empty strings");

        list.stream().filter(string -> !string.isEmpty()).forEach(System.out::println);
//   or     System.out.println(list.stream().filter(string->!string.isEmpty()).collect(Collectors.toList()));

        System.out.println(list.stream().map(String::toUpperCase).collect(Collectors.joining(",")));
        System.out.println();
//        task2
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        System.out.println(primes.stream().mapToInt(x -> x).summaryStatistics().getSum());
//   or     System.out.println(primes.stream().reduce(0, Integer::sum));
        System.out.println(primes.stream().mapToInt(x->x).summaryStatistics().getMax());
        System.out.println(primes.stream().mapToInt(x->x).summaryStatistics().getMin());
        System.out.println(primes.stream().mapToInt(x->x).summaryStatistics().getCount());
    }
}
