package HW3.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	Dog dog = new Dog();
    	List<Dog> dogs = new ArrayList<>();
		    dogs.add(new Dog ("Jack", Dog.Breeds.BEAGLE, 7));
		    dogs.add(new Dog ("Vader", Dog.Breeds.BULLMASTIFF, 6));
		    dogs.add(new Dog ("Lolly", Dog.Breeds.AKITA, 6));
		    dogs.add(new Dog ("Jack", Dog.Breeds.BORDER_COLLIE, 11));
		    
		System.out.print("\nEnter dogs name: ");
		String name = br.readLine();
    	System.out.println("\nThe next dogs have name '" + name + "': \n");
    	
    	dog.findMatches(dogs, name);
		System.out.println(dog.sameDogsName);
		
		System.out.print("\nEnter dogs age: ");
		int age = Integer.parseInt(br.readLine());
		System.out.println("\nThe next dogs are " + age + " years old: \n");
		
		dog.findOldest(dogs, age);
		System.out.println(dog.sameDogsAge);
    
	}
 
}
