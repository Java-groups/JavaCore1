package arthurmkrtchian.javaCore.OOP2.homeWorks.homeWork1;


//        Create Payment interface with the method calculatePay(), the base class Employee
//        with a string variable employeeld. Create two classes SalariedEmployee and
//        ContractEmployee, which implement interface and are inherited from the base class.
//        Describe hourly paid workers in the relevant classes (one of the children),
//        and fixed paid workers (second child).
//        Describe the string variable socialSecurityNumber in the class SalariedEmployee .
//        Include a description of federalTaxIdmember in the class of ContractEmployee.
//        The calculation formula for the "time-worker“ is: the average monthly
//        salary = hourly rate * number of hours worked
//        For employees with a fixed payment the formula is: the average monthly salary = fixed monthly payment
//        Create an array of employees and add the employees with different form of payment.
//        Arrange the entire sequence of workers descending the average monthly wage.
//        Output the employee ID, name, and the average monthly wage for all elements of the list.


public class Employee implements Comparable<Employee>{

    private String name;
    static int employeesCount;
    private final String employeeId; // this field generates automatically.

    public Employee(String name) {
        this.name = name;
        this.employeeId = String.valueOf(++employeesCount);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getEmployeesCount() {
        return employeesCount;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    @Override
    public int compareTo(Employee o) {
        double s1 = 0;
        double s2 = 0;

        if (o instanceof Payment && this instanceof Payment){
            s1 = ((Payment) o).calculatePay();
            s2 = ((Payment) this).calculatePay();
        }
        return (int) (s1-s2);
    }
}
