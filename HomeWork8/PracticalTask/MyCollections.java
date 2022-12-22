package edu.homeworks.hw8.practicaltask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MyCollections {
    private LinkedList<Integer> myCollection =new LinkedList<>(List.of(1,5,21,4,1,6,11,2,4,15));

    private ArrayList<Integer> newCollection = new ArrayList<>();

    /*
    private void randomNumbers(){
    myCollection.add(new Random().nextInt(10));
        for (int i = 0;i < 10;i++){
            myCollection.add(new Random().nextInt(10));
        }
    } */


    public void outputNumberMoreFive() {

        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 5) {
                newCollection.add(i);
                System.out.println("Number = " + myCollection.get(i) + "\n Index = " + i);
            }
        }
    }

    public void removeNumbers(){
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 10) {
                System.out.println("Number " + myCollection.get(i) + " in index " + i +" more " + 10);
                myCollection.remove(i);
            }
        }
    }

    public void replacementIndex(){
        myCollection.add(2,1);
        myCollection.add(8,-3);
        myCollection.add(5,-4);

        for (int i = 0;i<myCollection.size();i++){
            System.out.println("Position = " + i +
                    "\n Value of number = " + myCollection.get(i));
        }
    }

    public void sortArray(){
        Collections.sort(myCollection);
        System.out.println("Sorted array");
        for (int i = 0;i<myCollection.size();i++){
            System.out.println("Position = " + i +
                    "\n Value of number = " + myCollection.get(i));
        }
    }
}

