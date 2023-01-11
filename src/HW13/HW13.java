package HW13;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class HW13 {
    public static void main(String[] args) {
        System.out.println("Start of first  task");
        Product product1 = new Product("Iphone ", 2017, 4400);
        Product product2 = new Product("Iphone ", 2021, 9000);
        Product product3 = new Product("Iphone ", 2016, 5000);
        Product product4 = new Product("Iphone ", 2010, 3500);
        Product product5 = new Product("Samsung A7", 2022, 2300);
        List<Product> mProduct = new ArrayList<>();
        mProduct.add(product1);
        mProduct.add(product2);
        mProduct.add(product3);
        mProduct.add(product4);
        mProduct.add(product5);
        List<Product> filtered = mProduct.stream()
                .filter(x -> x.getmPrice() > 3000)
                .filter(x -> x.getmFactory().equals("Iphone "))
                .filter(x -> x.getmYear()<2022)
                .collect(Collectors.toList());
        filtered.forEach(System.out::println);
//        System.out.println("Start of second task");
//        Employee employee1 = new Employee("Bob");
//        Employee employee2 = new Employee("Sam");
//        Employee employee3 = new Employee("Dean");
//        Employee employee4 = new Employee("Castiel");
//        Employee employee5 = new Employee("Sam");
//        List<Employee> names = new ArrayList<>();
//        names.add(employee1);
//        names.add(employee2);
//        names.add(employee3);
//        names.add(employee4);
//        names.add(employee5);
//        List<Employee> filteredNames = names.stream()




    }
}
