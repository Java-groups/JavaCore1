package HW13.Homework;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.toMap;

public class Employee {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }

    public Employee(String name) {
        this.name = name;
    }

    static Optional<String> mostPopularName(Stream<Employee> employees) {
        Map<String, Long> names =
                employees.filter(employee -> Optional.ofNullable(employee).isPresent()).filter(employee -> !employee.getName().isEmpty()).
                        map(Employee::getName).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Optional<String> name = Optional.of(names.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey)).orElse(Optional.empty());

        return name;
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Bob"));
        employees.add(new Employee("Tom"));
        employees.add(new Employee("Ken"));
        employees.add(new Employee("Tom"));
        employees.add(new Employee("Jack"));
        employees.add(new Employee("Tom"));
        employees.add(new Employee(""));


        System.out.println(mostPopularName(employees.stream()));

    }
}
