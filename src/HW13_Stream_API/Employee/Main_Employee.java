package HW13_Stream_API.Employee;

import HW13_Stream_API.Employee.Employee;

import java.util.*;
import java.util.stream.Stream;

public class Main_Employee {
    public static void main(String[] args) {
        List<Employee> listEmployee = new ArrayList<>();
        listEmployee.add(new Employee(10, "Alex"));
        listEmployee.add(new Employee(11, "Sem"));
        listEmployee.add(new Employee(12, "Bob"));
        listEmployee.add(new Employee(13, "Alex"));
        listEmployee.add(new Employee(14, "Dima"));
        listEmployee.add(new Employee(15, "Alex"));

        System.out.println(mostPopularName(listEmployee.stream()).orElse(null));
    }

    static Optional<String> mostPopularName(Stream<Employee> employees) {
        if (employees == null)
            return Optional.empty();
        Map<String, Integer> map = new HashMap<>();
        employees.forEach(employee -> {
            if (map.containsKey(employee.getName()))
                map.put(employee.getName(),
                        map.get(employee.getName()) + 1);
            else
                map.put(employee.getName(), 1);
        });
        String name = map.entrySet().stream().max(Comparator.comparingInt(Map.Entry::getValue)).get().getKey();
        return Optional.of(name);
    }

}
