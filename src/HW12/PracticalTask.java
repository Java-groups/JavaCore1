package HW12;

import HW12.model.Seasons;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PracticalTask {
    public static void main(String[] args) {
        System.out.println("Start of first practical task");
        System.out.println(LocalDate.now());
        System.out.println("Start of second practical task");
        LocalDate localDate = LocalDate.of(2023, Month.JANUARY,13);
        TemporalAdjuster firstMonInJan = TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY);
        System.out.println(localDate.with(firstMonInJan));
        System.out.println("Start of third practical task");// first is for array and second for list
        Seasons[] season = { new Seasons("Winter"), new Seasons("Spring"),
                new Seasons("Summer"), new Seasons("Autumn") };
        System.out.println("Before sorting"+ season);
        Arrays.sort(season, Seasons::compareByName);
        System.out.println("After sorting"+ season);
        System.out.println(Arrays.toString(season));
        List<String> names =
                Arrays.asList("Angelina", "Anna", "Anastasia", "Anabel", "Polina");
        System.out.println(names);
        List<String> namesWithA = names.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList());
        System.out.println(namesWithA);
        System.out.println("Start of fourth practical task");
        Integer[] numbers = new Integer[]{1,2,34,5,6,7,8,9,0};
        int count = count(numbers,n -> n > 8);
        System.out.println("The  count of odd numbers in array: "+ count);
        }

        public static int count(Integer[] array, Predicate<Integer> predicate){
        int count = 0;
            for (int i = 0; i < array.length; i++) {
                if (predicate.test(array[i])){
                    count++;
                }
            }
            return count;
        }

        public static int sum(Integer[] array, Function<Integer[], Integer> function){
        int result = 0 ;

        return result;
        }
}
