package HW11.Homework;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task1 {
    static double div(double firstNumber, double secondNumber) {

        return firstNumber / secondNumber;
    }

    public static void main(String[] args) {
        double firstNumber = 0.1;
        double secondNumber = 0;

        try {
            if (Math.abs(div(firstNumber, secondNumber)) == Double.POSITIVE_INFINITY || Double.isNaN(div(firstNumber, secondNumber))) {
                throw new ArithmeticException();
            } else System.out.println(div(firstNumber, secondNumber));

        } catch (ArithmeticException e) {
            System.err.println("Division by zero");
        }
    }
}
