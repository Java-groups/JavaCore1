package HW6_OOP2.Task1;

import java.util.Comparator;
public class TabComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return (int) (o2.getSalary() - o1.getSalary());
    }
}

