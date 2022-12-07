package homework2_hw;

import java.io.IOException;

public class ApplPerson {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		Person person1 = new Person();
		person1.input();
		person1.output();
		person1.changeName("Olya");
		person1.output();

		Person person2 = new Person();
		person2.setFirstName("Ira");
		person2.setLastName("Via");
		person2.setBirthYear(1994);
		person2.getAge();
		System.out.println(person2);

		Person person3 = new Person();
		person3.input();
		person3.output();

		Person person4 = new Person("Nastya", "Lysenko");
		person4.setBirthYear(1997);
		person4.output();

		Person person5 = new Person("Olenka", "Chorna", 1996);
		person5.output();

	}

}
