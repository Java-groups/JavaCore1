package com.softserve.hw1;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        double c1, c2, c3;
        int t1, t2, t3;
        double separateCall1, separateCall2, separateCall3, allCalls;

        Scanner sc = new Scanner(System.in);

        System.out.println("Input the 1st country price per minute: ");
        c1 = sc.nextDouble();
        System.out.println("Input the 1st country call time: ");
        t1 = sc.nextInt();
        separateCall1 = c1*t1;
        System.out.println("Call price is: " + separateCall1 + "\n");

        System.out.println("Input the 2nd country price per minute: ");
        c2 = sc.nextDouble();
        System.out.println("Input the 2nd country call time: ");
        t2 = sc.nextInt();
        separateCall2 = c2*t2;
        System.out.println("Call price is: " + separateCall2 + "\n");

        System.out.println("Input the 3rd country price per minute: ");
        c3 = sc.nextDouble();
        System.out.println("Input the 3rd country call time: ");
        t3 = sc.nextInt();
        separateCall3 = c3*t3;
        System.out.println("Call price is: " + separateCall3 + "\n");

        allCalls = separateCall1 + separateCall2 + separateCall3;
        System.out.println("All calls price is: " + allCalls);
    }
}
