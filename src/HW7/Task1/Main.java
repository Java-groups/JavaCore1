package HW7.Task1;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Department department = new Department("A","IF","PB",25);
        String address1 = String.valueOf(department.getAddress());
        System.out.println(address1);

        Department copyOfDepartment = (Department) department.clone();
        copyOfDepartment.setAddress("Lviv","PB",25);


        System.out.println(department);
        System.out.println();
        System.out.println(copyOfDepartment);
    }
}
