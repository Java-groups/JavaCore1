package HM11.HomeWorkTask2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    static class MyException extends Exception {
        public MyException(String msg) {
            super(msg);
        }
    }
    static int readNumber(int start, int end) throws MyException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number in the range: " + start + "-" + end);
        int number = sc.nextInt();

        if (number >= start && number <= end) {
            return number;
        } else {
            throw new MyException("Input value is out of the range");
        }
    }

    public static void main(String[] args) throws MyException {

        try {
            List<Integer> numbers = new ArrayList<>();
            numbers.add(readNumber(1,100));
            numbers.add(readNumber(1,100));
            for (int i = 1; i < 9; i++) {
                if (numbers.get(i - 1) < numbers.get(i)) {
                    numbers.add(readNumber(1,100));
                } else {
                    System.out.println("The entered number is smaller than the previous one");
                }
            }
        }
        catch (MyException | NumberFormatException | InputMismatchException e) {
            System.out.println(e);
        }

    }
}
