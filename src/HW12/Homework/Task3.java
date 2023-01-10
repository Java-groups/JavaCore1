package HW12.Homework;

import java.time.LocalDate;
import java.time.Period;
import java.util.regex.Pattern;

public class Task3 {

    //   public static boolean leapYear(LocalDate year) {
//        if (year.isLeapYear()) {
//            System.out.println("The year is leap");
//            return true;
//        } else {
//            System.out.println("The year is not leap");
//            return false;
//        }
//    }
    public static boolean leapYear(LocalDate year) {
        int years = Period.between(year, year.plusDays(365)).getYears();
        if (years == 0) {
            System.out.println("The year is leap");
            return true;
        } else {
            System.out.println("The year is not leap");
            return false;
        }
    }

    public static void main(String[] args) {
        LocalDate year = LocalDate.of(1996, 1, 15);

        System.out.println(year.getYear());
        System.out.println(leapYear(year));
    }
}
