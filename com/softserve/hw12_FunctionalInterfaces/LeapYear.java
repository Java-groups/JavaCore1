package com.softserve.hw12_FunctionalInterfaces;

public class LeapYear {

    public void leapYear(int year) {

        boolean leapYear = false;

        if (year % 4 == 0) {
            leapYear = true;
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    leapYear = true;
                } else {
                    leapYear = false;
                }
            }
        }
        if (!leapYear) {
            System.out.println(year + " : Non Leap-year");
        } else {
            System.out.println(year + " : Leap-year");
        }
    }
}
