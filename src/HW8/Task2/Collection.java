package HW8.Task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Collection {
    public static List<Integer> swapMaxMin(List<Integer> list) {
        int max = list.get(0);
        int maxIndex = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
                maxIndex = i;
            }
        }
        int min = list.get(0);
        int minIndex = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
                minIndex = i;
            }
        }
        list.remove(maxIndex);
        list.add(maxIndex, min);
        list.remove(minIndex);
        list.add(minIndex, max);

        return list;
    }

    public static List<Integer> addThreeNumbers(List<Integer> list) {
        Random random = new Random();
        int firstNumber = random.nextInt(-100, 100);
        int secondNumber = random.nextInt(-100, 100);
        int thirdNumber = random.nextInt(-100, 100);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 0) {
                list.add(i, firstNumber);
                list.add(i, secondNumber);
                list.add(i, thirdNumber);
                break;
            }
        }
        return list;
    }

    public static List<Integer> addZero(List<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            if ((list.get(i-1) < 0 && list.get(i) > 0) || (list.get(i-1) > 0 && list.get(i) < 0)) {
                list.add(i, 0);

            }
        }
        return list;
    }

    public static List<Integer> split(List<Integer> list) {
        int k = list.size() / 2;
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            list1.add(list.get(i));
        }
        System.out.println(list1);
        for (int i = (list.size() - 1); i >= k; i--) {
            list2.add(list.get(i));
        }
        System.out.println(list2);
        return list;
    }

    public static List<Integer> deleteLastEven(List<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) % 2 != 0)
                continue;
            else if (list.get(i) % 2 == 0) {
                list.remove(i);
                break;
            } else {
                System.out.println("There is no even elements:)");

            }
        }
        return list;
    }

    public static List<Integer> deleteElement(List<Integer> list) {
        int min = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) == min && list.get(list.size() - 1) != min) {
                list.remove(i + 1);
                break;
            }
        }
        return list;
    }
}
