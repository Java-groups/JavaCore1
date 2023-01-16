package arthurmkrtchian.javaCore.HW09.collections2.homeWorks.homeWork1;


//        1. Write parameterized methods union(Set set1, Set set2) and intersect(Set set1, Set set2),
//          realizing the operations of union and intersection of two sets. Test the operation of
//          these techniques on two pre-filled sets.


import java.util.*;

public class Main {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        fillSet(set1,10);
        System.out.print("       First Set -> ");
        System.out.println(set1.toString());

        fillSet(set2,10);
        System.out.print("      Second Set -> ");
        System.out.println(set2.toString());

        System.out.print("     United Sets -> ");
        System.out.println(union(set1,set2));

        System.out.print("Intersected Sets -> ");
        System.out.println(intersect(set1,set2));
    }

    public static void fillSet(Set<Integer> set, int countOfElements){
        Random random = new Random();
        while(set.size() < countOfElements){
            set.add(random.nextInt(20));
        }
    }

    public static  <T> Set<T> union(Set<T> set1, Set<T> set2){
        Set<T> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }

    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2){
        Set<T> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }

}
