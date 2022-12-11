package edu.homeworks.homework4.practicalTask;

import edu.homeworks.homework3.Breed;
import edu.homeworks.homework3.Dog;
import edu.homeworks.homework3.Numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Array ar = new Array();
        ar.randomNumbers();
        ar.biggestNumber();
        ar.sumNumbers();
        ar.amountNegativeNumbers(); 

        Employee[] employee = new Employee[5];

        employee[0] = new Employee("Alex",5000,0);
        employee[1] = new Employee("Mark",4500,0);
        employee[2] = new Employee("Stepan",2500,0);
        employee[3] = new Employee("Bogdan",6000,0);
        employee[4] = new Employee("David",5000,0);

        Employee.outputDepNumber(input,employee);
        Employee.sortedEmployees(employee);
        
    }
}
