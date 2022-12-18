import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[] {
                new ContractEmployee("1", "7", 51, 50),
                new SalariedEmployee("2",30, "4"),
                new ContractEmployee("3", "77", 52, 50),
                new SalariedEmployee("4",300, "45"),
                new ContractEmployee("5", "777", 53, 50),
                new SalariedEmployee("6",3000, "4567"),
                new ContractEmployee("7", "7777", 54, 50),
                new SalariedEmployee("8",30000, "45678")
        };
        Arrays.sort(employees);
        for (Employee employee: employees) {
            System.out.println(employee);
        }
    }
}