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

/*  An issue i need to resolve:
 *      When i'm trying to enter dogs name by using BufferedReader it doesn't
 *      work. When I put the name by myself directly in the method everything
 *      works */
		    
		System.out.println("Lets find all dogs with name 'Jack'!\n");
		String name = "Jack";
    	System.out.println("The next dogs have name '" + name + "': \n");
    	
    	dog.findMatches(dogs, name);
		System.out.println(dog.sameDogsName);
		
		System.out.println("Enter dogs age: ");
		int age = Integer.parseInt(br.readLine());
		System.out.println("The next dogs are with age '" + age + "': \n");
		dog.findOldest(dogs, age);
		System.out.println(dog.sameDogsAge);
    
	}
 
}
