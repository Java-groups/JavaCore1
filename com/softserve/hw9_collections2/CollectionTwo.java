package com.softserve.hw9_collections2;

import java.util.HashSet;
import java.util.Set;

public class CollectionTwo {

    public Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        set1.addAll(set2);
        return set1;
    }

    public Set<Integer> intersect(Set<Integer> set1, Set<Integer> set2) {
        set1.retainAll(set2);
        return set1;
    }
}
