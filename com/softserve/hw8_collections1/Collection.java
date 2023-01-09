package com.softserve.hw8_collections1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Collection {

    public ArrayList<Integer> randomNumbersInput(ArrayList<Integer> myCollection) {

        Random random = new Random();
        for (int j = 0; j < 10; j++) {
            myCollection.add(ThreadLocalRandom.current().nextInt(-5, 10));
        }
        return myCollection;
    }

    public ArrayList<Integer> swapMinMaxNumbers(ArrayList<Integer> myCollection) {

        int minIndex = 0, maxIndex = 0;
        for (int i = 1; i < myCollection.size(); ++i) {
            if (myCollection.get(i) < myCollection.get(minIndex))
                minIndex = i;
            if (myCollection.get(i) > myCollection.get(maxIndex))
                maxIndex = i;
        }

        int t;
        if (maxIndex != minIndex) {
            t = myCollection.get(minIndex);
            myCollection.set(minIndex, myCollection.get(maxIndex));
            myCollection.set(maxIndex, t);
        }
        return myCollection;
    }

    public ArrayList<Integer> insertThreeDigitNumber(ArrayList<Integer> myCollection) {
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < 0 && i != 0) {
                myCollection.set(i, ThreadLocalRandom.current().nextInt(100, 500));
                break;
            }
        }
        return myCollection;
    }

    public ArrayList<Integer> listCopy(ArrayList<Integer> myCollection) {
        ArrayList<Integer> newList = new ArrayList<>(myCollection);
        ArrayList<Integer> newReversedList = new ArrayList<>(myCollection);
        return newList;
    }

    public ArrayList<Integer> listReversedCopy(ArrayList<Integer> myCollection) {
        ArrayList<Integer> newReversedList = new ArrayList<>(myCollection);
        Collections.reverse(newReversedList);
        return newReversedList;
    }

    public ArrayList<Integer> removeLastEvenElement(ArrayList<Integer> myCollection) {
        for (int i = 9; i < myCollection.size(); i--) {
            if (myCollection.get(i) % 2 == 0) {
                myCollection.remove(i);
                break;
            }
            System.out.println("There is no even elements in the array");
        }
        return myCollection;
    }

    public ArrayList<Integer> removeNextToMinimumElement(ArrayList<Integer> myCollection) {
        int minIndex = 0;
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < myCollection.get(minIndex))
                minIndex = i;
        }
        myCollection.remove(minIndex + 1);
        return myCollection;
    }

}


