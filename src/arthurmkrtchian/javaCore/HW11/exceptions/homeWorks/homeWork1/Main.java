package arthurmkrtchian.javaCore.HW11.exceptions.homeWorks.homeWork1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//        1. Create method div(), which calculates the dividing of two double numbers. In main
//        method input 2 double numbers and call this method. Catch all exceptions.


public class Main {
    static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


    public static void main(String[] args) {
        double a = read();
        double b = read();

        try {
            System.out.println(div(a, b));
        } catch (ArithmeticException e){
            System.out.println("According to mathematics, it is not possible to perform division operations with zero.");
            e.printStackTrace();
        }
    }

    private static double read() {
        while (true) {
            try {
                return Double.parseDouble(reader.readLine());
            } catch (NumberFormatException | IOException e) {
                System.out.println("Incorrect input. You should enter double number or an integer.");
                e.printStackTrace();
            }
        }
    }

    private static double div(double a, double b) throws ArithmeticException {
        if (a == 0 || b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }
}
