package hw3;

import java.util.Scanner;

public class Task_1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int int1 = sc.nextInt();
        System.out.print("Enter second integer: ");
        int int2 = sc.nextInt();
        System.out.print("Enter third integer: ");
        int int3 = sc.nextInt();
        int max = max(int1, int2, int3);
        int min = min(int1, int2, int3);
        System.out.println("Max: " + max + ", min: " + min);
    }


    private static int max(int int1, int int2, int int3) {
        int max;
        if(int1 > int2) {
            max = int1 > int3 ? int1 : int3;
        } else {
            max = int2  > int3 ? int2 : int3;
        }
        return max;
    }

    private static int min(int int1, int int2, int int3) {
        int min;
        if(int1 < int2) {
            min = int1 < int3 ? int1 : int3;
        } else {
            min = int2  < int3 ? int2 : int3;
        }
        return min;
    }
}
