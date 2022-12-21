package HW7.com;

public class PracticalTask {
    public static void main(String[] args) throws CloneNotSupportedException {
        Department department = new Department();

        Department.Adress adress = new Department().new Adress();
        adress.setBuilding(1);
        adress.setCity("Kyiv");
        adress.setStreet("Ahmatova");
        department.setAdress(adress);

        Department.Adress adress1 = (Department.Adress) adress.clone();



        adress.setStreet("2");
        System.out.println(adress.getStreet());
        System.out.println(adress1.getStreet());



        department.setAdress(new Department().new Adress());
        department.setName("IT-department");
        department.getAdress().setBuilding(1);
        department.getAdress().setCity("Kyiv");
        department.getAdress().setStreet("Ahmatova");

        Department department1 = (Department) department.clone();

        department.getAdress().setCity("Dnipro");
        System.out.println(department1);
        System.out.println(department);

    }
}
