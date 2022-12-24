package HW8.Task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main extends Collection {
    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            myCollection.add(i, random.nextInt(-100, 100));
        }
        System.out.println(myCollection);
        System.out.println(swapMaxMin(myCollection));
        System.out.println(addThreeNumbers(myCollection));
        System.out.println(addZero(myCollection));
        System.out.println(split(myCollection));
        System.out.println(deleteLastEven(myCollection));
        System.out.println(deleteElement(myCollection));

// Did not add any comments because it is easier to check the result :)
//
    }
}
