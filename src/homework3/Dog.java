package homework3;

import java.io.IOException;
import java.util.Objects;

public class Dog {

	private String name;
	public enum Breed  {

		pooch, labrador, dachshund;
		
	
	}
	
	private Breed breed;
	Breed breed1 = Breed.pooch;
	Breed breed2 = Breed.labrador;
	Breed breed3 = Breed.dachshund;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public void setBreed(Breed breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Dog(String name, Breed breed, int age) {

		this.name = name;
		this.breed = breed;
		this.age = age;

	}

	public Dog() {

	}

	public Dog(String name, Breed breed) {

		this.name = name;
		this.breed = breed;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", breed=" + breed + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		return Objects.equals(name, other.name);
	}
	
	



}
