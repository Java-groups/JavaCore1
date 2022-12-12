package HW4;

import java.util.Scanner;

public class Task3 {
    public static final int qty = 5;
    public static final int positionPositive = 2;
    static int[] number = new int[qty];

    public static void inputRow(Scanner scanner,int[] number) {
        System.out.println("Input " + qty + " number type integer");
        for (int i = 0; number.length > i; i++) {
            System.out.print("Number " + (i + 1) + " : ");
            number[i] = scanner.nextInt();
        }
    }

    public static void positionPositive(int[] number) {
        int countPositive = 0;
        for (int i =0; i < number.length; i++) {
            if (countPositive == positionPositive) {
                System.out.println("Position of " + countPositive + " positive number = " + i);
                break;
            } else if (number[i] > 0) {
                countPositive ++;
            }
        }
    }

    public static void minimumAndItsPosition(int[] number) {
        int minRow = number[0];
        int positionMin = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] < minRow) {
                minRow = number[i];
                positionMin = i;
            }
        }
        System.out.println("Minimum = " + minRow + "\nPosition = " + (positionMin + 1));
    }

    public static void multiplicatioEven(int[] number) {
        int multiplicatioEven = 1;
        for (int i = 0; i < number.length; i++) {
            if (number[i] > 0) {
                multiplicatioEven = multiplicatioEven * number[i];
            }
        }
        if (multiplicatioEven == 1) {
            System.out.println("There are no positive numbers in the row");
        } else {
            System.out.println("The product of all entered even numbers = " + multiplicatioEven);
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        inputRow(scanner, number);

        positionPositive(number);

        minimumAndItsPosition(number);

        multiplicatioEven(number);
    }
}
