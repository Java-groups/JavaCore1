package HW11.Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2 {
    static class MyException extends Exception {
        public MyException(String msg) {
            super(msg);
        }

        public MyException() {
        }
    }

    static int readNumber(int start, int end) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = 0;
        try {
            number = Integer.parseInt(br.readLine());
            if (number > start && number < end) {
                System.out.println("Number " + number + " is in the range");
            } else throw new MyException("Number is not in the range");
        } catch (IOException | NumberFormatException e) {
            System.err.println("This is not a number");
        } catch (MyException e1) {
            System.err.println(e1.getMessage());
        }
        return number;

    }

    public static void main(String[] args) {
        int start = 3;
        int end = 45;
        System.out.println("Enter a number in the range " + start + " - " + end);
        readNumber(start, end);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        System.out.println("Enter ten numbers in the range 1 - 100");
        for (int i = 1; i < numbers.size() + 1; i++) {
            numbers.add(readNumber(numbers.get(i - 1), 100));
            if (numbers.get(i) <= numbers.get(i - 1) || numbers.get(i) >= 100) {
                numbers.remove(numbers.get(i));
                i--;
            } else if (numbers.size() > 10) {
                break;
            }
        }
        numbers.remove(0);
        System.out.println("Your numbers in the range 1-100 are:\n" + numbers);

    }
}
