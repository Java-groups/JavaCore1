package edu.homeworks.hw4.IntegerNumbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        IntegerNumbers integerNumbers = new IntegerNumbers();
        integerNumbers.CalculateNumbers(input);
        integerNumbers.SortNumbers(input);
    }
}