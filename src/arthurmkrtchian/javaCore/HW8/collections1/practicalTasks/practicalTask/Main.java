package arthurmkrtchian.javaCore.HW8.collections1.practicalTasks.practicalTask;


//        Declare collection myCollection of 10 integers and fill it (from the console or random).
//        • Find and save in list newCollection all positions of element more than 5 in the collection.
//        Print newCollection
//        • Remove from collection myCollection elements, which are greater then 20. Print result
//        • Insert elements 1, -3, -4 in positions 2, 8, 5. Print result in the format: “position – xxx,
//        value of element – xxx”
//        • Sort and print collection


import java.util.*;

public class Main {

    static List<Integer> myCollection = new ArrayList<>();
    static List<Integer> newCollection = new ArrayList<>();


    public static void main(String[] args) {
        run();
    }

    public static void run(){
        generateCollection(myCollection, 10 ,100);
        getPositions(myCollection, newCollection, 5);
        deleteGreater(myCollection, 20);

        List<ListItem> listItems = new ArrayList<>();
        listItems.add(new ListItem(2, 1));
        listItems.add(new ListItem(8, -3));
        listItems.add(new ListItem(5, -4));
        insertItems(myCollection, listItems);

        sortCollection(myCollection);

    }

    static void generateCollection(List<Integer> collection, int itemsCount, int bound){
        Random random = new Random();
        for (int i = 0; i < itemsCount; i++) {
            collection.add(random.nextInt(bound) - (random.nextInt(bound) * -1));
        }
        displayCollection(
                "Collection is generated: ",
                collection);
    }

    static void displayCollection(String heading, List<Integer> collection){
        int index = 0;
        System.out.println("\n"+heading);
        for (Integer item: collection){
            System.out.printf(
                    "Position - %d, Value - %d\n",
                    index,
                    item);
            index++;
        }
    }

    static void getPositions(List<Integer> originalCollection, List<Integer> destinationCollection, int bound){
        for (int i = 0; i < originalCollection.size(); i++) {
            if (originalCollection.get(i) > bound){
                destinationCollection.add(i);
            }
        }
        displayCollection(
                "All positions of element more than 5 in the collection",
                destinationCollection);
    }

    static void deleteGreater(List<Integer> collection, int bound) {
        for (int i = 0; i < collection.size(); i++) {
            if (collection.get(i) > bound) {
                collection.remove(collection.get(i));
            }
        }
        displayCollection(
                "After deleting all elements bigger than 20, collection contains next numbers:",
                collection);
    }

    static void insertItems(List<Integer> collection, List<ListItem> items){
        for (ListItem item : items) {

            if (item.getIndex() < collection.size() - 1) {
                collection.add(
                        item.getIndex(),
                        item.getValue());
            } else {
                System.out.printf(
                        "\nCan`t add item with index %d, the collection size is only %s elements\n",
                        item.getIndex(),
                        collection.size());
            }
        }
        displayCollection(
                "After adding elements on their position, the collection contains next numbers: ",
                collection
        );

    }

    static void sortCollection(List<Integer> collection){
        collection.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 == null) {
                    return null == o2 ? 0 : 1;
                } else if (o2 == null) {
                    return -1;
                }
                return o1 - o2;
            }
        });
        displayCollection("Sorted collection:", collection);
    }

}

