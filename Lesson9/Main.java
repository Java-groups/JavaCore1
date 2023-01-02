package Lesson9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> myCollection = new LinkedList<>(List.of(6, 80, 3, 8, 1, 15, -2, -9, 7, 56));

        List<Integer> newCollection = new ArrayList<>();
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 5) {
                newCollection.add(i);
            }
        }
        System.out.println(newCollection);

        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 20) {
                myCollection.remove(i);
            }
        }
        System.out.println(myCollection);

        insertIfPossible(myCollection, 2, 1);
        insertIfPossible(myCollection, 8, -3);
        insertIfPossible(myCollection, 5, -4);
        for (int i = 0; i < myCollection.size(); i++) {
            System.out.println(String.format("Position - %d value of element - %d", i, myCollection.get(i)));
        }

        Collections.sort(myCollection);
        System.out.println(myCollection);
    }

    private static void insertIfPossible(List<Integer> list, int index, int num) {
        if (index <= list.size() - 1) {
            list.add(index, num);
        }
    }
}
