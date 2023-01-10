package Lesson12;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Task_1 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        DayOfWeek dayOfWeek = DayOfWeek.from(localDate);
        System.out.println(dayOfWeek);
    }
}