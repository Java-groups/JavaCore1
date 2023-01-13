package edu.homeworks.hw12.homeWork.Task3;


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Leap leap = new Leap();
        LocalDate date = LocalDate.now();
        System.out.println(leap.leapBoolean(date,1999));

    }
}
