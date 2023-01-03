import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MyCollection {
    static Set union(Set setOne, Set setTwo) {
        Set<Integer> unionSet = new HashSet<Integer>(setOne);
        unionSet.addAll(setTwo);
        return unionSet;
    }

    static Set intersect(Set setOne, Set setTwo) {
        Set<Integer> intersectSet = new HashSet<Integer>(setOne);
        intersectSet.retainAll(setTwo);
        return intersectSet;
    }

    static  <K, V> Set<K> getKeys(Map<K, V> map, V value) {
        Set<K> keys = new HashSet<>();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (entry.getValue().equals(value)) {
                keys.add(entry.getKey());
            }
        }
        return keys;
    }
}
