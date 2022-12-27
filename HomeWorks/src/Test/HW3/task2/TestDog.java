package Test.HW3.task2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import HW3.task2.Dog;
import HW3.task2.Dog.Breeds;

class TestDog {

	@Test
	void testFindMatcghes() {
		Dog dog = new Dog();
		List<Dog> dogs = new ArrayList<>();
		dogs.add(new Dog("Jack", Breeds.BEAGLE, 7));
		dogs.add(new Dog("Vader", Breeds.BULLMASTIFF, 6));
		dogs.add(new Dog("Lolly", Breeds.AKITA, 6));
		dogs.add(new Dog("Jack", Breeds.BORDER_COLLIE, 11));

		List<Dog> expected = new ArrayList<>();
		expected.add(new Dog("Jack", Breeds.BEAGLE, 7));
		expected.add(new Dog("Jack", Breeds.BORDER_COLLIE, 11));

		assertEquals(expected, dog.findMatches(dogs, "Jack"));
	}

	@Test
	void testFindOldest() {
		Dog dog = new Dog();
		List<Dog> dogs = new ArrayList<>();
		dogs.add(new Dog("Jack", Breeds.BEAGLE, 7));
		dogs.add(new Dog("Vader", Breeds.BULLMASTIFF, 6));
		dogs.add(new Dog("Lolly", Breeds.AKITA, 6));
		dogs.add(new Dog("Jack", Breeds.BORDER_COLLIE, 11));

		List<Dog> expected = new ArrayList<>();
		expected.add(new Dog("Vader", Breeds.BULLMASTIFF, 6));
		expected.add(new Dog("Lolly", Breeds.AKITA, 6));

		assertEquals(expected, dog.findOldest(dogs, 6));
	}
}
