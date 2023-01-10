package HW12.PracticalTasks;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void count(Integer[] array, Predicate<Integer> predicate) {
        for (Integer n : array) {
            if (predicate.test(n)) {
                System.out.print(n + " ");
            }
        }
    }

    public static void main(String[] args) {
//task1
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println(localDate.getDayOfWeek());
//task2
        TemporalAdjuster firstMondayOfMonth = TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY);
        System.out.println(localDate.with(firstMondayOfMonth));
//task3
        List<String> list = new ArrayList<>();
        list.add("Bob");
        list.add("Adam");
        list.add("Ken");
        list.add("Ann");
        System.out.println();
        list.sort(String::compareTo);
        System.out.println(list);
//task4
        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        count(array, n -> n > 5);


    }

}
