package edu.homeworks.hw7.practicaltasks;

public class Main {
    public static void main(String[] args) {
        Department department = new Department();
        System.out.println(department.getAddress().setCity("Lviv"));
        System.out.println(department.getAddress().getCity());
        Department department1 = new Department();
        System.out.println(department1.getAddress().setCity("Dnipro"));
        System.out.println(department.getAddress().getCity());


    }


}