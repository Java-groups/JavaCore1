package HW13.task2;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.*;

public class Employee {
	private String name;

	public Employee() {

	}

	public Employee(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static Optional<String> mostPopularName(Stream<Employee> employees) {
		Map<String, Long> names = employees
				.filter(employee -> !employee.getName().isEmpty())
				.map(Employee::getName)
				.map(String::toLowerCase)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		if (names.isEmpty()) {return Optional.empty();}
		return Optional.of(capitalize(Collections.max(names.entrySet(), Comparator.comparing(Map.Entry::getValue)).getKey()));
	}
	
	private static String capitalize(String str) {
	    if(str == null || str.isEmpty()) {
	        return str;
	    }
	    return str.substring(0, 1).toUpperCase() + str.substring(1);
	}
}
