package edu.homeworks.hw12.practicalTask.Task1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.getDayOfWeek());

        TemporalAdjuster temporalAccessor = TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY);
        System.out.println(localDate.with(temporalAccessor));

        List<Integer> arrayList = List.of(5,4,2,1,5,1,2);
        arrayList.stream().sorted().forEach(System.out::println);


        CountNumbers countNumbers = new CountNumbers();
        int[] arr = {2,4,1,4,2,3};
       countNumbers.countNumbers(arr,x->x>=3);


    }
}
