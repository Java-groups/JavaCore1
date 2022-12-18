abstract class Employee implements Comparable<Employee> {
    private String employeeId;
    int salary;

    public Employee(String employeeId) {
        this.employeeId = employeeId;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public int compareTo(Employee obj) {
        return obj.getSalary() - this.getSalary();
    }
}
