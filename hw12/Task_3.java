package hw12;

import java.time.Year;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
//First
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year to check: ");
        int input = sc.nextInt();
        Year year1 = Year.of(input);
        System.out.println(year1.isLeap());

//Second
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a year to check: ");
//        int year = sc.nextInt();
//        yearIsLeap(year);


    }

    public static void yearIsLeap(int year) {
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println("Entered year " + year + " is a leap year");
        } else {
            System.out.println("Entered year " + year + " is not a leap year");
        }
    }
}

