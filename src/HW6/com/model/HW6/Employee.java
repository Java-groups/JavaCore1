package HW6.com.model.HW6;

public class Employee implements Comparable<Employee>{
    public String employeeId;
    public String name;
    private double averageMonthlyWage;

    public Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAverageMonthlyWage() {
        return averageMonthlyWage;
    }

    public void setAverageMonthlyWage(double averageMonthlyWage) {
        this.averageMonthlyWage = averageMonthlyWage;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", name='" + name + '\'' +
                ", averageMonthlyWage=" + averageMonthlyWage +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare(this.averageMonthlyWage, o.averageMonthlyWage);
    }
}
