package HW3;

// read 3 float numbers and check: are they all belong to the range [-5, 5];

import java.util.Scanner;

public class Task {

    public static boolean compare(float nm) {
        if (nm >= -5.0 && nm <= 5.0)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number1: ");
        float number1 = scanner.nextFloat();
        System.out.print("Input number2: ");
        float number2 = scanner.nextFloat();
        System.out.print("Input number3: ");
        float number3 = scanner.nextFloat();
        if (compare(number1)) {
            System.out.println("number " + number1 + " included in [-5;5]");
        } else {
            System.out.println("number " + number1 + " not included in [-5;5]");
        }
        if (compare(number2)) {
            System.out.println("number " + number2 + " included in [-5;5]");
        } else {
            System.out.println("number " + number2 + " not included in [-5;5]");
        }
        if (compare(number3)) {
            System.out.println("number " + number3 + " included in [-5;5]");
        } else {
            System.out.println("number " + number3 + " not included in [-5;5]");
        }
    }
}




