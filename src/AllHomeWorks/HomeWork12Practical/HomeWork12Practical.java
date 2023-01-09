package AllHomeWorks.HomeWork12Practical;

import java.io.BufferedReader;
import java.io.IOException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


import static java.time.temporal.TemporalAdjusters.firstInMonth;

public class HomeWork12Practical {
    public static void doTask(BufferedReader br) throws IOException {
        LocalDate now = LocalDate.now();
        LocalDate firstMonday = now.with(firstInMonth(DayOfWeek.MONDAY));
        DayOfWeek dayOfWeek = DayOfWeek.from(now);
        System.out.println("\nA day of week : " + dayOfWeek);
        System.out.println("\nA date of first Monday for current month: " + firstMonday);


        List<String> unsorted = Arrays.asList("Lena", "Valya", "Roma", "Tanya", "Rima", "Kolya");
        List<String> sorted = unsorted.stream()
                .sorted().toList();

        System.out.println("\n" +sorted);

        List<Integer> elementsArray = Arrays.asList(10, 20, 33, 44, 5, 8, 91, 88, 19, 7);

        System.out.println("Count elements that satisfies condition: " + count(elementsArray, number -> number > 10));


    }
    public static int count(List<Integer> intList, Predicate<? super Integer> condition) {
        return   intList
                .stream()
                .filter(condition)
                .toList()
                .size();
    }
}
