package com.edu.practicaltask3.task1;

import java.util.Scanner;

public class OddFinding {
    private int number1;
    private int number2;
    private int number3;

    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    public int getNumber3() {
        return number3;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public OddFinding() {
    }

    public void inputScanner(Scanner sc) throws Exception {
        System.out.println("Input the number 1 : ");
        this.number1 = sc.nextInt();

        System.out.println("Input the number 2: ");
        this.number2 = sc.nextInt();

        System.out.println("Input the number 3: ");
        this.number3 = sc.nextInt();
    }

    public void checkForOdd() throws Exception {

        if (this.number1 % 2 == 0) {
            System.out.println("Number " + this.getNumber1() + " is odd");
        } else {
            System.out.println("Here is not odd numbers");

        }
        if (this.number2 % 2 == 0) {
            System.out.println("Number " + this.getNumber2() + " is odd");
        } else {
            System.out.println("Here is not odd numbers");
        }
        if (this.number3 % 2 == 0) {
            System.out.println("Number " + this.getNumber3() + " is odd");
        } else {
            System.out.println("Here is not odd numbers");
        }
    }
}