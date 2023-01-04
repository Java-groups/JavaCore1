package com.edu.practicaltask9;
/*
        In the main() method declare map employeeMap of pairs <Integer, String>.
        • Add to employeeMap seven pairs (ID, name) of some persons. Display the map on the
        screen.
        • Ask user to enter ID, then find and write corresponding name from your map. If you can't
        find this ID - say about it to user (use function containsKey()).
        • Ask user to enter name, verify than you have name in your map and write corresponding
        ID. If you can't find this name - say about it to user (use function containsValue()).
*/


import java.io.IOException;
import java.util.*;

public class Employee {
    public static void main(String[] args) throws IOException {

        Map<Integer, String> employeeMap = new HashMap<>();

        employeeMap.put(1, "Mike");
        employeeMap.put(2, "Nick");
        employeeMap.put(3, "Sara");
        employeeMap.put(4, "Bill");
        employeeMap.put(5, "Adam");
        employeeMap.put(6, "Abigail");
        employeeMap.put(7, "Isaak");

        for (Map.Entry m : employeeMap.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        System.out.println("Insert ID:");
        Scanner sc = new Scanner(System.in);
        Integer iD = sc.nextInt();

        if (employeeMap.containsKey(iD)) {

            System.out.println("Name Employee with ID: " + iD + ", is: " + employeeMap.get(iD));

        } else {
            System.out.println("Employee with ID: " + iD + ", does not exist.");
        }

        System.out.println("Insert Name:");

        String name = sc.next();

        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {

            if (entry.getValue().equals(name)) {
                System.out.println("ID Employee with name: " + name + ", is: " + entry.getKey());
            }
        }

        if (!employeeMap.containsValue(name)) {
            System.out.println("Employee with name: " + name + ", does not exist.");

        }
    }
}