package arthurmkrtchian.javaCore.HW13.streamAPI.practicalTasks.practicalTask1;


//        1. Suppose you have next list
//        List<String> list = Arrays.asList("bla", "", "simp",
//        "", "second", "third", "third", "sec", "blablabla");
//        • Print how many empty strings are in this list
//        • Remove all empty Strings from list and print the result
//        • Convert String to uppercase and Join them with coma. Print the result


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("bla", "", "simp",
        "", "second", "third", "third", "sec", "blablabla");


        System.out.printf("There is %d empty elements in the list\n",
                list.stream().filter(s -> s.length() == 0).count());

        System.out.println("\nList items except empty: ");
        list = list.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());
        System.out.println(list.toString());

        System.out.println("\nConverted and joined with coma list items:");
        System.out.println(list.stream().map(String::toUpperCase).collect(Collectors.joining(",")));
    }
}
