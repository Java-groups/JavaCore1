package HW9.HomeWorkTask;

import java.util.*;

public class Person {
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();

        personMap.put("Big", "Orest");
        personMap.put("Rich", "Ben");
        personMap.put("Small", "Ben");
        personMap.put("Tall", "Maik");
        personMap.put("Bad", "Tom");

        System.out.println(personMap);

//        Collection<String> firstNames = personMap.values();
//        System.out.println(firstNames);
        Set<String> firstNames = new HashSet<>();
        int countKeys = 0;
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            firstNames.add(entry.getValue());
            countKeys++;
        }
        int count = firstNames.size();
        System.out.println(firstNames);
        if (count != countKeys) {
            System.out.println("We have at least two persons with the same first name!");
        } else {
            System.out.println("We do not have persons with the same first name!");
        }
        System.out.println(count + " " + countKeys);


        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            if (entry.getValue().equals("Orest")) {
                String lastName = entry.getKey();
                personMap.remove(lastName);
                break;
            }

        }

        System.out.println(personMap);


//
//        for (String firstName : firstNames) {
//            HashSet<String> firstNames1 = new HashSet<>();
//
//                System.out.println(firstNames1.add(firstName));
//
//                System.out.println(firstName + " " + firstName.hashCode());
//
//            int count = firstNames1.size();
//            System.out.println(count);
//        }


    }
}
