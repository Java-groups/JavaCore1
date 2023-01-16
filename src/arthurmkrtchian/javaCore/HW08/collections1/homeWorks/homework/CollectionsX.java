package arthurmkrtchian.javaCore.HW08.collections1.homeWorks.homework;

import java.util.ArrayList;
import java.util.List;


//        Declare collection myCollection of 10 integers and fill it (from the console or random).
//        • Swap the maximum and minimum elements in the list.
//        • Insert a random three-digit number before the first negative element of the list
//        • Insert a zero between all neighboring elements collection myCollection with different signs
//        • Copy the first k elements of the myCollection to the list1, in direct order, and the rest to the
//        list2 in reverse order.
//        • In a list myCollection remove the last even element (if there are even elements in the list). If
//        there is no such element, display a message.
//        • Remove from the list myCollection the element following the first minimum. If the minimum
//        element is the last one, nothing needs to be removed.


public class CollectionsX {

    public static int getFirsNegativeIndex(List<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 0){
                return list.indexOf(list.get(i));
            }
        }
        return -1;
    }

    public static void printList(List<Integer> list){

        for (int i = 0; i < list.size(); i++) {
            System.out.printf("Position: %d, Value: %d\n",i+1, list.get(i));
        }
        System.out.println();
    }

    public static void insertZero(List<Integer> list){
        List<Integer> indexes = new ArrayList<>();
        int zeros = 0;

        for (int i = 0; i < list.size() -1; i++) {
            if ( (list.get(i) > 0 && list.get(i+1) < 0) || (list.get(i) < 0 && list.get(i+1) > 0)){
                indexes.add(i+1);
            }
        }
        for (Integer index : indexes) {
            list.add(index + zeros, 0);
            zeros++;
        }
    }

    public static boolean removeLastEven(List<Integer> list){
        for (int i = list.size()-1; i <= 0; i++) {
            if (list.get(i) % 2 == 0){
                list.remove(list.get(i));
                return true;
            }
        }
        return false;
    }

    public static List<Integer> cloneList(List<Integer> copyOf){
        List<Integer> result = new ArrayList<>();
        for (Integer integer : copyOf) {
            result.add(integer);
        }
        return result;
    }
}
