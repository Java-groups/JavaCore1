import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        System.out.println(Date.isValid("01.31.20", DateTimeFormatter.ofPattern("MM.dd.uu")));

        System.out.println(Date.isLeapYear(2024));

        LocalDate birthday = LocalDate.of(1983, 04,23);
        System.out.println(birthday);
        System.out.println(birthday.getDayOfWeek());

        LocalDate dateAfterSixMonth = birthday.plusMonths(6);
        System.out.println(dateAfterSixMonth);
        System.out.println(dateAfterSixMonth.getDayOfWeek());

        LocalDate dateAfterOneYear = birthday.plusYears(1);
        System.out.println(dateAfterOneYear);
        System.out.println(dateAfterOneYear.getDayOfWeek());
    }
}