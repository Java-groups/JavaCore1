package com.edu.practicaltask1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       System.out.println("Please, input first ");
       double a = Double.parseDouble(br.readLine());

       System.out.println("Please, input second ");
       double b = Double.parseDouble(br.readLine());

       System.out.println("Suma = " + (a+b));
       System.out.println("Raznost = " + (a-b));
       System.out.println("Multipl= " + (a*b));
       System.out.println("Diff = " + (a/b));

       System.out.println("How are you?");
       String answer = br.readLine();
       System.out.println("You are " + answer);

    }
}
