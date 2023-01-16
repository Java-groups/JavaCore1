package arthurmkrtchian.javaCore.HW09.collections2.practicalTasks.practicalTask;


//        In the main() method declare map employeeMap of pairs <Integer, String>.
//        • Add to employeeMap seven pairs (ID, name) of some persons. Display the map on the
//        screen.
//        • Ask user to enter ID, then find and write corresponding name from your map. If you can't
//        find this ID - say about it to user (use function containsKey()).
//        • Ask user to enter name, verify than you have name in your map and write corresponding
//        ID. If you can't find this name - say about it to user (use function containsValue()).


import helper.Reader;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;


public class Main {
    static Map<Integer, String> employeeMap = new HashMap<>();
    static int employeeCount;

    public static void main(String[] args) throws IOException {
        run();
    }

    private static void run() throws IOException {
        addPersonsIntoCollection(employeeMap,7);
        printCollection(employeeMap);
        System.out.print("Please enter employee ID to search: ");
        findEmployeeByID(employeeMap);
        System.out.print("Please enter employee name to search: ");
        printCollection(findEmployeeByName(employeeMap));
    }

    private static Map<Integer, String> findEmployeeByName(Map<Integer, String> collection) throws IOException {
        Scanner console = new Scanner(System.in);
        Map<Integer, String> result = new HashMap<>();
        String searchRequest;
        while (true){
            searchRequest = console.nextLine().replaceAll(" ", "");
            searchRequest = searchRequest.substring(0,1).toUpperCase() + searchRequest.substring(1).toLowerCase();
            if (collection.containsValue(searchRequest)){
                result = getSearchResults(collection, searchRequest);
                break;
            } else{
                System.out.println("No employee with such name, please try again: ");
            }
        }

        return result;
    }

    private static Map<Integer, String> getSearchResults(Map<Integer, String> employeeMap, String value){
        Map<Integer, String> result = new HashMap<>();
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()){
            if (entry.getValue().equals(value)){
                result.put(entry.getKey(), entry.getValue());
            }
        }
        return result;
    }

    private static void findEmployeeByID(Map<Integer, String> collection) throws IOException {
        Reader reader = new Reader();
        int searchId;
        while (true){
            searchId = reader.readInteger("Incorrect input. Only integers.");
            if (collection.containsKey(searchId)){
                System.out.println(
                        "ID: " + searchId + ", Name: " + collection.get(searchId)
                );
                break;
            } else{
                System.out.println("ID can`t e less than 1 and bigger than " + collection.size());
            }
        }
    }

    private static int assignId(){
        return ++employeeCount;
    }

    private static void printCollection(Map<Integer, String> collection){
        for(Map.Entry<Integer, String> entry: collection.entrySet()){
            System.out.printf("ID: %d, Name: %s\n", entry.getKey(), entry.getValue());
        }
    }

    private static void addPersonsIntoCollection(Map<Integer, String> collection, int count){
        Random value = new Random(Names.values().length);
        for (int i = 0; i < count; i++) {
            collection.put(
                    assignId(),
                    Names.values()[value.nextInt(Names.values().length)].toString()
            );
        }
    }

}
