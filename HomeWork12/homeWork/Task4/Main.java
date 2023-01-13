package edu.homeworks.hw12.homeWork.Task4;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(2002,10,01);
        DateBirthday dateBirthday = new DateBirthday();
        dateBirthday.dateBirthday(birthday,3);

    }
}
