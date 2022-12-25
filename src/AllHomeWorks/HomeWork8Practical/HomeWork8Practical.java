package AllHomeWorks.HomeWork8Practical;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class HomeWork8Practical {
    public static void doTask(BufferedReader br) throws IOException {
        int maxLength = 10;

        ArrayList<Integer> myCollectionsList = new ArrayList<>();
        ArrayList<Integer> newCollectionsList = new ArrayList<>();
        for (int i = 0; i < maxLength; i++) {
            myCollectionsList.add((int) (Math.random() * 40));
        }
        System.out.println(myCollectionsList);

        for (int i = maxLength - 1; i >=0 ; i--) {
            int element = myCollectionsList.get(i);

            if (element > 5) {
                newCollectionsList.add(i);
            }
            if (element > 20){
                myCollectionsList.remove(i);
            }

        }
        System.out.println(myCollectionsList);
        if (myCollectionsList.size() < 2) {
            System.out.println("Array hasn't 2 or more elements");
        } else {
            myCollectionsList.add(2, 1);
        }

        if (myCollectionsList.size() < 8) {
            System.out.println("Array hasn't 8 or more elements");
        } else {
            myCollectionsList.add(8, -3);
        }

        if (myCollectionsList.size() < 5) {
            System.out.println("Array hasn't 5 or more elements");
        } else {
            myCollectionsList.add(5, -4);
        }


        newCollectionsList.sort(Integer::compareTo);

        System.out.println(newCollectionsList);
        System.out.println(myCollectionsList);

        for (int i = 0; i < myCollectionsList.size(); i++) {
            System.out.printf("position - %d, value of element - %d\n", i, myCollectionsList.get(i));
        }
        myCollectionsList.sort(Integer::compareTo);
        System.out.println(myCollectionsList);


    }
}