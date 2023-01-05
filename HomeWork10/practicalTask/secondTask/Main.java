package edu.homeworks.hw10.practicalTask.secondTask;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fullName;
        System.out.println("Write your FullName (SureName,Name,patronymic)");
        fullName = scanner.nextLine();
        String elements[] = fullName.split(" ");
        if (elements[0].isEmpty() || elements[1].isEmpty() || elements[2].isEmpty()) {
            System.out.println("Error , your don't write element");
        } else {
            System.out.println("Surename = " + elements[0] + " " + elements[1].charAt(0) + "." + elements[2].charAt(0));
            System.out.println("Name = " + elements[1]);
            System.out.println("Name = " + elements[1] +
                    "\n SureName = " + elements[0] +
                    "\n MiddleName = " + elements[2]);
        }
    }
 }
