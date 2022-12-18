package com.edu.hometask4.task3;

import java.util.Scanner;

public class FiveIntStarter {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] fiveInts = new int[5];
        FiveInt.input(fiveInts,sc);
        FiveInt.findPositSecPosNum(fiveInts);
        FiveInt.findMinAndPosit(fiveInts);
        FiveInt.findEvenNumProduct(fiveInts);
    }
}
