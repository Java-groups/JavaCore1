package HW6.com.model.HW6;

public class SalariedEmployee extends Employee implements Payment{

    private double hourlyPaid;

    private double hoursWorked;
    private String socialSecurityNumber;


    public SalariedEmployee(String employeeld, String name) {
        super(employeeld, name);
    }

    public SalariedEmployee(String employeeId, String name, double hourlyPaid, double hoursWorked, String socialSecurityNumber) {
        super(employeeId, name);
        this.hourlyPaid = hourlyPaid;
        this.hoursWorked = hoursWorked;
        this.socialSecurityNumber = socialSecurityNumber;

    }

    public double getHourlyPaid() {
        return hourlyPaid;
    }

    public void setHourlyPaid(double hourlyPaid) {
        this.hourlyPaid = hourlyPaid;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public void calculatePay() {
        setAverageMonthlyWage(hourlyPaid * hoursWorked);

    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "name=" + getName()+ " " +
                "employeeId=" +getEmployeeId()+" "+
                "hourlyPaid=" + hourlyPaid +
                ", hoursWorked=" + hoursWorked +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", averageMonthlyWage=" + getAverageMonthlyWage() +
                '}';
    }
}
