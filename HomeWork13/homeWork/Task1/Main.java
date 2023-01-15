package edu.homeworks.hw13.homeWork.Task1;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        List<Product> products = List.of(new Product("Phone",2000,LocalDate.of(2010,10,1)),
                new Product("Phone",3500,LocalDate.of(2020,5,10)),
                new Product("Notebook",1200,LocalDate.of(2019,1,20)),
                new Product("PC",2050,LocalDate.of(2021,9,8)));

        List<Product> result = products
                .stream()
                .filter(product -> product.getManufactureCategory().equals("Phone"))
                .filter(product -> product.getPrice()>3000)
                .filter(product -> product.getDate().getYear() < date.minusYears(1).getYear())
                .collect(Collectors.toList());

        result.forEach(System.out::println);




    }
}
