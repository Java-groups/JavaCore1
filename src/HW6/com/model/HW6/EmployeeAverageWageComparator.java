package HW6.com.model.HW6;

import java.util.Comparator;

public class EmployeeAverageWageComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return Double.compare(o1.getAverageMonthlyWage(),o2.getAverageMonthlyWage());
    }
}
