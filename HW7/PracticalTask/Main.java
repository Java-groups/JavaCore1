public class Main {
    public static void main(String[] args) {
        Department departmentOne = new Department();
        System.out.println(departmentOne.getAddress().getCity());
        Department departmentTwo = departmentOne.clone();
        departmentTwo.getAddress().setCity("London");
        System.out.println(departmentTwo.getAddress().getCity());
    }
}