package com.edu.practicaltask8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Collection {

    private ArrayList<Integer> myCollection = new ArrayList<>();

    private ArrayList<Integer> newCollection = new ArrayList<>();


    public void fillMyCollection() {
        for (int i = 0; i < 10; i++) {
            myCollection.add(new Random().nextInt(40));
        }
        System.out.println("myCollection: " + myCollection);
    }

    public void fillNewCollection() {

        for (int i = 0; i < myCollection.size(); i++) {

            if (myCollection.get(i) > 5) {
                newCollection.add(i);

            }
        }

        System.out.println("newCollection: " + newCollection);

    }

    public void removeMoreThan20() {

        for (int i = 0; i < myCollection.size(); i++) {

            if (myCollection.get(i) > 20) {

                myCollection.remove(i);
                i--;
            }
        }

        System.out.println("myCollection with element less then 20: " + myCollection);

    }

    public void insertElements() {
        int i;
        for (i = 0; i < myCollection.size(); i++) {

            if (myCollection.size() >= 3) {
                myCollection.add(2, 1);

            } else {
                System.out.println("Can not add 1 to 3 position," +
                        " actual size myCollection is: " + myCollection.size());

                break;
            }
            if (myCollection.size() >= 6) {
                myCollection.add(5, -4);

            } else {
                System.out.println("Can not add -4 to 6 position," +
                        " actual size myCollection is: " + myCollection.size());

                break;
            }
            if (myCollection.size() >= 9) {
                myCollection.add(8, -3);

            } else {
                System.out.println("Can not add -3 to 9 position," +
                        " actual  size myCollection is: " + myCollection.size());
               break;
            }

        }

        System.out.println("MyCollection with inserted    elements: " + myCollection);

        for (i = 0; i < myCollection.size(); i++) {

            System.out.println("position: " + i + ", value of element: " + myCollection.get(i));
        }
    }

    public void sortAndPrint() {
        System.out.println("MyCollection before sorting:");
        for (int number : myCollection) {
            System.out.print(number + ", ");
        }

        Collections.sort(myCollection);
        System.out.println();

        System.out.println("MyCollection after sorting:");
        for (int counter : myCollection) {
            System.out.print(counter + ", ");
        }
    }
}
