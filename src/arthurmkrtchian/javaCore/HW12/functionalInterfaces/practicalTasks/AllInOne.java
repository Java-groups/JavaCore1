package arthurmkrtchian.javaCore.HW12.functionalInterfaces.practicalTasks;

//        • Show which today is a day of a week
//        • Show a date of first Monday for current month
//        • Write a method for sorting list of Strings using Java 8
//        • Create array Integers which has 10 elements, create method count() that takes an array
//        of integers as the first parameter and functional interface as the second parameter,
//        that functional interface works with integers and defines a condition. Method count()
//        return count of elements in array that satisfy the condition defined by the second
//        argument.


import helper.StringUtils;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AllInOne {

    //  • Show which today is a day of a week
    public static class DayOfWeekToday {
        public static void main(String[] args) {
            DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
            System.out.println("Today is " + StringUtils.capitalize(dayOfWeek.toString()));
        }
    }

    //  • Show a date of first Monday for current month
    public static class DisplayFirstMonInMonth {
        public static void main(String[] args) {
            TemporalAdjuster firstMonInMonth = TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY);
            DateTimeFormatter format = DateTimeFormatter.ofPattern("dd MMMM yyyy");
            System.out.println(LocalDate.now().with(firstMonInMonth).format(format) + "р.\n");
        }
    }

    //  • Write a method for sorting list of Strings using Java 8
    public static class Sorting {
        public static void main(String[] args) {

            List<String> list = Arrays.asList("Black", "Green", "Yellow", "Grey", "Red", "Blue");
            System.out.println("Unsorted list: " + list);
            System.out.println("Sorted list: " + sortList(list));
        }

        public static List<String> sortList(List<String> list) {
            return list.stream().sorted().collect(Collectors.toList());
        }
    }

    //  • Create array Integers which has 10 elements, create method count() that takes an array
    //  of integers as the first parameter and functional interface as the second parameter,
    //  that functional interface works with integers and defines a condition. Method count()
    //  return count of elements in array that satisfy the condition defined by the second
    //  argument.
    public static class Counter {
        public static void main(String[] args) {
            List<Integer> list = Arrays.asList(56, -32, 2, -57, 22, 188, -376, 21, 53, -1, 98, 77);
            System.out.println(count(list));
        }
        public static List<Integer> count(List<Integer> list) {
            return list.stream().filter(i -> i > 0).collect(Collectors.toList());
        }

//        public interface Condition{
//            int check(int a);
//        }
    }
}
