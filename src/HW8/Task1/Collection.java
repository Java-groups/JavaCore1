package HW8.Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Collection {
    public static List<Integer> insertElement(List<Integer> list, int positionNumber, int number) {
        if (list.size() > positionNumber) {
            list.add(positionNumber, number);
        } else System.out.println("the list is too short");

        return list;
    }


    public static void main(String[] args) throws IOException {
        ArrayList<Integer> myCollection = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            System.out.println("Input element to the collection: ");
            myCollection.add(i, Integer.parseInt(bufferedReader.readLine()));

        }
        System.out.println(myCollection);
        ArrayList<Integer> newCollection = new ArrayList<>();
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 5) {
                newCollection.add(myCollection.get(i));
            }
        }
        System.out.println(newCollection);


        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 20) {
                myCollection.set(i, 0);
            }
        }
        myCollection.removeAll(List.of(0));
        System.out.println(myCollection);

        System.out.println(insertElement(myCollection, 2, 1));
        System.out.println(insertElement(myCollection, 8, -3));
        System.out.println(insertElement(myCollection, 5, -4));


        myCollection.sort(Integer::compareTo);

        System.out.println(myCollection);

    }
}
