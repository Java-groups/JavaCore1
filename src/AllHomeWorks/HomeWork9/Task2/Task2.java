package AllHomeWorks.HomeWork9.Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Task2 {
    public static void doTask(BufferedReader br) throws IOException {
        Map<String, String> personMap = new HashMap<>();

        personMap.put("Koloda", "Mike");
        personMap.put("Salo", "Lina");
        personMap.put("Boroda", "Mila");
        personMap.put("Kokos", "Vania");
        personMap.put("Skott", "Katya");
        personMap.put("Bereza", "Arsen");
        personMap.put("Zebra", "Mila");
        personMap.put("Volos", "Mike");
        personMap.put("Krill", "Lina");
        personMap.put("Stopal", "Nika");

        for (Map.Entry person : personMap.entrySet()) {
            System.out.println(person.getKey() + " " +
                    person.getValue());
        }

        System.out.println("Please input name: ");
        String name = br.readLine();
        if (personMap.containsValue(name)) {
            personMap.entrySet().stream()
                    .filter(entry -> Objects.equals(entry.getValue(), name))
                    .forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));
        } else {
            System.out.println("We don't have name =(" + name + ")!");
        }

        System.out.println("\nPlease input name: ");
        String name1 = br.readLine();
        if (personMap.containsValue(name1)) {
            System.out.println("\nUser " + name1 +" " +personMap.entrySet().stream().filter(entry -> Objects.equals(entry.getValue(), name1)).findFirst().get().getKey() +" is ready to remove");
            personMap.values().remove(name1);
            System.out.println("\nPersons after remove(): ");
            for (Map.Entry person : personMap.entrySet()) {
                System.out.println(person.getKey() + " " +
                        person.getValue());
            }


            } else {
            System.out.println("\nWe don't have name =(" + name1 + ")!");
        }

    }
}