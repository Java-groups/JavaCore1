package edu.homeworks.hw5.task2;


public class Main {
    public static void main(String[] args) {
        Employee[] employee = new Employee[2];
        employee[0] = new Developer("Stepan",20,100,"Java Developer");
        employee[1] = new Employee("Bogdan",30,200);

        for (int i = 0;i<employee.length;i++){
           System.out.println(employee[i].report());
        }


    }
}