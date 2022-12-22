package HW8;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class HW8 {
    public static void main(String[] args) {
        List<Integer> myCollection1 = new LinkedList<Integer>();
        myCollection1.add(25);
        myCollection1.add(6);
        myCollection1.add(-6);
        myCollection1.add(8);
        myCollection1.add(-8);
        myCollection1.add(1);
        myCollection1.add(5);
        myCollection1.add(90);
        myCollection1.add(9);
        myCollection1.add(21);
        myCollection1.add(-21);
        int max = 0;
        int min = 0;
        int temp = 0;
        int minPosition = 0;
        int maxPosition = 0;

        for (int i = 0; i < myCollection1.size(); i++) {
            if (myCollection1.get(i) > max) {
                max = myCollection1.get(i);
                maxPosition = i;
            }

        }
        System.out.println("My list: " + myCollection1);
        System.out.println("Max number: " + max);
        for (int i = 0; i < myCollection1.size(); i++) {
            if (myCollection1.get(i) < min) {
                min = myCollection1.get(i);
                minPosition = i;
            }

        }
        System.out.println("Min number: " + min);
        temp = myCollection1.get(minPosition);
        myCollection1.set(minPosition, myCollection1.get(maxPosition));
        myCollection1.set(maxPosition, temp);
        System.out.println("Switch max and min: " + myCollection1);
        for (int i = 0; i < myCollection1.size(); i++) {
            if (myCollection1.get(i) < 0) {
                myCollection1.add(i, 345);
                break;
            }
        }
        System.out.println("Add 345: " + myCollection1);

        boolean isPositive = false;
        for (int i = 0; i < myCollection1.size(); i++) {
            if (myCollection1.get(i) > 0) {
                isPositive = true;
            } else {
                isPositive = false;
            }
            if (i + 1 < myCollection1.size()) {
                if (isPositive && myCollection1.get(i + 1) < 0) {
                    myCollection1.add(i + 1, 0);
                    i++;
                } else {
                    if (!isPositive && myCollection1.get(i + 1) > 0) {
                        myCollection1.add(i + 1, 0);
                        i++;
                    }
                }
            }
        }
        System.out.println("List with 0: " + myCollection1);
        List<Integer> list1 = new LinkedList<Integer>(myCollection1.subList(0, 5));
        System.out.println("List: " + list1);
        List<Integer> list2 = new LinkedList<Integer>(myCollection1.subList(5, 10));
        Collections.reverse(list2);


        System.out.println("List in reverse: " + list2);

        int lastPosition = 0;
        for (int i = 0; i < myCollection1.size(); i++) {
            if (myCollection1.get(i) % 2 == 0) {
                lastPosition = i;
            }
        }
        myCollection1.remove(lastPosition);
        System.out.println("List without last even number: " + myCollection1);

        int followingPosition = 0;
        for (int i = 0; i < myCollection1.size(); i++) {
            if (myCollection1.get(i) < 0) {
                followingPosition = i + 1;
                break;

            }
        }
        myCollection1.remove(followingPosition);
        System.out.println("Remove following position: " + myCollection1);
    }
}
