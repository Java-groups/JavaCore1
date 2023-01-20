package hw11;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter first number ");
            double input1 = sc.nextDouble();
            System.out.print("Enter second number ");
            double input2 = sc.nextDouble();
            System.out.println(div(input1, input2));
        } catch (InputMismatchException e) {
            System.out.println("Error: non-numeric value was input");
        } catch (ArithmeticException e) {
            System.out.println("Error: second number is 0");
        } catch (Throwable t) {
            System.out.println("Some other error happened");
        }
        System.out.println("Done");
    }

    private static double div(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Can't divide by zero");
        }
        return a / b;
    }
}
