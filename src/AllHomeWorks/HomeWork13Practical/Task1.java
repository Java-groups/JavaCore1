package AllHomeWorks.HomeWork13Practical;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void doTask(BufferedReader br) throws IOException {
        List<String> lists = Arrays.asList("bla", "", "simp", "", "second", "third", "third", "sec", "blablabla");
        List<String> listWithoutEmpty = lists
                .stream()
                .filter(list -> !list.isEmpty())
                .toList();
        int emptyCount = lists.size() - listWithoutEmpty.size();
        System.out.printf("\nIn this list are %d empty strings", emptyCount);
        System.out.printf("\nList without empty strings: %s", listWithoutEmpty);
        String stringUppercaseJoined = listWithoutEmpty
                .stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining(","));

        System.out.printf("\nList converts to upper case: %s\n", stringUppercaseJoined);
    }
}
