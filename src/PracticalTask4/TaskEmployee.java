package PracticalTask4;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class TaskEmployee {
    private String name;
    private int departmentNumber;
    private float salary;
    public static final int numberEmployee = 3;

    public TaskEmployee() {
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

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [" +
                "name ='" + name + '\'' +
                ", departmentNumber = " + departmentNumber +
                ", salary = " + salary +
                ']';
    }


    public void inputEmployee(BufferedReader br) throws IOException {
        System.out.print("First name of the : ");
        this.name = br.readLine();
        System.out.print("department number: ");
        this.departmentNumber = Integer.parseInt(br.readLine());
        System.out.print("salary: ");
        this.salary = Float.parseFloat(br.readLine());
    }

    public static void listEmployee(TaskEmployee[] employee, int departmentNumber) {
        System.out.println("List employee department №" + departmentNumber);
        for (int i = 0; i < employee.length; i++) {
            if (departmentNumber == employee[i].getDepartmentNumber()) {
                System.out.println(employee[i]);
            }
        }
    }

    public static void listSalary(TaskEmployee[] employee) {
        TaskEmployee tmp;
        for (int i = 0; i < employee.length - 1; i++) {
            for (int j = i + 1; j < employee.length; j++) {
                if (employee[i].getSalary() < employee[j].getSalary()) {
                    tmp = employee[i];
                    employee[i] = employee[j];
                    employee[j] = tmp;
                }
            }
        }
        System.out.println("\nList employee arrange workers by the field salary in descending order");
        for (TaskEmployee taskEmployee : employee) {
            System.out.println(taskEmployee);
        }
    }


    public static void main(String[] args) throws IOException {

        TaskEmployee[] employee = new TaskEmployee[numberEmployee];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < employee.length; i++) {
            employee[i] = new TaskEmployee();
            employee[i].inputEmployee(br);
            System.out.println(String.valueOf(employee[i]) + "\n");
        }
        System.out.print("Input number department: ");
        int departmentNumber = Integer.parseInt(br.readLine());
        listEmployee(employee, departmentNumber);

        listSalary(employee);
    }
}
