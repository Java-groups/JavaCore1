package AllHomeWorks.HomeWork9.Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Task1 {

    public static void doTask(BufferedReader br) throws IOException {
        Set<Integer> s1 = Set.of(10, 20, 3, 0);
        Set<Integer> s2 = Set.of(3, 40, 55, 1, 8, 13);

        Set<Integer> s1Unions2 = union(s1, s2);
        System.out.printf("Union of two Set %s and %s in Java is %s %n",
                s1, s2, s1Unions2);
        Set<Integer> s1Intersects2 = intersect(s1, s2);
        System.out.printf("Intersect of two Set %s and %s in Java is %s %n", s1, s2, s1Intersects2 );

    }
    private static <E>Set<E> union(Set<E> set1, Set<E> set2){
        Set<E> unionSet = new HashSet<E>(set1);
        unionSet.addAll(set2);


        return unionSet;
    }
    private static <E>Set<E> intersect(Set<E> set1, Set<E> set2){
        Set<E> interSect = new HashSet<E>(set1);
        interSect.retainAll(set2);

        return interSect;
    }
}
