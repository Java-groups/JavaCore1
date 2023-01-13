package edu.homeworks.hw12.homeWork.Task3;

import java.time.LocalDate;

public class Leap {
    public boolean leapBoolean(LocalDate date,int value){
        if(value%4==0){
            return true;
        }
        return false;

        // date.isLeapYear();
    }
}
