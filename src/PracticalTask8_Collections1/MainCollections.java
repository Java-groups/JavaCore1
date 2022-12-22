package PracticalTask8_Collections1;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class MainCollections {
    public static void main(String[] args) {

        List<Integer> myCollection = new ArrayList<>();
        Collection list = new Collection();
        list.fillList(myCollection);  // заполняем
        System.out.println("\nmyCollection:  " + myCollection);

        List<Integer> newCollection = list.selectionList(myCollection);  // все меньше 5
        System.out.println("\nnewCollection (< 5):  " + newCollection);

        list.delList(myCollection);  // удалить больше 20
        System.out.println("\ndel myCollection (del > 20):  " + myCollection);

        list.insertList(myCollection);  // Вставить элементы 1, -3, -4 в позиции 2, 8, 5
        System.out.println("\ninsert myCollection (insert 1, -4, -3) :  " + myCollection + "\n");

        list.printList(myCollection);  // печать листа в заданом формате

        Collections.sort(myCollection);  // печать упорядоченого листа
        System.out.println("\nsort myCollection:  " + myCollection);
    }
}
