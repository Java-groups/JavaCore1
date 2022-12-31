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
        System.out.println("Mycollection: " + myCollection);
    }

    public void fillNewCollection() {

        for (int i = 0; i < myCollection.size(); i++) {

            if (myCollection.get(i) > 5) {
                newCollection.add(i);

            }
        }

        System.out.println("newCollection: " + newCollection);

    }

    /*Method "removeMoreThan20" below, works incorrect when numbers more than 20
     follow each other, method leaves second number, can not find cause for mistakenly work.
     Could you please advice?
     */
    public void removeMoreThan20() {

        for (int i = 0; i < myCollection.size(); i++) {

            if (myCollection.get(i) > 20) {

                myCollection.remove(i);
            }
        }

        System.out.println("myCollection with element less then 20: " + myCollection);

    }

    public void replaceElements() {
        int i;
        for (i = 0; i < myCollection.size(); i++) {

            if (myCollection.size() >= 3) {
                myCollection.set(2, 1);

            } else {
                System.out.println("Can not set 1 to 3 position, size myCollection is: " + myCollection.size());
                continue;
            }
            if (myCollection.size() >= 6) {
                myCollection.set(5, -4);

            } else {
                System.out.println("Can not set -4 to 6 position, size myCollection is: " + myCollection.size());

                break;
            }
            if (myCollection.size() >= 9) {
                myCollection.set(8, -3);

            } else {
                System.out.println("Can not set -3 to 9 position, size myCollection is: " + myCollection.size());
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
