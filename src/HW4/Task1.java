package HW4;

import java.util.Scanner;

public class Task1 {
    public static void numberDay(int num) {

        int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println("Month with number " + num + " have " + month[num - 1] +" days");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number month (1 - 12 only): ");
        int num = scanner.nextInt();
        numberDay(num);
    }
}

