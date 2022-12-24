package HM8.PracticalTask;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int enteredNumber;

        int myCollectionSize = 10;
        List<Integer> myCollection = new ArrayList<>(myCollectionSize);
        System.out.println("Please enter 10 integer numbers");
        for (int i = 0; i < myCollectionSize; i++) {
            enteredNumber = sc.nextInt();
            myCollection.add(i, enteredNumber);
        }
        System.out.println("myCollection: " + myCollection);

        List<Integer> newCollection = new ArrayList<>();
        int newCollectionElPos;

        for (int i = 0; i < myCollectionSize; i++) {
            if (myCollection.get(i) > 5) {
                newCollectionElPos = i + 1;
                newCollection.add(newCollectionElPos);
            }
        }
        System.out.println("newCollection: " + newCollection);

        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 20) {
                myCollection.remove(i);
                i--;
            }
        }
        System.out.println("myCollection without elements greater than 20: " + myCollection);

        if (myCollection.size() >= 2) {
            myCollection.add(1, 1);
        }
        if (myCollection.size() >= 5) {
            myCollection.add(4, -4);
        }
        if (myCollection.size() >= 8) {
            myCollection.add(7, -3);
        }

        System.out.println("myCollection with inserted elements:");
        for (int i = 0; i < myCollection.size(); i++) {
            System.out.println("position - " + (i + 1) + ", " + "value of element - " + myCollection.get(i));
        }

        Collections.sort(myCollection);
        System.out.println("Sorted myCollection: " + myCollection);
    }
}
