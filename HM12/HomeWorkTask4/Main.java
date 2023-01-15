package HM12.HomeWorkTask4;

import java.time.LocalDate;

public class Main {

    static void dayOfTheWeek(LocalDate a) {
        System.out.println(a.getDayOfWeek());
        System.out.println(a.plusMonths(6).getDayOfWeek());
        System.out.println(a.plusMonths(12).getDayOfWeek());
    }

    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(1992, 8, 30);

        dayOfTheWeek(birthday);
    }
}
