package com.softserve.hw5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArraysLoops {

    int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private int monthNumber;

    public static void main(String[] args) throws IOException {
        ArraysLoops al = new ArraysLoops();
        al.daysInMonth();
    }

    public void daysInMonth() throws IOException {
        System.out.println("Input month number: ");
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        monthNumber = Integer.parseInt(input.readLine());
        monthNumber--;
        System.out.println("Number of days of the month is: " + daysInMonth[monthNumber]);

    }
}
