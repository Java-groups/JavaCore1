package edu.homeworks.hw13.homeWork.Task2;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeArrays = List.of(new Employee("Sam"),
                new Employee("Bobby"),
                new Employee("Sam"),
                new Employee("Bobby"),
                new Employee("Sam"));


        //mostPopularName(employeeArrays.stream());
        employeeArrays.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .ifPresent(System.out::println);



    }
}
