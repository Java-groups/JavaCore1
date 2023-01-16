package com.edu.practicaltask12;
/*
Show which today is a day of a week
*/

import java.time.LocalDate;

public class DayOfWeek1 {


    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();

        System.out.println(currentDate.getDayOfWeek());

    }
}
