package edu.homeworks.hw9.task1;

import java.util.HashSet;
import java.util.Set;

public class UnionIntersect {
    private HashSet<Integer> tmp;

     public HashSet<Integer> union(HashSet<Integer> set1, HashSet<Integer> set2){
         tmp = new HashSet<Integer>();
        System.out.println("set1 = " + set1);
        System.out.println("set2 = " + set2);

        tmp.addAll(set1);
        tmp.addAll(set2);
        System.out.println(tmp);
        return tmp;
    }

     public HashSet<Integer> intersect(HashSet<Integer> set1,HashSet<Integer> set2){
         tmp = new HashSet<Integer>();
        System.out.println("set1 = " + set1);
        System.out.println("set2 = " + set2);
        tmp.addAll(set1);
        tmp.retainAll(set2);
        System.out.println(tmp);
        return tmp;
    }


    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

}
