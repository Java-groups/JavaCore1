import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MyCollection {
    static ArrayList<Integer> create(Random rand) {
        ArrayList<Integer> integerArrayList = new ArrayList<Integer>(10);
        for (int i = 0; i < 10; i++) {
            integerArrayList.add(rand.nextInt(-10, 10));
        }
        return integerArrayList;
    }

    static int[] minMaxIndex(ArrayList<Integer> integerArrayList) {
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 1; i < integerArrayList.size(); i++) {
            if (integerArrayList.get(minIndex) < integerArrayList.get(i)) {
                minIndex = i;
            }
            if (integerArrayList.get(maxIndex) > integerArrayList.get(i)) {
                maxIndex = i;
            }
        }
        return new int[]{minIndex, maxIndex};
    }

    static void changeMinAndMax(ArrayList<Integer> integerArrayList) {
        int[] minMaxIndex = MyCollection.minMaxIndex(integerArrayList);
        int temp = integerArrayList.get(minMaxIndex[0]);
        integerArrayList.set(minMaxIndex[0], integerArrayList.get(minMaxIndex[1]));
        integerArrayList.set(minMaxIndex[1], temp);
    }

    static void insertThreeRandom(ArrayList<Integer> integerArrayList, Random rand) {
        for (Integer element : integerArrayList) {
            if (element < 0) {
                for (int i = 0; i < 3; i++) {
                    integerArrayList.add(integerArrayList.indexOf(element), rand.nextInt(10));
                }
                break;
            }
        }
    }

    static void insertZero(ArrayList<Integer> integerArrayList) {
        for (int i = 0; i < integerArrayList.size() - 1; i++) {
            if ((integerArrayList.get(i) > 0) && (integerArrayList.get((i + 1)) < 0) || (integerArrayList.get(i) < 0) && (integerArrayList.get((i + 1)) > 0)) {
                integerArrayList.add(i + 1, 0);
                i++;
            }
        }
    }

    static List<List<Integer>> splitIntoTwo(ArrayList<Integer> integerArrayList) {
        return  Arrays.asList(
                integerArrayList.subList(0, integerArrayList.size()/2),
                integerArrayList.subList(integerArrayList.size()/2, integerArrayList.size()));
    }

    static void removeLastIfEven(ArrayList<Integer> integerArrayList) {
        for (int i = integerArrayList.size()-1; i > 0; i--) {
            if (integerArrayList.get(i)%2 == 0 && integerArrayList.get(i) != 0) {
                integerArrayList.remove(i);
                System.out.println("The last even removed: "+integerArrayList);
                return;
            }
        }
        System.out.println("There are no even elements");
    }

    static void removeFollowFirstMin(ArrayList<Integer> integerArrayList) {
        int[] minMaxIndex = MyCollection.minMaxIndex(integerArrayList);
        for (int i = 1; i < integerArrayList.size(); i++) {
            if (integerArrayList.get(minMaxIndex[0]) > integerArrayList.get(i)) {
                minMaxIndex[0] = i;
            }
        }
        if(minMaxIndex[0] == integerArrayList.size()) {
            System.out.println("last element");
        } else {
            integerArrayList.remove(minMaxIndex[0]+1);
        }
    }
}
