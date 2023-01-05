package HW9.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Person {
	private String firstName;
	private String lastName;
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
	public Map<String, String> removeByKey(Map<String, String> map, String name) {
		Map<String, String> newPersonsMap = new HashMap<>();
		if (map.containsKey(name)) {
			map.remove(name);
		}
		return newPersonsMap;
	}
	
	public Map<String, String> createPersonsMap(int amount) {
		Map<String, String> personsMap = new HashMap<>();
		
		for (int i = 0; i < amount; i++) {
			System.out.print("Enter first name: ");
			try {
				setFirstName(br.readLine());
			} catch (IOException e) {
				System.out.println("\nOOPS! SOMETHING WENT WRONG!\n");
				e.printStackTrace();
			}
			System.out.print("Enter last name:  ");
			try {
				setLastName(br.readLine());
			} catch (IOException e) {
				System.out.println("\nOOPS! SOMETHING WENT WRONG!\n");
				e.printStackTrace();
			}
			
			personsMap.put(getFirstName(), getLastName());
		}
		return personsMap;
	}
	
	public String choseName() {
		System.out.println("\nWhat name do you want to remove?\n");
	    String name = null;
		try {
			name = br.readLine();
		} catch (IOException e) {
			System.out.println("\nOOPS! SOMETHING WENT WRONG!\n");
			e.printStackTrace();
		}
		return name;
	}
	
	public int choseAmount() {
		System.out.println("\nHow many persons do you want to create?\n");
	    int amount = 0;
		try {
			amount = Integer.parseInt(br.readLine());
		} catch (IOException e) {
			System.out.println("\nOOPS! SOMETHING WENT WRONG!\n");
			e.printStackTrace();
		}
		return amount;
	}
	
	public void print(Map<String, String> map) {
		for (Map.Entry<String, String> entry : map.entrySet())
			System.out.println(entry.getKey() + " " + entry.getValue());
	}
}
