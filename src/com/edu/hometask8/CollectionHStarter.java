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
public class CollectionHStarter {

    public static void main(String[] args) throws IndexOutOfBoundsException {

        CollectionH collections = new CollectionH();


        collections.fillMyCollection();
        collections.swapMaxMin();
        collections.insertBeforeNeg();
        collections.insertZero();
        collections.copyDirAndReverse();
        collections.removeLastEven();
        collections.removeNextMin();
    }
}
