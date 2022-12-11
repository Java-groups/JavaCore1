package PracticalTask2.Task;

public class Application {
    public static void main(String[] args) {

        Employee Employee1 = new Employee();
        Employee1.setName("Oleg");
        Employee1.setHours(160);
        Employee1.setRate(20);

        Employee Employee2 = new Employee();
        Employee2.setName("Roman");
        Employee2.setHours(155);
        Employee2.setRate(25);

        Employee Employee3 = new Employee();
        Employee3.setName("Mykola");
        Employee3.setHours(170);
        Employee3.setRate(30);

        double totalSalary = Employee1.getSalary() + Employee2.getSalary() + Employee3.getSalary();
        System.out.println("The total salary of  workers is " + totalSalary);
    }

}
