package AllHomeWorks.HomeWork11Practical;

import Helper.InputHelper;

import java.io.BufferedReader;
import java.io.IOException;

public class Task1 {
    public static void doTask(BufferedReader br) throws IOException {
        System.out.println("Please input a:");
        int a = InputHelper.inputInteger(br);
        System.out.println("Please input b:");
        int b = InputHelper.inputInteger(br);
        System.out.printf("Square of rectangle = %d", squareRectangle(a, b));
    }

    static int squareRectangle(int a, int b) throws ArithmeticException {
        if (a < 0) {
            throw new ArithmeticException("a cannot be less than 0");
        }
        if (b < 0) {
            throw new ArithmeticException("b cannot be less than 0");

        }
        return a * b;
    }
}
