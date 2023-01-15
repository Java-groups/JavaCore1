package com.edu.hometask11.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Number {


    public int readNumber(int start, int end) throws RangException, InputMismatchException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input number in the range: " + start + "-" + end);
        int input;


        try {
            input = sc.nextInt();
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Number should be int.");
        }

        if (start <= input && input <= end) {
            return input;
        } else {
            throw new RangException("Number should be in the range: " + start + "-" + end);

        }

    }

    static class RangException extends Exception {
        public RangException(String m) {
            super(m);
        }
    }
}
