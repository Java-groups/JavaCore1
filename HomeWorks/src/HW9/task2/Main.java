package HW9.task2;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Person p = new Person();
/**
 * Create map personMap and add to it ten persons of type <String, String>
 * (lastName, firstName). Output the entities of the map on the screen. There
 * are at less two persons with the same firstName among these 10 people? Remove
 * from the map person whose firstName is ”Orest” (or other). Print result.
 */
		Map<String, String> personMap = new HashMap<>();
		personMap = p.createPersonsMap(p.choseAmount());
		p.print(personMap);

		p.removeByKey(personMap, p.choseName());
		p.print(personMap);
	}

}
