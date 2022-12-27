package com.softserve.hw6_oop2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        PaymentComparator pc = new PaymentComparator();
        Payment[] payments = new Payment[4];
        payments[0] = new SalariedEmployee("01", "Petro", 25_550, "100N400");
        payments[1] = new SalariedEmployee("02", "Bohdan", 31_800, "101X500");
        payments[2] = new ContractEmployee("03", "Sergiy", 50.50, 168, 100500);
        payments[3] = new ContractEmployee("04", "Galyna", 60.55, 176, 100600);
        for (Payment value : payments) {
            System.out.println(value.toString());
        }

        Arrays.sort(payments, pc);
        System.out.println();
        for (Payment payment : payments) {
            System.out.println(payment.toString());
        }
    }
}
