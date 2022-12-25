package edu.homeworks.hw8.homework8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class MyCollection {
    private int min;
    private int minIndex;
    private int max;
    private int maxIndex;
    private int lastEvenNumber;
    private LinkedList<Integer> myCollection = new LinkedList<>();
    private ArrayList<Integer> list1 = new ArrayList<>();
    private LinkedList<Integer> list2 = new LinkedList<>();
    private LinkedList<Integer> evenList = new LinkedList<Integer>();
    Random rand = new Random();
    public void randomNumbers() {
        for (int i = 0; i < 10; i++) {

            myCollection.add(rand.nextInt(20+10) -10);
            System.out.println(myCollection.get(i));
        }
    }
    public void swapMinMax() {
        min = myCollection.get(0);
        for (int i = 1; i < myCollection.size(); ++i) {
            if (myCollection.get(i) > max) {
                max = myCollection.get(i);
                maxIndex = i;
            }
            if (myCollection.get(i) < min) {
                min = myCollection.get(i);
                minIndex = i;

            }
        }
        System.out.println("Minimal number = " + min + " in index = " + minIndex +
                "\n Maximum number = " + max + " in index = " + maxIndex);

        myCollection.set(minIndex,max);
        myCollection.set(maxIndex,min);
        myCollection.forEach((n) -> System.out.println(n));
    }

    public void swapElements(){
        for(int i=0;i<myCollection.size();i++){
            if(myCollection.get(i) < 0){
                myCollection.add(i,rand.nextInt(999));
                break;
            }
        }
        myCollection.forEach((n) -> System.out.println(n));

    }
    public void addZero(){
        for(int i = 0;i<myCollection.size();i++){
            if(myCollection.get(i) > 0 || myCollection.get(i) <0){
                myCollection.add(i+1,0);
            }
        }
        myCollection.forEach((n) -> System.out.println(n));
    }
    public void copyElementsToLists(){
        for(int i = 0;i<myCollection.size();i++){
            if(i<myCollection.size()/2) list1.add(i);
            else list2.addFirst(i);
        }
        list1.forEach((n) -> System.out.println(n));
        list2.forEach((n) ->System.out.println(n));
    }

    public void removeLastEvenElement(){
        for (int i = 0;i<myCollection.size();i++){
            if(myCollection.get(i)%2 == 0){
                evenList.add(i);
                System.out.println("Number = " + myCollection.get(i) + "\n Index" + i);
                myCollection.remove(evenList.getLast());
            } else System.out.println("This number isn't even");
        }
        myCollection.forEach((n) ->System.out.println(n));
    }
    public void removeLastMinimalElement(){
        min = myCollection.get(0);
        for(int i=0;i<myCollection.size();i++){
            if (myCollection.get(i) < min) {
                min = myCollection.get(i);
                minIndex = i;
            }
        }

        for (int j=0;j<myCollection.size();j++){
            if(myCollection.getLast() == min){
                System.out.println(myCollection.get(j) + " this element is last!");
                break;
            } else myCollection.remove(minIndex);
        }
    }


}
