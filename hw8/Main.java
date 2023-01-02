package hw8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<>(List.of(2, -11, 6, -76, 45, 87, 98, 35, 67, 26));

        System.out.println("Original collection: ");
        System.out.println(myCollection);

        // swap the maximum and minimum elements
        int max = 0;
        int iMax = 0;
        int min = 0;
        int iMin = 0;
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > max) {
                max = myCollection.get(i);
                iMax = i;
            }
            if (myCollection.get(i) < min) {
                min = myCollection.get(i);
                iMin = i;
            }
        }
        myCollection.set(iMin, max);
        myCollection.set(iMax, min);

        System.out.println("Min and max swapped: ");
        System.out.println(myCollection);

        // insert a random number
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < 0) {
                myCollection.add(i, 356);
                break;
            }
        }

        System.out.println("Inserted random number before first negative number: ");
        System.out.println(myCollection);

        // insert a zero
        for (int i = 0; i < myCollection.size(); ) {
            if (!(myCollection.size() - 1 == i) && differentSigns(myCollection.get(i), myCollection.get(i + 1))) {
                myCollection.add(i + 1, 0);
                i++;
            }
            i++;
        }

        System.out.println("Inserted a zero between all neighboring elements collection myCollection with different signs: ");
        System.out.println(myCollection);

        // copy k elements
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int el : myCollection) {
            if (list1.size() < 5) {
                list1.add(el);
            } else {
                list2.add(0, el);
            }
        }

        System.out.println("Copied the first k elements of the myCollection in direct order: ");
        System.out.println(list1);
        System.out.println("Copied rest of elements of the myCollection in reverse order: ");
        System.out.println(list2);

        //remove the last even element
        for (int i = myCollection.size() - 1; i >= 0; i--) {
            if (myCollection.get(i) % 2 == 0 && myCollection.get(i) > 0) {
                myCollection.remove(myCollection.get(i));
                break;
            }
            if (i == 0) {
                System.out.println("There is no even element in the list: ");
            }
        }

        System.out.println("Removed the last even element: ");
        System.out.println(myCollection);

        //Remove the element following the first minimum
        List<Integer> copy = new ArrayList<>(myCollection);
        Collections.sort(copy);
        int minimum = copy.get(0);
        int indexOfFirstMinimum = myCollection.indexOf(minimum);
        myCollection.remove(indexOfFirstMinimum + 1);

        System.out.println("Removed from the list the element following the first minimum: ");
        System.out.println(myCollection);
    }

    private static boolean differentSigns(int a, int b) {
        return a > 0 ^ b > 0;
    }
}