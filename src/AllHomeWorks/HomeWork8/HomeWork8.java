package AllHomeWorks.HomeWork8;

import Helper.RandomHelper;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;

public class HomeWork8 {
    public static void doTask(BufferedReader br) throws IOException {
        int maxLength = 10;
        int indexOfMin = 0;
        int indexOfMax = 0;
        int elementMax = 0;
        int elementMin = 0;

        ArrayList<Integer> myCollectionsList = new ArrayList<>();

        for (int i = 0; i < maxLength; i++) {
            myCollectionsList.add(RandomHelper.negativePositiveInteger(40));
        }
        System.out.println("Started Array");
        System.out.println(myCollectionsList);

        for (int i = 1; i < myCollectionsList.size(); i++){
            if (myCollectionsList.get(i) > (myCollectionsList.get(indexOfMax))){
                indexOfMax = i;
            }
            if (myCollectionsList.get(i) < (myCollectionsList.get(indexOfMin))){
                indexOfMin = i;
            }
        }
        elementMax = myCollectionsList.get(indexOfMax);
        elementMin = myCollectionsList.get(indexOfMin);


        System.out.printf("indexMax = %d, indexMin = %d, elMax = %d, elMin = %d", indexOfMax, indexOfMin, elementMax, elementMin);

        myCollectionsList.set(indexOfMin, elementMax);
        myCollectionsList.set(indexOfMax, elementMin);
        System.out.println("\nChange min and max position");
        System.out.println(myCollectionsList);

        int randomElement = 0;
        try {
            randomElement = RandomHelper.negativePositiveInteger(999, 3);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < myCollectionsList.size(); i++){
            if (myCollectionsList.get(i) < 0){
                myCollectionsList.add(i, randomElement);
                break;
            }
        }
        System.out.println("\nAdd random three-digit number");
        System.out.println(myCollectionsList);

        for(int i = 0; i < myCollectionsList.size()-1; i++){
            Integer element1 = myCollectionsList.get(i);
            Integer element2 = myCollectionsList.get(i+1);
            if (element1 != 0 && element2 != 0 && (element1 ^ element2) < 0){
                myCollectionsList.add(i+1, 0);
            }
        }
        System.out.println("\nInserted a zero");
        System.out.println(myCollectionsList);

        int k = 7;
        List<Integer> list1 = myCollectionsList.subList(0, k);
        List<Integer> list2 = myCollectionsList.subList(k, myCollectionsList.size());

        System.out.println("\nSplit into 2 lists");
        System.out.println(list1);
        Collections.reverse(list2);
        System.out.println(list2);

        boolean hasEvenNumbers = false;
        for (int i = myCollectionsList.size() - 1; i >=0 ; i--){
            if (((myCollectionsList.get(i) % 2) == 0) && myCollectionsList.get(i) != 0){
                hasEvenNumbers = true;
                myCollectionsList.remove(i);
                break;
            }
        }
        if (!hasEvenNumbers){
            System.out.println("There are no even elements in Array");
        }
        System.out.println("\nDeleted last even element");
        System.out.println(myCollectionsList);

        indexOfMin = 0;
        for (int i = 1; i < myCollectionsList.size(); i++){
            if (myCollectionsList.get(i) < (myCollectionsList.get(indexOfMin))){
                indexOfMin = i;
            }
        }
        myCollectionsList.remove(indexOfMin + 1);

        System.out.println("\nRemoved the element following the first minimum");
        System.out.println(myCollectionsList);

    }
}
