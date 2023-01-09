package com.softserve.hw8_collections1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> myCollection = new ArrayList<>(10);

        Collection collection = new Collection();

        System.out.println(collection.randomNumbersInput(myCollection));
        System.out.println(collection.swapMinMaxNumbers(myCollection));
        System.out.println(collection.insertThreeDigitNumber(myCollection));

    }
}
