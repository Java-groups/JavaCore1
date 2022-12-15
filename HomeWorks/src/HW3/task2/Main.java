package HW3.task2;

public class Main {
	
	
    public static void main(String[] args) {
		Dog dog1 = new Dog ("Jack", Dog.Breeds.BEAGLE, 7);
	    Dog dog2 = new Dog ("Vader", Dog.Breeds.BULLMASTIFF, 6);
	    Dog dog3 = new Dog ("Lolly", Dog.Breeds.AKITA, 6);
	    Dog dog4 = new Dog ("Jack", Dog.Breeds.BORDER_COLLIE, 11);
	    
	    Dog dog = new Dog();
		dog.findMatches(dog1, dog4);
		System.out.println(dog.resultName);
		
		dog.findOldest(dog3, dog2);
		System.out.println(dog.resultAge);
    
	}
 
}
