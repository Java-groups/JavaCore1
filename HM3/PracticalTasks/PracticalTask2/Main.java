package HM3.PracticalTasks.PracticalTask2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        WeekDay Monday = new WeekDay(2, "Monday", "понеділок");
        WeekDay Tuesday = new WeekDay(3, "Tuesday", "вівторок");
        WeekDay Wednesday = new WeekDay(4, "Wednesday", "середа");
        WeekDay Thursday = new WeekDay(5, "Thursday", "четвер");
        WeekDay Friday = new WeekDay(6, "Friday", "п'ятниця");
        WeekDay Saturday = new WeekDay(7, "Saturday", "субота");
        WeekDay Sunday = new WeekDay(1, "Sunday", "неділя");

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the day number");
        int enteredDayNumber = sc.nextInt();


        if (enteredDayNumber == 1) {
            System.out.println("Day name in English is " + Sunday.dayNameEn + "; Day name in Ukrainian is " + Sunday.dayNameUa);
        }
        if (enteredDayNumber == 2) {
            System.out.println("Day name in English is " + Monday.dayNameEn + "; Day name in Ukrainian is " + Monday.dayNameUa);
        }
        if (enteredDayNumber == 3) {
            System.out.println("Day name in English is " + Tuesday.dayNameEn + "; Day name in Ukrainian is " + Tuesday.dayNameUa);
        }
        if (enteredDayNumber == 4) {
            System.out.println("Day name in English is " + Wednesday.dayNameEn + "; Day name in Ukrainian is " + Wednesday.dayNameUa);
        }
        if (enteredDayNumber == 5) {
            System.out.println("Day name in English is " + Thursday.dayNameEn + "; Day name in Ukrainian is " + Thursday.dayNameUa);
        }
        if (enteredDayNumber == 6) {
            System.out.println("Day name in English is " + Friday.dayNameEn + "; Day name in Ukrainian is " + Friday.dayNameUa);
        }
        if (enteredDayNumber == 7) {
            System.out.println("Day name in English is " + Saturday.dayNameEn + "; Day name in Ukrainian is " + Saturday.dayNameUa);
        }
        if (enteredDayNumber < 1 | enteredDayNumber > 7) {
            System.out.println("You entered the wrong number");
        }


    }
}
