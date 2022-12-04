package homework2;

public class ApplEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1 = new Employee("Anna Viktorivna", 50, 40);
		e1.setName("Anna Viktorivna");
		e1.setRate(50);
		e1.setHours(40);
		System.out.println(e1);

		Employee e2 = new Employee("Pavlo Nekrasov", 45.3, 40);
		e2.setName("Pavlo Nekrasov");
		e2.setRate(45.2);
		e2.setHours(40);
		System.out.println(e2);

		Employee e3 = new Employee("Kateryna Leonidivna", 38.7, 40);
		e3.setName("Kateryna Leonidivna");
		e3.setRate(38.7);
		e3.setHours(40);
		System.out.println(e3);

		System.out.println("Salary of " + e1.getName() + " = " + e1.getSalary() + "$");
		System.out.println("Salary of " + e2.getName() + " = " + e2.getSalary() + "$");
		System.out.println("Salary of " + e3.getName() + " = " + e3.getSalary() + "$");
		System.out.println("Total salary is " + Employee.totalSum() + "$");

	}

}
