package edu.homeworks.hw12.homeWork.Task2;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        ValidDate validDate = new ValidDate();
        validDate.validDate();

        // Variant 2
        LocalDate date = LocalDate.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM.dd.yyyy");
        System.out.println(dateTimeFormatter.format(date));
    }
}
