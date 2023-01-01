import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();

        ArrayList<Integer> integerArrayList = MyCollection.create(rand);
        System.out.println("Initial ArrayList: "+integerArrayList);

        ArrayList<Integer> minAndMaxChanged = MyCollection.changeMinAndMax(integerArrayList);
        System.out.println("Changed min and max: "+minAndMaxChanged);


        ArrayList<Integer> insertThreeRandom = MyCollection.insertThreeRandom(minAndMaxChanged, rand);
        System.out.println("Insert 3 random before the first negative"+ insertThreeRandom);

        ArrayList<Integer> insertZero = MyCollection.insertZero(insertThreeRandom);
        System.out.println("Insert a zero"+insertZero);

        List<Integer> firstPart = MyCollection.splitIntoTwo(insertZero).get(0);
        List<Integer> secondPart = MyCollection.splitIntoTwo(insertZero).get(1);
        Collections.reverse(secondPart);
        System.out.println("First part"+firstPart.toString());
        System.out.println("Second part reverse"+secondPart.toString());

        MyCollection.removeLastIfEven(integerArrayList);

        MyCollection.removeFollowFirstMin(integerArrayList);
        System.out.println("Remove the element following the first minimum"+integerArrayList);
    }
}