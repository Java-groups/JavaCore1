package arthurmkrtchian.javaCore.HW8.collections1.homeWorks.homework;

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

import java.util.*;

public class Main {

    public static void main(String[] args) {

        CollectionsX collectionsX = new CollectionsX();
        List<Integer> myCollection = new ArrayList<>();
        Random random = new Random();
        System.out.println();

        System.out.println("Original collection:");
        for (int i = 0; i < 10; i++) {
            myCollection.add((random.nextInt(100)) - random.nextInt(100));
            System.out.printf("Position - %d, Value - %d\n", i + 1, myCollection.get(i));
        }


        //Swap the maximum and minimum elements in the list
        Collections.swap(
                myCollection,
                myCollection.indexOf(Collections.min(myCollection)),
                myCollection.indexOf(Collections.max(myCollection))
        );

        System.out.println("\nSwapped the maximum and minimum elements in the collection:");
        collectionsX.printList(myCollection);

        //Insert a random three-digit number before the first negative element of the list
        int insertPosition = collectionsX.getFirsNegativeIndex(myCollection);
        if (insertPosition != -1) {
            myCollection.add(insertPosition, random.nextInt(900)+100);
        }

        System.out.println("Inserted three-digit-random-generated number in collection before the first negative element");
        collectionsX.printList(myCollection);

        //Insert a zero between all neighboring elements collection myCollection with different signs
        CollectionsX.insertZero(myCollection);
        System.out.println("Inserted a zero between all neighboring elements collection myCollection with different signs");
        collectionsX.printList(myCollection);


        //Copy the first k elements of the myCollection to the list1, in direct order, and the rest to the
        //list2 in reverse order.
        List<Integer> list1 = myCollection.subList(0,myCollection.size()/2);
        List<Integer> list2 = CollectionsX.cloneList(myCollection.subList(myCollection.size()/2, myCollection.size()));
        Collections.reverse(list2);

        // Тут ще стало зрозуміло, що якщо ми робиьмо субліст із осноного ліста,
        // то все одно ми тільки переносимо адреси об'єктів а не створюємо абсолютно новий лист.
        // Як результат на момент написання цього коментарю я маю половину myCollection ліста в зворотньому порядку

        System.out.println("1st sublist of collection in right order:");
        collectionsX.printList(list1);
        System.out.println("2nd sublist of collection in reverse order:");
        collectionsX.printList(list2);


        //In a list myCollection remove the last even element (if there are even elements in the list). If
        //there is no such element, display a message.
        if (CollectionsX.removeLastEven(myCollection)){
            System.out.println("Removed the last even element from collection:");
            CollectionsX.printList(myCollection);
        } else {
            System.out.println("The last element of the collection is not even");
        }


        //Remove from the list myCollection the element following the first minimum. If the minimum
        //element is the last one, nothing needs to be removed.

        int firstMinimumIndex = myCollection.indexOf(Collections.min(myCollection));
        int firstMinimumValue = myCollection.get(firstMinimumIndex);
        if (firstMinimumIndex != myCollection.size()-1){
            myCollection.remove((int) firstMinimumIndex); //It is for sure :)
            System.out.printf("Removed the minimum from collection. Position was: %d, Value was: %d\n", firstMinimumIndex +1, firstMinimumValue);
            CollectionsX.printList(myCollection);
        } else {
            System.out.println("Nothing removed...");
        }
    }
}
