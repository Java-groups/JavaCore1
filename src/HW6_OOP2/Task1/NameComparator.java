package HW6_OOP2.Task1;



import java.util.Comparator;

public class NameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getEmployee().compareTo(o2.getEmployee());
    }
}
