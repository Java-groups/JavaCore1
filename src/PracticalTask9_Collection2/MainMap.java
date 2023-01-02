package PracticalTask9_Collection2;

import java.util.*;

public class MainMap {

    public static void main(String[] args) {

        Map<Integer, String> employeeMap = new HashMap<Integer, String>();

        employeeMap.put(101, "Alexandr");
        employeeMap.put(105, "Andrey");
        employeeMap.put(110, "Orest");
        employeeMap.put(120, "Petr");
        employeeMap.put(205, "Andrian");
        employeeMap.put(210, "Nicanor");
        employeeMap.put(320, "Orest");

        Set<Integer> setKey = employeeMap.keySet();

        for (Integer key : setKey) {
            System.out.println("Key: " + key + ", Value: " + employeeMap.get(key));
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nInput ID user: ");
        int userID = scanner.nextInt();

        if (employeeMap.containsKey(userID)) {
            System.out.println("Fof key " + userID + " there is a Name: " + employeeMap.get(userID));
        } else {
            System.out.println("Key does not exist");
        }

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("\nInput Name user: ");
        String userName = scanner1.nextLine();
        if (employeeMap.containsValue(userName)) {
            for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
                if (userName.equals(entry.getValue())) {
                    System.out.println("For name " + userName + " there is a ID: " + entry.getKey());
                }
            }
        } else {
            System.out.println("Name does not exist");
        }
    }
}
