package com.edu.hometask11.task2;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;


public class NumberStarter {

    public static void main(String[] args) throws Number.RangException, InputMismatchException {


        List<Integer> numbers = new ArrayList<>(10);
        int start = 1;
        int end = 100;
        numbers.add(start);
        Number n = new Number();


        for (int i = 1; i < numbers.size() + 1; i++) {
            numbers.add(n.readNumber(numbers.get(i - 1), end));

            if (numbers.get(i) <= numbers.get(i - 1) || numbers.get(i) >= end) {
                numbers.remove(numbers.get(i));
                i--;

            } else if (numbers.size() > 10) {
                break;


            }
        }
    }
}

