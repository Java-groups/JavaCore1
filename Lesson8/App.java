package Lesson8;

import Lesson8.Department.Address;

public class App {
    public static void main(String[] args) {
        Department d1 = new Department("Dep_1", new Address("Dnipro", "Gogolya", 19));
        Department d2 = (Department) d1.clone();
        d2.getAddress().setCity("Kherson");
        System.out.println(d1);
        System.out.println(d2);
    }
}
