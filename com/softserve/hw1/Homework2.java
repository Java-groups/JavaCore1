package com.softserve.hw1;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        String name, address;
        Scanner sc = new Scanner(System.in);
        System.out.println("What's your name?");
        name = sc.nextLine();
        System.out.println("Where do you live " + name + "?");
        address = sc.nextLine();
        System.out.println("My name is " + name + ", I live in " + address);
    }
}
