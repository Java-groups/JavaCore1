package HW8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class PracticalTask {
    public static void main(String[] args) {
        List<Integer> myCollection = new LinkedList<Integer>();
        myCollection.add(25);
        myCollection.add(42);
        myCollection.add(6);
        myCollection.add(8);
        myCollection.add(-8);
        myCollection.add(1);
        myCollection.add(5);
        myCollection.add(7);
        myCollection.add(9);
        myCollection.add(21);
        myCollection.add(32);
        List<Integer> newCollection = new LinkedList<Integer>();
        for (int i = 0; i < myCollection.size(); i++) {
            if(myCollection.get(i) > 5){
                newCollection.add(myCollection.get(i));

            }
        }
        System.out.println(newCollection);
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 20){
                myCollection.remove(i);
                i--;
            }
            
        }
        System.out.println(myCollection);
        myCollection.add(2,1);
        myCollection.add(8,-3);
        myCollection.add(5,-4);
        for (int i = 0; i < myCollection.size(); i++) {
            System.out.println("position- " + i + " value of element- " + myCollection.get(i));



        }
        Collections.sort(myCollection);
        System.out.println(myCollection);

    }



}
