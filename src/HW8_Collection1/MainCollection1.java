package HW8_Collection1;

import java.util.LinkedList;
import java.util.List;

public class MainCollection1 {
    public static void main(String[] args) {
        List<Integer> myCollections = new LinkedList<>();
        Collection1 collection1 = new Collection1();
        collection1.fillList((LinkedList<Integer>) myCollections);
        System.out.println("создал  " + myCollections);

        collection1.minMaxChaing((LinkedList<Integer>) myCollections);
        System.out.println("поменял мах и мин  " + myCollections);


        collection1.insertNumber((LinkedList<Integer>) myCollections);
        System.out.println("вставил 3-х значное перед отрицат " + myCollections);

        collection1.differentSigns((LinkedList<Integer>) myCollections);
        System.out.println("вставил 0  " + myCollections);

        collection1.copyList((LinkedList<Integer>) myCollections);

        collection1.evenElement((LinkedList<Integer>) myCollections);
        System.out.println("удалил посл четный  " + myCollections);

        collection1.minList((LinkedList<Integer>) myCollections);
        System.out.println("удалить след за min  " + myCollections);

    }
}
