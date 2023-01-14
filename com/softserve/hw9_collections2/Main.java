package com.softserve.hw9_collections2;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set2.add(10);
        set2.add(20);
        set2.add(30);

        CollectionTwo collectionTwo = new CollectionTwo();
        System.out.println("Sets union: " + collectionTwo.union(set1, set2));
        System.out.println("Sets intersection: " + collectionTwo.intersect(set1, set2));
    }

}
