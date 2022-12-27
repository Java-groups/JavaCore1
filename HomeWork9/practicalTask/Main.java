package edu.homeworks.hw9.practicalTask;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    private String name;

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        if(name != this.name) return false;

        return name.equals(this.name);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int id;
        String name;

        HashMap<Integer,String> employeeMap = new HashMap<>();
        employeeMap.put(0,"Stepan");
        employeeMap.put(1,"David");
        employeeMap.put(2,"Mark");
        employeeMap.put(3,"Boris");
        employeeMap.put(4,"Olga");


        System.out.println("Write id : ");
        id = input.nextInt();

        if(employeeMap.containsKey(id) == true){
          System.out.println("Employee Name = " + employeeMap.get(id));
        } else System.out.println("Error! Not found ID");


        System.out.println("Write name employee : ");
        name = input.nextLine();

        for (Map.Entry<Integer,String> m: employeeMap.entrySet()) {
                    if(m.getValue().equals(name)){
                        System.out.println(m.getKey() + " " + m.getValue());
                    }
        }
    }
}