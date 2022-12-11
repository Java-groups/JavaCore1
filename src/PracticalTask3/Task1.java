package PracticalTask3;

import java.util.Scanner;

public class Task1 {
    public enum Week {
        MOODAY("Понеділок"), TUESDAY("Вивторок"), WENSDAY("Середа"), THURSDAY("Четверг"), FRIDAY("П'ятниця"),
        SATURDAY("Суббота"), SUNDAY("Неділя");
        private String nameUa;

        Week(String nameUa) {
            this.nameUa = nameUa;
        }

        public String getNameUa() {
            return nameUa;
        }

        public void setNameUa(String nameUa) {
            this.nameUa = nameUa;
        }

        @Override
        public String toString() {
            return "Week{" +
                    "nameUa='" + nameUa + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        System.out.print("Input the number of the day of the week (1 - 7): ");
        Scanner scanner = new Scanner(System.in);
        int numberDay = scanner.nextInt();

        switch (numberDay) {
            case 1:
                Week day1 = Week.MOODAY;
                if (numberDay == (1 + day1.ordinal())) {
                    System.out.println(day1.name());
                    System.out.println((day1.nameUa));
                }
                break;
            case 2:
                Week day2 = Week.TUESDAY;
                if (numberDay == (1 + day2.ordinal())) {
                    System.out.println(day2.name());
                    System.out.println((day2.nameUa));
                }
                break;
            case 3:
                Week day3 = Week.WENSDAY;
                if (numberDay == (1 + day3.ordinal())) {
                    System.out.println(day3.name());
                    System.out.println((day3.nameUa));
                }
                break;
            case 4:
                Week day4 = Week.THURSDAY;
                if (numberDay == (1 + day4.ordinal())) {
                    System.out.println(day4.name());
                    System.out.println((day4.nameUa));
                }
                break;
            case 5:
                Week day5 = Week.FRIDAY;
                if (numberDay == (1 + day5.ordinal())) {
                    System.out.println(day5.name());
                    System.out.println((day5.nameUa));
                }
                break;
            case 6:
                Week day6 = Week.SATURDAY;
                if (numberDay == (1 + day6.ordinal())) {
                    System.out.println(day6.name());
                    System.out.println((day6.nameUa));
                }
                break;
            case 7:
                Week day7 = Week.SUNDAY;
                if (numberDay == (1 + day7.ordinal())) {
                    System.out.println(day7.name());
                    System.out.println((day7.nameUa));
                }
                break;
            default:
                System.out.println("Error number");

        }
    }
}
