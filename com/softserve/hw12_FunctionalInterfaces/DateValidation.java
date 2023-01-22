package com.softserve.hw12_FunctionalInterfaces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DateValidation {

    public void dateValidation() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input your date: ");
        String date = input.readLine();
        String regex = "^(1[0-2]|0[1-9])/(3[01]|[12][0-9]|0[1-9])/[0-9]{4}$";
        boolean result = date.matches(regex);
        if (result) {
            System.out.println("Given date is valid");
        } else {
            System.out.println("Given date is not valid");
        }
    }
}
