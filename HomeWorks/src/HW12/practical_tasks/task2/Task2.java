package HW12.practical_tasks.task2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Task2 {
	
	/**
	 * Show a date of first Monday for current month
	 */

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY)));
    }

}
