package HM11.PracticalTask1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static int squareRectangle(int a, int b) {
        if (a > 0 && b > 0) {
            return a * b;
        } else {
            System.out.println("You entered negative number or zero");
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 2 numbers");
        try {
            int input1 = sc.nextInt();
            int input2 = sc.nextInt();

            System.out.println(squareRectangle(input1, input2));
        } catch (InputMismatchException | NumberFormatException e) {
            System.out.println("Wrong input");
        }
    }
}
