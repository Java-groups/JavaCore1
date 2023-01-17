package com.home_work_pract_13_StreamsAPI_andPract;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AppStreams_Pract
{

	protected static Optional<String> mostPopularName(Stream<Employee> employees)
	{
		return employees.filter(t -> !t.getName().isEmpty()).
							map(t -> t.getName()).
							collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).
							entrySet().
							stream().
							map(Function.identity()).
							max((o1, o2) -> o1.getValue().compareTo(o2.getValue())).
							map(t -> t.getKey());
	}

	public static void main(String[] args)
	{

		List<String> list = Arrays.asList("bla", "", "simp", 
				"", "second", "third", "third", "sec", "blablabla");
		List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);

		Stream<String> st = list.stream();
		Stream<Integer> st_1 = primes.stream();

		System.out.println("\t\t\tHOME_WORK_14_Practical_task_1_1");
		System.out.println(st.filter(t -> t.isEmpty()).count() + " : empty strings in list.");

		st = list.stream();
		System.out.println("\t\t\tHOME_WORK_14_Practical_task_1_2");
		st.filter(t -> !t.isEmpty()).forEach(System.out::println);

		st = list.stream();
		System.out.println("\t\t\tHOME_WORK_14_Practical_task_1_3");
		st.filter(str -> !str.isEmpty()).map(str -> str.toUpperCase()+",").forEach(System.out::println);

		System.out.println("\t\t\tHOME_WORK_14_Practical_task_2");
		st_1 = primes.stream();
		System.out.println("Min: " + st_1.min(Integer::compare).get());

		st_1 = primes.stream();
		System.out.println("Max: " + st_1.max(Integer::compare).get());

		st_1 = primes.stream();
		IntSummaryStatistics stat = primes.stream().mapToInt(x -> x).summaryStatistics();
		System.out.println("Sum: : " + stat.getSum());

		System.out.println("\t\t\tHOME_WORK_14_Task_1_1");
		TreeMap<Integer, Product> product_list = new TreeMap<Integer, Product>();
		HashMap<Integer, Employee> employee_list = new HashMap<Integer, Employee>();

		employee_list.put(0, new Employee("name_4"));
		employee_list.get(0).setSalary(800);
		employee_list.get(0).setDepartment(10);

		employee_list.put(1, new Employee("name_3"));
		employee_list.get(1).setSalary(850);
		employee_list.get(1).setDepartment(10);

		employee_list.put(2, new Employee("name_1"));
		employee_list.get(2).setSalary(900);
		employee_list.get(2).setDepartment(10);

		employee_list.put(3, new Employee("name_1"));
		employee_list.get(3).setSalary(950);
		employee_list.get(3).setDepartment(10);

		employee_list.put(4, new Employee("name_1"));
		employee_list.get(4).setSalary(1000);
		employee_list.get(4).setDepartment(10);

		employee_list.put(5, new Employee("name_3"));
		employee_list.get(5).setSalary(800);
		employee_list.get(5).setDepartment(10);

		try(BufferedReader br_1 = new BufferedReader(new InputStreamReader(System.in)))
		{
			Product.fillOutProductList(br_1, product_list);
			Product.sortListByPrice(product_list).forEach(t -> System.out.println("Category: " + t.getManufacture_category() + "\t\tDate: " + t.getDate() + "\tPrice: " + t.getPrice()));
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

		System.out.println("\n");
		Product.showProductList(product_list);
		
		System.out.println("\t\t\tHOME_WORK_14_Task_1_2");
		Stream<Employee> str_stream = employee_list.values().stream();

		System.out.println(mostPopularName(str_stream));

	}
}