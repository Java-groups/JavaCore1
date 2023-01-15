package com.edu.practicaltask12;

import java.time.LocalDate;

public class DayOfWeek1 {


    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();

        System.out.println(currentDate.getDayOfWeek());

    }
}
