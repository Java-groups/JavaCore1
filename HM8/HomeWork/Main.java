package HM8.HomeWork;

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

        //Swap the maximum and minimum elements in the list
        int maxEl = Collections.max(myCollection);
        int maxElIndex = myCollection.indexOf(Collections.max(myCollection));
        int minEl = Collections.min(myCollection);
        int minElIndex = myCollection.indexOf(Collections.min(myCollection));

        myCollection.set(maxElIndex, minEl);
        myCollection.set(minElIndex, maxEl);

        System.out.println("myCollection after swapping max and min elements: " + myCollection);


        //Insert a random three-digit number before the first negative element of the list
        int randomNum = (int)(Math.random()*(999-100+1)+100);
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < 0) {
                    myCollection.add(i, randomNum);
                    break;
            }
        }
        System.out.println("myCollection after adding a random number: " + myCollection);

        //Insert a zero between all neighboring elements collection myCollection with different signs
        for (int i = 0; i < (myCollection.size() - 1); i++) {
            if ((myCollection.get(i) > 0 && myCollection.get(i+1) < 0) || (myCollection.get(i) < 0 && myCollection.get(i+1) > 0)) {
                myCollection.add(i+1, 0);
            }
        }
        System.out.println("myCollection after inserting zero: " + myCollection);

        //Copy the first k elements of the myCollection to the list1, in direct order, and the rest to the list2 in reverse order.
        List<Integer> list1 = new LinkedList<>();
        List<Integer> list2 = new LinkedList<>();
        int k = 3;
        int m = 0;

        for (int i = 0; i < k; i++) {
            list1.add(i, myCollection.get(i));
        }
        for (int i = myCollection.size() - 1; i > k - 1; i--) {
            list2.add(m, myCollection.get(i));
            m++;
        }
        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);

        //In a list myCollection remove the last even element (if there are even elements in the list).
        //If there is no such element, display a message.
        int oddNum = 0;
        for (int i = myCollection.size() - 1; i >= 0; i--) {
            if (myCollection.get(i) % 2 == 0) {
                myCollection.remove(i);
                break;
            } else {oddNum++;}
        }
        if (oddNum == myCollection.size()) {
            System.out.println("No even elements in the collection");
        } else {
            System.out.println("myCollection with removed last even element: " + myCollection);
        }

        //Remove from the list myCollection the element following the first minimum.
        //If the minimum element is the last one, nothing needs to be removed.
        minEl = Collections.min(myCollection);
        minElIndex = myCollection.indexOf(Collections.min(myCollection));
        myCollection.remove(minElIndex + 1);
        System.out.println("myCollection with removed element following the first minimum: " + myCollection);
    }
}
