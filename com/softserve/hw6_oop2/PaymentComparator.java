package com.softserve.hw6_oop2;

import java.util.Comparator;

public class PaymentComparator implements Comparator<Payment> {

    @Override
    public int compare(Payment o1, Payment o2) {
        return (int) (o2.calculatePay() - o1.calculatePay());
    }

}
