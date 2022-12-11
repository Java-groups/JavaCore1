package HW3;

// read 3 integer numbers and write max and min of them

import java.util.Scanner;
import static java.lang.Math.min;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number1: ");
        int num1 = scanner.nextInt();
        System.out.print("Input number2: ");
        int num2 = scanner.nextInt();
        System.out.print("Input number3: ");
        int num3 = scanner.nextInt();
        int max = 0;
        int min = 0;
        if (num1 < num2 && num2 < num3) {
           min = num1;
           max = num3;
        }else if (num1 < num3 && num3 < num2) {
            min = num1;
            max = num2;
        }else if (num2 < num1 && num1 < num3) {
            min = num2;
            max = num3;
        }else if (num2 < num3 && num3 < num1) {
            min = num2;
            max = num1;
        }else if (num3 < num2 && num2 < num1) {
            min = num3;
            max = num1;
        }else if (num3 < num1 && num1 < num2) {
            min = num3;
            max = num2;
        }else {
            System.out.println("Make a check. There is an error in the algorithm.");
        }
        System.out.println("min = " + min + "\n" + "max = " + max);
    }

}
