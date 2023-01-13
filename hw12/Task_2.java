package hw12;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task_2 {
    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM-dd-yy");
        String formattedLocalDate = dateTimeFormatter.format(LocalDate.now());
        System.out.println(formattedLocalDate);
    }
}