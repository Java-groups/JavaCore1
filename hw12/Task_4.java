package hw12;

import java.time.LocalDate;
import java.util.stream.Stream;

public class Task_4 {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(2023, 2, 9);
        dayOfWeekAfterSixAndTwelveMonths(birthday);
    }

    public static void dayOfWeekAfterSixAndTwelveMonths(LocalDate date) {
        Stream.of(0, 6, 12)
                .map(date::plusMonths)
                .map(LocalDate::getDayOfWeek)
                .forEach(System.out::println);
    }
}
