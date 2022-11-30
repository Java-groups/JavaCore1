package com.edu.hometask1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculator of the flower bed parameters:  ");

        System.out.println("Please, input radius of the bed ");
        double radius = sc.nextDouble();
        sc.nextLine();

        System.out.println("Perimeter = " + (2 * Math.PI * radius));
        System.out.println("Area = " + (Math.PI * (radius * radius)));

        System.out.println("Your name and address confirmation:");
        System.out.println("What is your name?");
        String name = sc.nextLine();

        System.out.println("Where are you live, " + name + "?");
        String address = sc.nextLine();
        System.out.println(name + " your current address is " + address);

        System.out.println("Calculator of the duration and price of the phone calls:");

        int c1 = 2;
        int c2 = 3;
        int c3 = 5;

        System.out.println("Please input your planned call time to Ukraine ");
        int t1 = sc.nextInt();
        System.out.println("Duration of your call to Ukraine is " + t1 + " minute(s)");
        System.out.println("Price of your calls to Ukraine is " + (t1 * c1) + " unit(s)");

        System.out.println("Please input your planned call time to Egypt");
        int t2 = sc.nextInt();
        System.out.println("Duration of your call to Egypt is " + t2 + " minute(s)");
        System.out.println("Price of your calls to Ukraine is " + (t2 * c2) + " unit(s)");

        System.out.println("Please input your planned call time to USA");
        int t3 = sc.nextInt();
        System.out.println("Duration of your call to USA is " + t3 + " minute(s)");
        System.out.println("Price of your calls to Ukraine is " + (t3 * c3) + " unit(s)");

        System.out.println("Whole duration of your calls is " + (t1 + t2 + t3) + " minute(s)");
        System.out.println("Your whole spending for all calls is " + ((t1 * c1) + (t2 * c2) + (t3 * c3) + " unit(s)"));


    }



}

