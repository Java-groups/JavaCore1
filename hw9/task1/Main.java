package hw9.task1;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>(Set.of(1, 2, 3, 4));
        Set<Integer> s2 = new HashSet<>(Set.of(3, 4, 5, 6, 7));

        System.out.println(union(s1, s2));
        System.out.println(intersect(s1, s2));
    }

    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> unionSet = new HashSet<>();
        unionSet.addAll(set1);
        unionSet.addAll(set2);
        return unionSet;
    }

    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        set1.retainAll(set2);
        return set1;
    }
}
