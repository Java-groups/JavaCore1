package HW12_Funtional_Data_Time;

import java.time.LocalDate;
public class Birthday {
    // Create variable LocalDate birthday and set to that variable date your birthday.
    //Create method that take as a parameter object LocalDate and pring the day of the week and
    // what was the day of the week after 6 months and what was the day of the week after 12 months.

    public static void main(String[] args) {
        int month6 = 6;
        int month12 = 12;
        LocalDate birthday = LocalDate.of(2022, 05, 01);

        System.out.println("\nDay of the week of your birthday - " + calculationDay(birthday,0));
        System.out.println("\nDay of the week 6 months ago - " + calculationDay(birthday,month6));
        System.out.println("\nDay of the week 12 months ago - " + calculationDay(birthday,month12));
    }

    public static String calculationDay(LocalDate birthday, int month) {
        LocalDate oldDay = birthday.minusMonths(month);
        return String.valueOf(oldDay.getDayOfWeek());
    }
}
