public class Main {
    public static void main(String[] args) {
        Employee E1 = new Employee();
        E1.setName("Kolia");
        E1.setHours(5);
        E1.setRate(6);

        Employee E2 = new Employee("Vasia");
        E2.setRate(5);
        E2.setHours(3);

        Employee E3 = new Employee("Taras", 5, 7);

        System.out.println(E1);
        System.out.println(E2);
        System.out.println(E3);
        System.out.println();
        System.out.println("Total salary of workers - " + (E1.getSalary() + E2.getSalary() + E3.getSalary()));

    }
}
