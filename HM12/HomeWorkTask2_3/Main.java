package HM12.HomeWorkTask2_3;

import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;


public class Main {
    static String dateValidation(String date) {
        try {
            LocalDate.parse(date, DateTimeFormatter.ofPattern("MM.dd.uu").withResolverStyle(ResolverStyle.STRICT));
            return "The date is valid";
        } catch (DateTimeParseException e) {
            e.printStackTrace();
            return "The date is not valid";
        }
    }

    static boolean isLeapYear(int year) {
        Year y = Year.of(year);
        return y.isLeap();
    }

    public static void main(String[] args) {
        System.out.println(dateValidation("09.23.98"));

        System.out.println(isLeapYear(1996));
    }
}
