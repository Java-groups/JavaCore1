package HW9.HomeWorkTask;

import java.util.HashSet;
import java.util.Set;

public class Task1 {

    public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> set = new HashSet<>(set1);
        set.addAll(set2);

        return set;
    }

    public static Set<Integer> intersect(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> set = new HashSet<>(set1);
        set.retainAll(set2);
        return set;
    }

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(9);

        set2.add(8);
        set2.add(3);
        set2.add(4);
        set2.add(9);

        System.out.println(union(set1, set2));
        System.out.println(intersect(set1, set2));


    }
}
