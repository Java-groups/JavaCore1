package HW9.practical_tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Employee {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public Map<Integer, String> addEmployee() {
		Map<Integer, String> employeeMap = new HashMap<>();
		int amount = addAmount();

		for (int i = 0; i < amount; i++) {
			employeeMap.put(i, addName());
		}
		return employeeMap;
	}
	
	public void print(Map<Integer, String> map) {
		for (Map.Entry<Integer, String> entry : map.entrySet())
			System.out.println(entry.getKey() + ": " + entry.getValue());
	}

	public void findEmployeeByValue(Map<Integer, String> map) {
		System.out.print("Enter employee's name: ");
		String name = null;
		
		try {
			name = br.readLine();
		} catch (IOException e) {
			System.out.println("\nOOPS! SOMETHING WENT WRONG!\n");
			e.printStackTrace();
		}
		
        if (map.containsValue(name)) {
            for (Map.Entry<Integer, String> entry : map.entrySet()) {
                if (name.equals(entry.getValue())) {
                    System.out.println("Employee '" + name + "' has id: '" + entry.getKey() + "'");
                }
            }
        } else {
            System.out.println("There is no employee with name '" + name + "'");
        }
	}
	
	public void findEmployeeById(Map<Integer, String> map) {
		System.out.print("Enter employee id: ");
		int id = 0;
		
		try {
			id = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			System.out.println("\nOOPS! SOMETHING WENT WRONG!\n" + "It is not a number!\n");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("\nOOPS! SOMETHING WENT WRONG!\n");
			e.printStackTrace();
		}
		
		if (map.containsKey(id)) {
			System.out.println("Employee with id: '" + id + "' is '" + map.get(id) + "'");
		} else {
			System.out.println("There is no employee with id '" + id + "'");
		}
	}

	private int addAmount() {
		System.out.print("How many employees you want to add? ");
		int amount = 0;
		
		try {
			amount = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			System.out.println("\nOOPS! SOMETHING WENT WRONG!\n" + "It is not a number!\n");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("\nOOPS! SOMETHING WENT WRONG!\n");
			e.printStackTrace();
		}
		
		return amount;
	}

	private String addName() {
		System.out.print("Enter the name of the employee: ");
		String name = null;
		
		try {
			name = br.readLine();
		} catch (IOException e) {
			System.out.println("\nOOPS! SOMETHING WENT WRONG!\n");
			e.printStackTrace();
		}
		
		return name;
	}

}
