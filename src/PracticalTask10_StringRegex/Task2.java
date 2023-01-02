package PracticalTask10_StringRegex;

import java.util.Scanner;

public class Task2 {
    // Enter surname, name and patronymic on the console as a variable of type String. Output on the console:
    //surnames and initials
    //name
    //name, middle name and last name
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter surname, name and patronymic:  ");
        String surnameNamePatronymic = scanner.nextLine().trim();
        String[] arrFio = surnameNamePatronymic.split(" ");
        System.out.println("Surnames and initials:  " + arrFio[0] + " " + arrFio[1].charAt(0) + "." + arrFio[2].charAt(0) + ".");
        System.out.println("Name:  " + arrFio[1]);
        System.out.println("Name, middle name and last name:  " + arrFio[1] + " " + arrFio[2] + " " + arrFio[0]);
    }
}
