package HM7.PracticalTask;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Department dep1 = new Department("Sales", new Department.Address("Lviv", "Ivana Franka", 54));
        Department dep1Copy = (Department) dep1.clone();

        dep1Copy.address.city = "Ternopil";

        System.out.println(dep1.toString());
    }
}
