package hw3;

import java.util.Scanner;

public class Task_1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first float: ");
        float f1 = sc.nextFloat();
        System.out.print("Enter second float: ");
        float f2 = sc.nextFloat();
        System.out.print("Enter third float: ");
        float f3 = sc.nextFloat();
        boolean allInRange = inRange(f1) && inRange(f2) && inRange(f3);
        System.out.println("All entered numbers are in range [-5,5] : " + allInRange);
    }

    private static boolean inRange(float number){
        return number >= -5 && number <= 5;
    }
}
