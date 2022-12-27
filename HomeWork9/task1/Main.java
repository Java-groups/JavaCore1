package edu.homeworks.hw9.task1;


import edu.homeworks.hw5.task2.Developer;
import edu.homeworks.hw5.task2.Employee;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<Integer>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        HashSet<Integer> set2 = new HashSet<Integer>();
        set2.add(2);
        set2.add(3);
        set2.add(4);


        UnionIntersect unionIntersect = new UnionIntersect();
        unionIntersect.union((HashSet<Integer>) set1, (HashSet<Integer>) set2);
        unionIntersect.intersect((HashSet<Integer>) set1, (HashSet<Integer>) set2);



    }
}