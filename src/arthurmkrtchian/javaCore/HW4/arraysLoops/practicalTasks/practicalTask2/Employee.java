package arthurmkrtchian.javaCore.HW4.arraysLoops.practicalTasks.practicalTask2;


//  Create a class Employee with fields name, department number, salary. Create five objects
//        of class Employee. Display
//        • all employees of a certain department (enter department number in the console);
//        • arrange workers by the field salary in descending order.


public class Employee implements Comparable<Employee>{

    private String name;

    @Override
    public String toString() {
        return "Name: " + this.name +
                "\ndepartmentNumber: " + this.departmentNumber +
                "\nsalary: " + this.salary;
    }

    private int departmentNumber;
    private int salary;

    public Employee() {
    }

    public Employee(String name, int departmentNumber, int salary) {
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee o) {
        return o.salary - this.salary;
    }
}
