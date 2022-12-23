package PracticalTask7_innerClasses;

public class MainDepartment {
    public static void main(String[] args) throws CloneNotSupportedException {

        Department[] departments = new Department[3];

        departments[0] = new Department("Alex", new Department.Address("Dnipro", "Gonchara", 34));

        Department copyOfDepartment = (Department) departments[0].clone();

        System.out.println(departments[0]);
        System.out.println(copyOfDepartment);

        copyOfDepartment.setName("Masha");
        copyOfDepartment.getAddress().setStreet("Kalinova");
        System.out.println("-------------------");
        System.out.println(departments[0]);
        System.out.println(copyOfDepartment);

    }

}
