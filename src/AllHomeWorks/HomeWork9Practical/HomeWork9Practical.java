package AllHomeWorks.HomeWork9Practical;

import Helper.InputHelper;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HomeWork9Practical {
    public static void doTask(BufferedReader br) throws IOException {
        Map<Integer, String> employeeMap = new HashMap<>();

        employeeMap.put(1, "Mike");
        employeeMap.put(2, "Nick");
        employeeMap.put(3, "Sara");
        employeeMap.put(4, "Kira");
        employeeMap.put(5, "Alex");
        employeeMap.put(6, "Roma");
        employeeMap.put(7, "Sofia");


        for (Map.Entry employee: employeeMap.entrySet()){
            System.out.println(employee.getKey() + " " +
                    employee.getValue());
        }
        System.out.println("Please input ID: ");
        int id = InputHelper.inputInteger(br);
        if (employeeMap.containsKey(id)) {
            System.out.println("User name for id =(" + id + ") is: "+employeeMap.get(id));
        } else {
            System.out.println("We don't have id =(" + id + ")!");
        }

        System.out.println("Please input name: ");
        String name = br.readLine();
        if (employeeMap.containsValue(name)) {
            System.out.println("User id for name =(" + name + ") is: "+employeeMap.entrySet().stream().filter(entry -> Objects.equals(entry.getValue(), name)).findFirst().get().getKey());
        } else {
            System.out.println("We don't have name =(" + name + ")!");
        }


    }
}
