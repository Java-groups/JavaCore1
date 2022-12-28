package HW6.practical_tasks.task2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();
		
		persons.add(new Teacher("Ostap"));
		persons.add(new Student("Iryna"));
		persons.add(new Cleaner("Volodymyr"));
		
		persons.forEach(person -> person.print());

	}

}
