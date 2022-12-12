package homework3;

import homework3.Dog.Breed;

public class MainDog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog dog1 = new Dog();
		dog1.setName("Charley");
		dog1.setBreed(Breed.labrador);
		dog1.setAge(7);
		System.out.println(dog1);

		Dog dog2 = new Dog("Becka", Breed.dachshund , 4);
		System.out.println(dog2);

		Dog dog3 = new Dog("Luna", Breed.pooch);
		dog3.setAge(2);
		System.out.println(dog3);

		oldestDog(dog1, dog2, dog3);
		System.out.println(dog1.equals(dog2));
		System.out.println(dog2.equals(dog3));
		System.out.println(dog3.equals(dog1));

	}

	public static void oldestDog(Dog dog1, Dog dog2, Dog dog3) {

		if (dog1.getAge() > dog2.getAge() && dog1.getAge() > dog3.getAge()) {

			System.out.println("The oldest dog is " + dog1);

		} else if (dog2.getAge() > dog1.getAge() && dog2.getAge() > dog3.getAge()) {

			System.out.println("The oldest dog is " + dog2);
		} else {

			System.out.println("The oldest dog is " + dog3);
		}

	}
}
