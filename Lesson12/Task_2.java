package Lesson12;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;


public class Task_2 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        TemporalAdjuster firstMondayInMonth = TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY);
        System.out.println(localDate.with(firstMondayInMonth));
    }
}
