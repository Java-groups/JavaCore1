package com.softserve.practicaltask.pt4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConditionalStatementPractical {
    private float a;
    private float b;
    private float c;
    private int i;

    public static void main(String[] args) throws IOException {
        ConditionalStatementPractical cs = new ConditionalStatementPractical();
        cs.oddNumbers();
    }

    public void oddNumbers() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input 1st number: ");
        a = Float.parseFloat(bf.readLine());
        System.out.println("Input 2nd number: ");
        b = Float.parseFloat(bf.readLine());
        System.out.println("Input 3rd number: ");
        c = Float.parseFloat(bf.readLine());
        if (a % 2 == 0) {
            i++;
        }
        if (b % 2 == 0) {
            i++;
        }
        if (c % 2 == 0) {
            i++;
        }
        System.out.println("Count of odd numbers is: " + i);
    }
}