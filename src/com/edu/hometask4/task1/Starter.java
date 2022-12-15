package com.edu.hometask4.task1;

import com.edu.hometask4.task1.Month;

import java.util.Scanner;

public class Starter {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Month.printDayQuantity(Month.inputMonthNumber(sc),days);
    }

}