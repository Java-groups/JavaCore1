package HM9.HomeWorkTask2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Kukliak", "Roman");
        personMap.put("Shevchenko", "Olga");
        personMap.put("Buryy", "Roman");
        personMap.put("Fedyk", "Oleg");
        personMap.put("Chornota", "Andrii");

        System.out.println(personMap);

        Set<String> values = new HashSet<>(personMap.values());
        boolean hasDuplicates = values.size() != personMap.size();
        if (hasDuplicates) {
            System.out.println("There are at least 2 persons with the same name in the map");
        }

        for (Map.Entry<String, String> m : personMap.entrySet()) {
            if (m.getValue().equals("Oleg")) {
                personMap.remove(m.getValue());
                personMap.remove(m.getKey());
            }
        }

        System.out.println(personMap);
    }
}
