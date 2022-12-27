package com.softserve.hw6_oop2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        PaymentComparator pc = new PaymentComparator();
        Employee[] employees = new Employee[4];
        employees[0] = new SalariedEmployee("01", "Petro", 25_550, "100N400");
        employees[1] = new SalariedEmployee("02", "Bohdan", 31_800, "101X500");
        employees[2] = new ContractEmployee("03", "Sergiy", 50.50, 168, 100500);
        employees[3] = new ContractEmployee("04", "Galyna", 60.55, 176, 100600);
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].toString());
        }
        Payment[] payments = new Payment[4];
        for (int i = 0; i < payments.length; i++) {
            payments[i] = (Payment) employees[i];
        }
        Arrays.sort(payments, pc);
        System.out.println();
        for (int i = 0; i < payments.length; i++) {
            System.out.println(payments[i].toString());
        }
    }
}
