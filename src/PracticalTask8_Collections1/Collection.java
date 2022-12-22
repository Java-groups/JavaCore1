package PracticalTask8_Collections1;

import java.util.ArrayList;
import java.util.List;


public class Collection {
    private static int lengthList = 10;

    public List<Integer> fillList(List<Integer> myCollection) {
        for (int i = 0; i < lengthList; i++) {
            int minus = Math.random() < 0.5 ? -1 : 1;
            myCollection.add(((int) (Math.random() * 30 + 1)) * minus);
        }
        return myCollection;
    }

    public List<Integer> selectionList(List<Integer> myCollection) {
        List<Integer> listToReturn = new ArrayList<>();
        for (Integer i : myCollection) {
            if (i < 5) {
                listToReturn.add(i);
            }
        }
        return listToReturn;
    }

    public void delList(List<Integer> myCollection) {
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 20) {
                myCollection.remove(i);
            }
        }
    }

    public void insertList(List<Integer> myCollection) { // Вставить элементы 1, -3, -4 в позиции 2, 8, 5
        if (myCollection.size() >= 9) {
            myCollection.add(2, 1);
            myCollection.add(5, -4);
            myCollection.add(8, -3);
        } else if (myCollection.size() >= 6) {
            myCollection.add(2, 1);
            myCollection.add(5, -4);
        } else if (myCollection.size() >= 3) {
            myCollection.add(2, 1);
        } else {
            System.out.println("Невозможно добавить ни одного элемента");
        }
    }

    public void printList(List<Integer> myCollection) { // печать листа
        for(int i = 0; i < myCollection.size(); i++) {
            System.out.println("position = " + i + " , " + "value of element = " + myCollection.get(i));
        }
    }
}
