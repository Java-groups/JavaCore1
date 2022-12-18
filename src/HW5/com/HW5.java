package HW5.com;

import HW5.com.model.bird.*;
import HW5.com.model.employee.Developer;
import HW5.com.model.employee.Employee;

public class HW5 {
    public static void main(String[] args) {

        Bird[] bird = new Bird[4];
        bird[0] = new Eagle("Eagle feather","2");
        bird[1] = new Penguin("Penguin feather","4");
        bird[2] = new Kiwi("Kiwi feather","1");
        bird[3] = new Chicken("Chiken feather","10");
        for (int i = 0; i < bird.length; i++) {
            bird[i].fly();
            System.out.println(bird[i].toString());

        }
        Employee[] employeeArray = new Employee[2];
        employeeArray[0] = new Employee("Taras",33,37500);
        employeeArray[1] = new Developer("Taras",33,37500,"Average java developer");
        for (int i = 0; i < employeeArray.length; i++) {
            System.out.println(employeeArray[i].report());

        }

}
}
