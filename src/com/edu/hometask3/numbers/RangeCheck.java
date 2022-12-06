package com.edu.hometask3.numbers;

import java.util.Scanner;

public class RangeCheck {

    private float number1;
    private float number2;
    private float number3;

    public RangeCheck() {

    }

    public float getNumber1() {
        return number1;
    }

    public float getNumber2() {
        return number2;
    }

    public float getNumber3() {
        return number3;
    }

    public void setNumber1(float number1) {
        this.number1 = number1;
    }

    public void setNumber2(float number2) {
        this.number2 = number2;
    }

    public void setNumber3(float number3) {
        this.number3 = number3;
    }

    public void input(Scanner sc) throws Exception {

        System.out.println("Please, input your first number: ");
        this.number1 = sc.nextFloat();
        System.out.println("Please, input your second number: ");
        this.number2 = sc.nextFloat();
        System.out.println("Please, input your third number: ");
        this.number3 = sc.nextFloat();
    }


    public void checkForRange() {
        System.out.println("Statement that all numbers within range [-5, 5] is: " +
                (((number1 >= -5) && (number1 <= 5)) && ((number2 >= -5) && (number2 <= 5)) && ((number3 >= -5) && (number3 <= 5))));

    }
}



