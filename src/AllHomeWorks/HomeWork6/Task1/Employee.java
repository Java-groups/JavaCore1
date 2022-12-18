package AllHomeWorks.HomeWork6.Task1;

public class Employee {
    private final String employeeId;
    public  String name;

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public Employee (String name){
        this.employeeId = String.valueOf(getUniqueId());
        this.name = name;
    }

    private static int lastId = 0;
    private static int getUniqueId() {
        return ++lastId;
    }

    @Override
    public String toString() {
        return String.format("Id: %s. Name: %s", this.getEmployeeId(), this.getName());
    }
}
