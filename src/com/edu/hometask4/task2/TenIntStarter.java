package com.edu.hometask4.task2;

import java.util.Scanner;

public class TenIntStarter {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int[] intStore = new int[10];

        TenInt c = new TenInt();

        c.fillIntStore(intStore, sc);
        c.sumAndProductFind(intStore);
    }
}


