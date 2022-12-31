package HM9.HomeWorkTask1;

import java.util.HashSet;
import java.util.Set;


public class Main {
    public static void union(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> united = new HashSet<>(set1);
        united.addAll(set2);
        System.out.println(united);
    }

    public static void intersect(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> common = new HashSet<>();
        for (Integer temp : set2) {
            if (set1.contains(temp)) {
                common.add(temp);
            }
        }
        System.out.println(common);
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(5);


        union(set1, set2);
        intersect(set1, set2);
    }
}
