package com.softserve.hw1;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        double perimeter, area, r, p = 3.14;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius: ");
        r = sc.nextDouble();
        perimeter = 2*p*r;
        area = p*r*r;
        System.out.println("Perimeter size: " + perimeter);
        System.out.println("Area size: " + area);
    }
}
