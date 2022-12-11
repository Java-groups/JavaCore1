package HW2;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Person person1 = new Person("Nazar", "Klimovych", 1992);
		Person person2 = new Person();
		Person person3 = new Person();
		Person person4 = new Person();
		Person person5 = new Person();
		
		
		System.out.println("\nPerson 1:");
	    person1.input();
	    person1.changePersonInfo();
	    person1.output();
	    
	    System.out.println("\nPerson 2:");
	    person2.input();
	    person2.output();
	    
	    System.out.println("\nPerson 3:");
	    person3.input();
	    person3.output();
	    
	    System.out.println("\nPerson 4:");
	    person3.input();
	    person3.output();
	    
	    System.out.println("\nPerson 5:");
	    person3.input();
	    person3.output();
	    
	
	}



}
