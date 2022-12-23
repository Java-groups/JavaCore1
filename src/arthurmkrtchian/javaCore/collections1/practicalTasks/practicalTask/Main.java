package arthurmkrtchian.javaCore.collections1.practicalTasks.practicalTask;


//        Declare collection myCollection of 10 integers and fill it (from the console or random).
//        • Find and save in list newCollection all positions of element more than 5 in the collection.
//        Print newCollection
//        • Remove from collection myCollection elements, which are greater then 20. Print result
//        • Insert elements 1, -3, -4 in positions 2, 8, 5. Print result in the format: “position – xxx,
//        value of element – xxx”
//        • Sort and print collection
//        Use one or more of the next: List, ArrayList, LinkedList


import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<>();
        List<Integer> newCollection = new ArrayList<>();
        Random random = new Random();

        System.out.println();
        System.out.println("First collection contains next numbers:");
        for (int i = 0; i < 10; i++) {
            myCollection.add(random.nextInt(100));
            System.out.printf("Position - %d, Value - %d\n", i+1, myCollection.get(i));
        }

        System.out.println();
        System.out.println("Collection without numbers less than 5 contains next numbers:");
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 5){
                newCollection.add(myCollection.get(i));
                System.out.printf("Position - %d, Value - %d\n", i+1, myCollection.get(i));
            }
        }

        for (int i = 0; i < newCollection.size(); i++) {
            if (newCollection.get(i) > 20){
                myCollection.remove((Integer) newCollection.get(i));
            }
        }

        System.out.println();
        System.out.println("After deleting all elements bigger than 20, collection contains next numbers:");
        for (int i = 0; i < myCollection.size(); i++) {
            System.out.printf("Position - %d, Value - %d\n", i+1, myCollection.get(i));
        }

        while (myCollection.size() < (10-3)){
            myCollection.add(null);
        }

        myCollection.add(2,1);
        myCollection.add(8,-3);
        myCollection.add(5,-4);


        System.out.println();
        System.out.println("After adding elements on their position collection contains next numbers:");
        for (int i = 0; i < myCollection.size(); i++) {
            System.out.printf("Position - %d, Value - %d\n", i+1, myCollection.get(i));
        }

        System.out.println();
        System.out.println("Sorted collection:");

        Collections.sort(myCollection, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if ( o1 == null){
                    return null == o2 ? 0 : 1;
                } else if (o2 == null){
                    return -1;
                }
                return o1-o2;
            }
        });


        //while(myCollection.remove(null));
        for (int i = 0; i < myCollection.size(); i++) {
            System.out.printf("Position - %d, Value - %d\n", i+1, myCollection.get(i));
        }

    }
}

