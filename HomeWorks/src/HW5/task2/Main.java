package HW5.task2;

public class Main {

	public static void main(String[] args) {
		Developer developer = new Developer("Oleksa Zhurba", 28, "Java Software Developer", 47000);
        System.out.println(developer.report());

        Employee employee = new Employee("Yaryna Semenchuk", 26, 23000);
        System.out.println(employee.report());
	}

}
