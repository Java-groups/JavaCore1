package homework2_hw;

import java.time.Year;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person {

	int year = Year.now().getValue();

	private String firstName;
	private String lastName;
	private int birthYear;
	private int age;
	public String newName;

	public String getNewName() {
		return newName;
	}

	public void setNewName(String newName) {
		this.newName = newName;
	}

	public int getAge() {
		age = year - birthYear;
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

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

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public void input() throws IOException {

		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name");
		firstName = read.readLine();
		System.out.println("Enter your last name");
		lastName = read.readLine();
		System.out.println("Enter your birth year");
		birthYear = Integer.parseInt(read.readLine());

	}

	public void changeName(String newName) throws IOException {

		firstName = newName;

		// firstName = newName;

		System.out.println("Your new name is " + firstName);

	}

	public void output() {

		System.out.println("Your name is " + firstName);
		System.out.println("Your surname is " + lastName);
		System.out.println("You are " + getAge() + " years old");

	}

	public Person(String firstName, String lastName) {

		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Person(String firstName, String lastName, int birthYear ) {

		
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;

	}

	public Person() {

	}

	@Override
	public String toString() {
		return "Person [year= " + year + ", firstName= " + firstName + ", lastName= " + lastName + ", birthYear= "
				+ birthYear + ", age= " + age + "]";
	}

}
