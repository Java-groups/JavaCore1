package HW12.Homework;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Task4 {


    public static void past(LocalDate birthday) {
        System.out.println(birthday.getDayOfWeek());
        LocalDate sixMonthAfterBirthday = birthday.plusMonths(6);
        LocalDate twelveMonthAfterBirthday = birthday.plusMonths(12);
//        LocalDate yearAfterBirthday = birthday.plusYears(1);  //just to check
        System.out.println(sixMonthAfterBirthday.getDayOfWeek());
        System.out.println(twelveMonthAfterBirthday.getDayOfWeek());
//        System.out.println(yearAfterBirthday.getDayOfWeek());    //just to check
    }

    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(1991, 01, 21);
        past(birthday);
    }
}
