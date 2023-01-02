package HW9_Collection2;

import java.util.*;

public class PersonMap {
    public static void main(String[] args) {

        Map<String, String> personMap = new HashMap<>(); // створюэмо и заповнюємо Мар
        personMap.put("Bahno", "Alex");
        personMap.put("Kravchov", "Serge");
        personMap.put("Patlaha", "Oleg");
        personMap.put("Kartun", "Sasha");
        personMap.put("Bolotov", "Ivan");
        personMap.put("Petrosan", "Andrey");
        personMap.put("Ivanuten", "Oleg");
        personMap.put("Kovalenko", "Ivan");
        personMap.put("Shevchenko", "Ivan");
        personMap.put("Taran", "Leon");


        // друкуємо Мар
        for (Map.Entry<String, String> map : personMap.entrySet()) {
            System.out.println("Last name: " + map.getKey() + ",        First name: " + map.getValue());
        }
        System.out.println();

        Map<String, String> copy = new HashMap<String, String>(personMap); // клонуємо
        Map<String, Integer> dual = new HashMap<>();
        int countName;
        for (Map.Entry map : personMap.entrySet()) {  // перевиряємо на дублі
            countName = 0;
            for (Map.Entry mapCopy : copy.entrySet()) {
                if (mapCopy.getValue().equals(map.getValue())) {
                    countName++;
                }
            }
            dual.put((String) map.getValue(), countName);
        }

        for (Map.Entry dual1 : dual.entrySet()) {  // друкуємо дубли
            if ((int) dual1.getValue() > 1) {
                System.out.println("First name: " + dual1.getKey() + ", qty = " + dual1.getValue());
            }
        }
        // видаляємо Leon
        for (Map.Entry<String, String> map : personMap.entrySet()) {
            if(map.getValue().equals("Leon")) {
                personMap.remove(map.getKey());
            }
        }
        // друкуємо остаточний вариант Мар
        System.out.println();
        for (Map.Entry<String, String> map : personMap.entrySet()) {
            System.out.println("Last name: " + map.getKey() + ",        First name: " + map.getValue());
        }
    }
}
