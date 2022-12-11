package com.softserve.hw4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConditionalStatements {
    public float a;
    public float b;
    public float c;
    public int d;
    public int e;
    public int f;
    public int min;
    public int max;
    public int temp;

    public static void main(String[] args) throws IOException {
        ConditionalStatements cs = new ConditionalStatements();
        cs.floatNumbers();
        cs.intNumbers();
    }

    public void floatNumbers() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input 1st float number: ");
        a = Float.parseFloat(bf.readLine());
        System.out.println("Input 2nd float number: ");
        b = Float.parseFloat(bf.readLine());
        System.out.println("Input 3rd float number: ");
        c = Float.parseFloat(bf.readLine());
        if ((a >= -5 && a <= 5) && (b >= -5 && b <= 5) && (c >= -5 && c <= 5)) {
            System.out.println("All float numbers are in range -5, 5\n");
        } else {
            System.out.println("Some or all of the float number are NOT in range -5, 5\n");
        }
    }

    public void intNumbers() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input 1st integer number: ");
        d = Integer.parseInt(bf.readLine());
        System.out.println("Input 2nd integer number: ");
        e = Integer.parseInt(bf.readLine());
        System.out.println("Input 3rd integer number: ");
        f = Integer.parseInt(bf.readLine());
        temp = d > e ? d : e;
        max = temp > f ? temp : f;
        temp = d < e ? d : e;
        min = temp < f ? temp : f;
        System.out.println("Min number is: " + min);
        System.out.println("Max number is: " + max);
    }
}
