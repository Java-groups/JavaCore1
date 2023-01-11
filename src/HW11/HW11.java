package HW11;

import HW11.model.CheckRangeException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HW11 {
    public static double div(double a, double b) {
        try {
            if (a <= 0 | b <= 0) {
                throw new Exception("Negative value");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return a / b;
    }

    public static void readNumber(int start, int end) {

        int num;
        String number;
        System.out.println("Enter number to check: ");
        Scanner sc = new Scanner(System.in);
        sc = new Scanner(System.in);

        try {
            number = sc.next();
            num = Integer.parseInt(number);
            if (num > end | num < start) {
                throw new CheckRangeException("False, this number is not in range ");
            } else {
                if (num < end && num > start) {
                    System.out.println("This number in range ");
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("No number entered");

        } catch (CheckRangeException e) {
            System.out.println("This number is not in range ");
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Start of the first task");
        System.out.println("Enter first number for count div");
        Scanner sc = new Scanner(System.in);
        sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        System.out.println("Enter second number for count div");
        double num2 = sc.nextDouble();
        System.out.println("Result " + div(num1, num2));
        System.out.println("Start of the second task");
        sc = new Scanner(System.in);

        System.out.println("Enter start: ");
        int start = sc.nextInt();
        System.out.println("Enter end: ");
        int end = sc.nextInt();
        System.out.println("Enter 10 numbers [1;100] growing up in order");

        for (int i = 0; i < 10; i++) {

            readNumber(start,end);

        }

    }


}

