package com.edu.hometask9;

/*   2. Create map personMap and add to it ten persons of type <String, String> (lastName,
        firstName).
        Output the entities of the map on the screen.
        There are at less two persons with the same firstName among these 10 people?
        Remove from the map person whose firstName is ”Orest” (or other). Print result.
        */

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMap {
    public static void main(String[] args) {

        String firstName="Bob";

        Map<String, String> personMap = new java.util.HashMap<>();

        personMap.put("Dylan", "Bob");
        personMap.put("Mozart", "Wolfgang Amadeus");
        personMap.put("Presley", "Elvis");
        personMap.put("Marley", "Bob");
        personMap.put("Jackson", "Michael");
        personMap.put("Wonder", "Stevie");

        for (Map.Entry<String,String> m : personMap.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        //Use hashset to check are unique first names or not:
        Set<String> duplicates = new HashSet<>(personMap.values());

        System.out.println(duplicates+ " duplicates skip"); //visual check for skip duplicates

        if (duplicates.size() == personMap.size()) {
            System.out.println("personMap does not have duplicated firstName");
        } else if (duplicates.size() < personMap.size()) {
            System.out.println("personMap has duplicated firstName");
        }


        // Copy personMap to iterate through copy to avoid:
        // "java.util.ConcurrentModificationException":

        Map<String, String> copy = new java.util.HashMap<String, String>(personMap);

        for (Map.Entry<String, String> entry : copy.entrySet()) {
            if(entry.getValue().equals(firstName)) {
                personMap.remove(entry.getKey());
               // personMap.remove(entry.getValue());
            }
        }

        // Print personMap with deleted firstName:
        System.out.println("personMap with deleted: "+ firstName);
        for (Map.Entry<String,String> m : personMap.entrySet()) {

            System.out.println(m.getKey() + " " + m.getValue());
        }
    }

}