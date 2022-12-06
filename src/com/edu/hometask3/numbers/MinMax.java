package com.edu.hometask3.numbers;

import java.util.Scanner;

public class MinMax {
    private int number1;
    private int number2;
    private int number3;

    public MinMax() {

    }

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

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public void setNumber3(int number3) {
        this.number3 = number3;
    }

    public void inputScanner(Scanner scan) throws Exception {

        System.out.println("Please, input your first number: ");
        this.number1 = scan.nextInt();
        System.out.println("Please, input your second number: ");
        this.number2 = scan.nextInt();
        System.out.println("Please, input your third number: ");
        this.number3 = scan.nextInt();
    }

    public void checkForMin() {
        if ((number1 < number2) & (number1 < number3))
            System.out.println(number1 + " is MIN");
        if ((number2 < number1) & (number2 < number3))
            System.out.println(number2 + " is MIN");
        if ((number3 < number1) & (number3 < number2))
            System.out.println(number3 + " is MIN");
    }
    public void checkForMax() {
        if ((number1 > number2) & (number1 > number3))
            System.out.println(number1 + " is MAX");
        if ((number2 > number1) & (number2 > number3))
            System.out.println(number2 + " is MAX");
        if ((number3 > number1) & (number3 > number2))
            System.out.println(number3 + " is MAX");
    }
}







