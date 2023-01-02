package HW9_Collection2.Merge;

import java.util.Set;
import java.util.TreeSet;

public class UnionIntersect {
    public UnionIntersect() {
    }

    public void union(Set<Integer> set1, Set<Integer> set2, Set<Integer> setUnion) {
            setUnion.addAll(set1);
            setUnion.addAll(set2);
            System.out.println("setUnion = " + setUnion);
        }

        public void intersect(Set set1, Set set2, Set setIntersect, Set setUnion) {
            for (Object set : setUnion) {
                if (set1.contains(set) && (set2.contains(set))) {
                    setIntersect.add(set);
                }
            }
            System.out.println("setIntersect = " + setIntersect);
        }


}
