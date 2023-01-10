package Lesson12;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Task_4 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(3, 78, 456, 33, 78, 7, 1, -4, 678, 45));

        List<Integer> result = count(numbers, x -> x > 50);
        System.out.println(result);

        System.out.println(count(numbers, Task_4::isEven));
    }

    public static List<Integer> count(List<Integer> arr, Predicate<Integer> predicate) {
        List<Integer> result = new ArrayList<>();
        for (Integer el : arr) {
            if (predicate.test(el)) {
                result.add(el);
            }
        }
        return result;
    }

    public static boolean isEven(int a) {
        return a % 2 == 0;
    }
}
