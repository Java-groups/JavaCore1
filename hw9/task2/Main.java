package hw9.task2;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Scott", "Michael");
        personMap.put("Beesly", "Pam");
        personMap.put("Schrute", "Dwight");
        personMap.put("Halpert", "Jim");
        personMap.put("Howard", "Ryan");
        personMap.put("Kapoor", "Kelly");
        personMap.put("Hudson", "Stanley");
        personMap.put("Malone", "Kevin");
        personMap.put("Flenderson", "Toby");
        personMap.put("Martin", "Pam");

        System.out.println(personMap);

        Map<String, String> personsWithUniqueName = new HashMap<>();

        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            personsWithUniqueName.put(entry.getValue(), entry.getKey());
        }
        System.out.println(personsWithUniqueName);
    }
}
