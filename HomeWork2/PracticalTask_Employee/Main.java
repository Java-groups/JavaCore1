public class Main {
    static Employee[] employee = new Employee[3];
    public static void main(String[] args) {
        employee[0] = new Employee("Alex",4,5);
        employee[1] = new Employee("Marvin",3,8);
        employee[2] = new Employee("Lucas",2,5);


        for(int i=0;i< employee.length;i++){
            System.out.println("Your info = " + employee[i].toString());
            System.out.println(employee[i].getBonuses());
            System.out.println("Your salary = " + employee[i].getSalary());
            employee[i].sumSalary();
        }
        System.out.println("Total salary = " + Employee.totalSum);

    }
}