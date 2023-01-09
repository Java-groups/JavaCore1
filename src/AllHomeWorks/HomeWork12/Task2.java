package AllHomeWorks.HomeWork12;

import java.io.BufferedReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task2 {
    public static void doTask(BufferedReader br) throws IOException {
        LocalDate now = LocalDate.now();
        System.out.println("Date is " +now);
        System.out.println("Date is " + formatDate(now));

    }
    public static String formatDate(LocalDate date){
        return date.format(DateTimeFormatter.ofPattern("MM.dd.yy"));
    }
}
