public class SalariedEmployee extends Employee implements Payment {
    private String socialSecurityNumber;

    public SalariedEmployee(String employeeId, int salary, String socialSecurityNumber) {
        super(employeeId);
        this.setSalary(salary);
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public int calculatePay() {
        return this.getSalary();
    }

    @Override
    public String toString() {
        return "Salaried employee has ID # "
                +this.getEmployeeId()
                +", SSN is "
                +this.getSocialSecurityNumber()
                +", salary is "
                +this.calculatePay();
    }
}
