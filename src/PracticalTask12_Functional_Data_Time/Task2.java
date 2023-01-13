package PracticalTask12_Functional_Data_Time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class Task2 {
    // Show a date of first Monday for current month

    public static void main(String[] args) {

        LocalDate dataNow = LocalDate.of(2023, 1, 11);
        TemporalAdjuster firstMon = TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY);
        System.out.println(dataNow.with(firstMon));
    }
}
