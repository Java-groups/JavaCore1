package arthurmkrtchian.javaCore.HW09.collections2.homeWorks.homeWork2;

//        2. Create map personMap and add to it ten persons of type <String, String> (lastName,
//          firstName).
//          Output the entities of the map on the screen.
//          There are at less two persons with the same firstName among these 10 people?
//          Remove from the map person whose firstName is ”Orest” (or other). Print result.


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Map<String, String> personMap = fillMap();
        printMap(personMap);
        isThereSameNames(personMap);
        removePerson(personMap, "Orest");
        printMap(personMap);
    }

    public static void removePerson(Map<String,String> map, String firstNameToRemove){
        if (map.containsValue(firstNameToRemove)){
            System.out.printf("\nRemoved all entries with first name %s from the map\n", firstNameToRemove);
            map.values().removeIf(value -> value.contains(firstNameToRemove));
        } else {
            System.out.println("\nNothing to remove");
        }

    }

    public static void isThereSameNames(Map<String, String> map){
        Set<String> set = new HashSet<>(map.values());

        if ((set.size()) < map.size()){
            System.out.println("\nYes, the map contains persons with same first names.");
        } else {
            System.out.println("\nNo, map doesn`t contains persons with same first names.");
        }
    }

    public static Map<String, String> fillMap(){
        Map<String, String> result = new HashMap<>();
        result.put("Doroshenko", "Oleksiy");
        result.put("Simonyan", "Eva");
        result.put("Korotenko", "Borys");
        result.put("Braun","Viktoriya");
        result.put("Karpenko", "Volodymyr");
        result.put("Kasparov", "Borys");
        result.put("Johnson", "Orest");
        result.put("Zamirov", "Valentyn");
        result.put("Savran", "Tatyana");
        return result;
    }

    public static void printMap(Map<String,String> map){
        for (Map.Entry<String, String> entry: map.entrySet()){
            System.out.printf(
                    "Person : %s %s \n",
                    entry.getKey(),
                    entry.getValue()
            );
        }
    }
}
