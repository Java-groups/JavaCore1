package AllHomeWorks.HomeWork11;

import Helper.InputHelper;

import java.io.BufferedReader;
import java.io.IOException;

public class Task1 {
    public static void doTask(BufferedReader br) throws IOException {
        System.out.println("Please input a:");
        double a = InputHelper.inputDouble(br);
        System.out.println("Please input b:");
        double b = InputHelper.inputDouble(br);
        System.out.printf("Result of dividing = %f", div(a, b));

    }
    public static double div(double a, double b) throws ArithmeticException{
        if (b == 0) {
            throw new ArithmeticException("b cannot be equal 0");
        }
        return (a/b);
    }
}
