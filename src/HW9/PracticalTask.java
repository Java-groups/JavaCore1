package HW9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PracticalTask {
    public static void main(String[] args) {
        Map<Integer, String> employeeMap = new HashMap<>();
        System.out.println("Start of first practical task");
        employeeMap.put(12, "Polina");
        employeeMap.put(32, "Nick");
        employeeMap.put(56, "Mila");
        employeeMap.put(59, "Anna");
        employeeMap.put(45, "Anastasia");
        employeeMap.put(90, "Nicolay");
        employeeMap.put(71, "Andrey");
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        System.out.println("Start of the second practical task");
        System.out.println("Enter searching id:");
        Scanner sc = new Scanner(System.in);
        sc = new Scanner(System.in);
        int idEmployee = sc.nextInt();

        if (employeeMap.containsKey(idEmployee)) {
            System.out.println(idEmployee + " " + employeeMap.get(idEmployee));
        } else {
            System.out.println("Пoмилка, такого id немає!");
        }
        System.out.println("Start of third practical task");
        System.out.println("Enter searching name:");
        sc = new Scanner(System.in);
        String nameEmployee = sc.next();
        if (!employeeMap.containsValue(nameEmployee)) {
            System.out.println("Пoмилка, такого  name немає!");
        } else {
            for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
                if (entry.getValue().equals(nameEmployee)) {
                    System.out.println("This is id for this name: " + entry.getKey());
                }
            }

        }

    }
}

