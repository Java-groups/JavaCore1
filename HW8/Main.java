import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();

        ArrayList<Integer> integerArrayList = MyCollection.create(rand);
        System.out.println("Initial ArrayList: "+integerArrayList);

        MyCollection.changeMinAndMax(integerArrayList);
        System.out.println("Changed min and max: "+integerArrayList);


        MyCollection.insertThreeRandom(integerArrayList, rand);
        System.out.println("Insert 3 random before the first negative"+ integerArrayList);

        MyCollection.insertZero(integerArrayList);
        System.out.println("Insert a zero"+integerArrayList);

        List<List<Integer>> splitIntoTwo = MyCollection.splitIntoTwo(integerArrayList);
        Collections.reverse(splitIntoTwo.get(1));
        System.out.println("First part"+splitIntoTwo.get(0).toString());
        System.out.println("Second part reverse"+splitIntoTwo.get(1).toString());

        MyCollection.removeLastIfEven(integerArrayList);

        MyCollection.removeFollowFirstMin(integerArrayList);
        System.out.println("Remove the element following the first minimum"+integerArrayList);
    }
}