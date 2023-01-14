package AllHomeWorks.HomeWork12;

import java.io.BufferedReader;
import java.io.IOException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;

public class Task4 {
    public static void doTask(BufferedReader br) throws IOException {
        LocalDate birthday = LocalDate.of(1985, 2, 14);
        System.out.printf("\nMy birthday is %s", birthday);
        infoDay(birthday);
    }

    public static void infoDay(LocalDate date){
        DayOfWeek infoDayBirthday = date.getDayOfWeek();
        System.out.printf("\nMy birthday is at %s", infoDayBirthday);
        Period p6 = Period.ofMonths(6);
        Period p12 = Period.ofMonths(12);

        LocalDate temp6 = (LocalDate) p6.addTo(date);
        LocalDate temp12 = (LocalDate) p12.addTo(date);

        DayOfWeek infoDay6Month = temp6.getDayOfWeek();
        DayOfWeek infoDay12Month = temp12.getDayOfWeek();
        System.out.printf("\nThe day after 6 months after birthday is %s", infoDay6Month);
        System.out.printf("\nThe day after 12 months after birthday is %s", infoDay12Month);
        System.out.println("\n");

    }
}
