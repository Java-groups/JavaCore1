package com.edu.hometask9;
/*
  1. Write parameterized methods union(Set set1, Set set2) and intersect(Set set1, Set set2),
     realizing the operations of union and intersection of two sets. Test the operation of
     these techniques on two pre-filled sets.
*/

import java.util.HashSet;
import java.util.Set;

public class SetTask {
    public static <T> void main(String[] args) {

        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        System.out.print("Set1: ");

        for (Integer ob1 : set1) {
            System.out.print(ob1+", ");
        }
        System.out.println();



        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(4);

        System.out.print("Set2: ");

        for (Integer ob2 : set2) {
            System.out.print(ob2+", ");

        }

        System.out.println();
        System.out.print("Union: ");
        System.out.println(union(set1, set2));
        System.out.print("Intersect: ");
        System.out.println(intersect(set1, set2));

    }

    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> list = new HashSet<>();
        list.addAll(set1);
        list.addAll(set2);

        return list;

    }

    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        Set<T> list1 = new HashSet<>(set1);
        list1.retainAll(set2);

        return list1;

    }

}