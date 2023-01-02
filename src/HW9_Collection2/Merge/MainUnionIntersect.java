package HW9_Collection2.Merge;

import HW9_Collection2.Merge.UnionIntersect;

import java.util.Set;
import java.util.TreeSet;

public class MainUnionIntersect {

    public static void main(String[] args) {

            Set<Integer> set1 = new TreeSet<>();
            Set<Integer> set2 = new TreeSet<>();
            set1.add(1);
            set1.add(4);
            set1.add(6);
            set1.add(3);
            set2.add(5);
            set2.add(3);
            set2.add(6);
            set2.add(7);

            System.out.println("set1 = " + set1);
            System.out.println("set2 = " + set2);

            Set<Integer> setUnion = new TreeSet<>();
            UnionIntersect unionIntersect = new UnionIntersect();

            unionIntersect.union(set1, set2, setUnion);

            Set<Integer> setIntersect = new TreeSet<>();
            unionIntersect.intersect(set1,set2,setIntersect, setUnion);
        }
}
