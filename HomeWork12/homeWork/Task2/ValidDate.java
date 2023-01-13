package edu.homeworks.hw12.homeWork.Task2;

import java.time.LocalDate;
import java.time.Month;

public class ValidDate {
    public void validDate(){
        LocalDate date = LocalDate.now();
        int year,month,day;

        year = date.getYear();
        month = date.getMonthValue();
        day = date.getDayOfMonth();

        System.out.println(month+"."+day+"."+year);

    }
}
