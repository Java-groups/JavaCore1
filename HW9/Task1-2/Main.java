import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> setOne = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> setTwo = new HashSet<>() {{
            add(3);
            add(4);
            add(5);
            add(6);
        }};

        Set<Integer> intersectSet = MyCollection.intersect(setOne, setTwo);
        Set<Integer> unionSet = MyCollection.union(setOne, setTwo);

        System.out.println(intersectSet);
        System.out.println(unionSet);

        Map<String, String> personMap = new HashMap<String, String>() {
            {
                put("last", "firstOne");
                put("lastOne", "firstOne");
                put("lastTwo", "firstTwo");
                put("lastThird", "firstThird");
                put("lastFourth", "firstFourth");
                put("lastFifth", "firstFifth");
                put("lastSixth", "firstSixth");
                put("lastSeventh", "firstSeventh");
                put("lastEighth", "firstEighth");
                put("lastNinth", "firstNinth");
            }
        };
        System.out.println(personMap);
        Set<String> keys = MyCollection.getKeys(personMap, "firstSixth");
        personMap.remove("last");
        System.out.println(personMap);
        System.out.println(keys);
    }
}