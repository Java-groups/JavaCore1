package com.softserve.hw3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConditionalStatements {

    private float a;
    private float b;
    private float c;
    private int d;
    private int e;
    private int f;
    private int min;
    private int max;
    private int temp;

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public int getE() {
        return e;
    }

    public void setE(int e) {
        this.e = e;
    }

    public int getF() {
        return f;
    }

    public void setF(int f) {
        this.f = f;
    }

    public static void main(String[] args) throws IOException {
        ConditionalStatements cs = new ConditionalStatements();
        cs.floatNumbers();
        cs.intNumbers();
        cs.httpErrors();
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
        System.out.println("Min number is: " + min + "\n");
        System.out.println("Max number is: " + max + "\n");
    }

    public enum HTTPErrors {
        SUCCESS, REDIRECT, CLIENTERROR;
    }

    public void httpErrors() {
        HTTPErrors he = HTTPErrors.SUCCESS;
        switch (he) {
            case SUCCESS:
                System.out.println("Error code is: 200");
                break;
            case REDIRECT:
                System.out.println("Error code is: 300");
                break;
            case CLIENTERROR:
                System.out.println("Error code is: 400");
                break;
        }

    }

}
