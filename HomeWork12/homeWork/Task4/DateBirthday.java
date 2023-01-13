package edu.homeworks.hw12.homeWork.Task4;

import java.time.LocalDate;

public class DateBirthday {
    public void dateBirthday(LocalDate date,int per){
        System.out.println("Day of the week = "+date.plusMonths(per).getDayOfWeek());
    }
}
