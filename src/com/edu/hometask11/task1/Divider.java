package com.edu.hometask11.task1;

public class Divider {
    private double firstNumber = 32.09;
    private double secondNumber =0;

    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    static double div(double firstNumber, double secondNumber) throws ArithmeticException{

        return firstNumber / secondNumber;
    }
}
