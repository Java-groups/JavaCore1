package PracticalTask13_Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("bla", "", "simp", "", "second", "third", "third", "sec", "blablabla");

        long countIsEmpty = list.stream()
                .filter(string -> string.isEmpty())
                .count();
        System.out.println("\n1) Number of empty elements - " + countIsEmpty);

        List<String> listIsNotEmpty = list.stream()
                .filter(string -> !string.isEmpty())
                .collect(Collectors.toList());
        System.out.println("\n2) New list, is not empty - " + listIsNotEmpty);

        List<String> listUpper;
        listUpper = listIsNotEmpty.stream()
                .map(element -> element.toUpperCase().concat(","))
                .collect(Collectors.toList());
        System.out.println("\n3) New list with Upper + char ',' - " + listUpper);
        // .reduce(0,(subtotal, element) -> element + ",")
    }
}
