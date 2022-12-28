package HW6.practical_tasks.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Cat> cats = new ArrayList<>();
		cats.add(new Cat("Mark", "Nazar"));
		cats.add(new Cat("Clyde", "Yaryna"));
		cats.add(new Cat("Felix", "Vasyl"));

		List<Dog> dogs = new ArrayList<>();
		dogs.add(new Dog("Bear", "Valentyn"));
		dogs.add(new Dog("Rocky", "Alina"));
		dogs.add(new Dog("Vader", "Maxym"));
		
		
	    for (int i = 0; i < cats.size(); i++) {
	    	System.out.println(cats.get(i).getOwner() + "'s cat " + cats.get(i).getName() + " - " + cats.get(i).voice() + "\n");
	    	System.out.println(cats.get(i).getOwner() + "'s cat " + cats.get(i).getName() + " - " + cats.get(i).feed() + "\n");
	    }
	    
	    for (int i = 0; i < dogs.size(); i++) {
	    	System.out.println(dogs.get(i).getOwner() + "'s dog " + dogs.get(i).getName() + " - " + dogs.get(i).voice() + "\n");
	    	System.out.println(dogs.get(i).getOwner() + "'s dog " + dogs.get(i).getName() + " - " + dogs.get(i).feed() + "\n");
	    }
	}

}
