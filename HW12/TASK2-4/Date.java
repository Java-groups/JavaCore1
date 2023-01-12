import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Date {

    static boolean isValid(String date, DateTimeFormatter dateFormat) {
        DateTimeFormatter dateFormatter = dateFormat;

        try {
            LocalDate.parse(date, dateFormatter);
        } catch (DateTimeParseException e) {
            return false;
        }
        return true;
    }

    static boolean isLeapYear(int year) {
        Year y = Year.of(year);
        return y.isLeap();
    }
}
