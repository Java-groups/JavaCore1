package HW13;

import java.util.Optional;
import java.util.stream.Stream;

public class Employee {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(String name) {
        this.name = name;
    }
    static Optional<String> mostPopularName(Stream< Employee> employees) {
        return null;     }

}
