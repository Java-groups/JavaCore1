package com.edu.hometask8;
/*     Declare collection myCollection of 10 integers and fill it (from the console or random).
       • Swap the maximum and minimum elements in the list.
       • Insert a random three-digit number before the first negative element of the list
       • Insert a zero between all neighboring elements collection myCollection with different signs
       • Copy the first k elements of the myCollection to the list1, in direct order, and the rest to the
          list2 in reverse order.
       • In a list myCollection remove the last even element (if there are even elements in the list). If
          there is no such element, display a message.
       • Remove from the list myCollection the element following the first minimum. If the minimum
          element is the last one, nothing needs to be removed.
        */
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class CollectionH {

    private List<Integer> myCollection = new LinkedList<>();

    public List<Integer> fillMyCollection() {
        for (int i = 0; i < 10; i++) {
            myCollection.add((int) (Math.random() * 30) - 15);
        }
        System.out.println("myCollection:______________________" + myCollection);
        return myCollection;
    }

    public void swapMaxMin() {

        Integer max = Collections.max(myCollection);
        Integer min = Collections.min(myCollection);

        System.out.println("Max element: " + max + ",  Min element: " + min);

        Collections.swap(myCollection, myCollection.indexOf(max), myCollection.indexOf(min));

        System.out.println("myCollection swapped max and min:__" + myCollection);

    }

    public void insertBeforeNeg() {
        int i;

        for (i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < 0) {

                myCollection.get(i);

                break;

            }
        }

        System.out.println("myCollection first negative: " + myCollection.get(i) + " myCollection index first negative: " + i);

        int indexFirstNeg = i;

        for (i = 0; i < 3; i++) {

            Integer numberAdded = ((int) (Math.random() * 30) - 15);

            myCollection.add(indexFirstNeg, numberAdded);

            System.out.println("Added number: " + "`" + numberAdded + "`");

        }
        System.out.println("myCollection with added three numbers: " + myCollection);

    }

    public void insertZero() {

        Integer zero = 0;

        for (int i = 1; i < myCollection.size(); i++) {

            if (((myCollection.get(i - 1) < 0) & (myCollection.get(i) > 0)) | ((myCollection.get(i - 1) > 0) & (myCollection.get(i) < 0))) {

                myCollection.add(i, zero);

            }
        }
        System.out.println("myCollection with 0 between" + " elements with different sings: " + myCollection);
    }

    public void copyDirAndReverse() {
        int indexK = myCollection.size() / 2;

        List<Integer> list1 = myCollection.subList(0, indexK);

        System.out.println("list1: " + list1);

        List<Integer> list2 = myCollection.subList(indexK, myCollection.size());

        Collections.reverse(list2);

        System.out.println("list2: " + list2);

    }

    public void removeLastEven() {

        int indexEven = 0;

        for (int i = 0; i < myCollection.size(); i++) {

            if (myCollection.get(i) % 2 == 0) {

                indexEven = i;

            }
        }

        System.out.println("Index of the last even number: " + indexEven + ", Even element value: " + myCollection.get(indexEven));
        System.out.println("Actual myCollection (part that used in the sublist reversed): " + "\n" + myCollection);
        myCollection.remove(indexEven);
        System.out.println("Actual myCollection after deletion last even number: " + "\n" + myCollection);
    }

    public void removeNextMin() {

        Integer min = Collections.min(myCollection);
        int minIndex = myCollection.indexOf(min);

        System.out.println("minIndex: " + minIndex + ", min value: " + min);

        if (minIndex != myCollection.size() - 1) {

            myCollection.remove(minIndex + 1);

            System.out.println("myCollection with removed element following the first minimum: " + "\n" + myCollection);

        } else {
            System.out.println("Min element is the last in myCollection");

        }
    }
}




