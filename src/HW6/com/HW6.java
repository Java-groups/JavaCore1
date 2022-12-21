package HW6.com;

import HW6.com.model.HW6.*;
import HW6.com.model.passangers.Vehicle;
import HW6.com.model.passangers.flyingVehicle.Helicopter;
import HW6.com.model.passangers.flyingVehicle.Plane;
import HW6.com.model.passangers.groundVehicle.Bus;
import HW6.com.model.passangers.groundVehicle.Car;
import HW6.com.model.passangers.groundVehicle.Motorcycle;
import HW6.com.model.passangers.vehicle.FlyingVehicle;
import HW6.com.model.passangers.vehicle.GroundVehicle;
import HW6.com.model.passangers.vehicle.WaterVehicle;
import HW6.com.model.passangers.waterVehicle.Boat;
import HW6.com.model.passangers.waterVehicle.Liner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HW6 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];
        ContractEmployee employee1 = new ContractEmployee("1","Nick");
        employee1.setFixedPaid(10);
        employee1.setFederalTaxIdMember("123");

        employees[0] = employee1;
        employees[1] = new ContractEmployee("2","Rick", 24, "234");
        employees[2] = new SalariedEmployee("3","Mike", 6, 10,"456");
        employees[3] = new ContractEmployee("4","Martin", 15, "768");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] instanceof ContractEmployee){
                ((ContractEmployee)employees[i]).calculatePay();
            } else if (employees[i] instanceof SalariedEmployee){
                ((SalariedEmployee)employees[i]).calculatePay();
            }
        }
        System.out.println("Before sorting");
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
        Arrays.sort(employees);
        System.out.println("After sorting");
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add( employees[0]);
        employeeList.add( employees[1]);
        employeeList.add( employees[2]);
        employeeList.add( employees[3]);
        System.out.println("Before name list sort");
        for (Employee employee: employeeList) {
            System.out.println(employee);
        }
        employeeList.sort(new EmployeeNameComparator());
        System.out.println("After name list sort");
        for (Employee employee: employeeList) {
            System.out.println(employee);
        }
        List<Employee> employeeWageList = new ArrayList<Employee>();
        employeeWageList.add( employees[0]);
        employeeWageList.add( employees[3]);
        employeeWageList.add( employees[2]);
        employeeWageList.add( employees[1]);
        System.out.println("Before wage list sort");
        for (Employee employee: employeeWageList) {
            System.out.println(employee);
        }
        employeeWageList.sort(new EmployeeAverageWageComparator());
        System.out.println("After wage list sort");
        for (Employee employee: employeeWageList) {
            System.out.println(employee);
        }
        Vehicle liner = new Liner(100);
        ((Liner)liner).setFloors(4);
        Vehicle boat = new Boat(5);
        ((Boat)boat).setVolume(5);
        Vehicle plane = new Plane(120);
        ((Plane)plane).setMaxDistance(1000);
        Vehicle helicopter = new Helicopter(3);
        Vehicle car = new Car(4);
        ((Car)car).setModel("BMW");
        Vehicle bus = new Bus(30);
        ((Bus)bus).setRoute("Pozniaky - Paris");
        Vehicle motorcycle = new Motorcycle(2);
        ((Motorcycle)motorcycle).setMaxSpeed(200);
        System.out.println("Starting vehicle work");
        List<Vehicle> vehicleList = new ArrayList<Vehicle>();
        vehicleList.add(liner);
        vehicleList.add(boat);
        vehicleList.add(plane);
        vehicleList.add(helicopter);
        vehicleList.add(car);
        vehicleList.add(bus);
        vehicleList.add(motorcycle);
        for (Vehicle vehicle:vehicleList) {
            if(vehicle instanceof WaterVehicle){
                ((WaterVehicle) vehicle).isSailing();
            } else if (vehicle instanceof FlyingVehicle) {
                ((FlyingVehicle) vehicle).fly();
                ((FlyingVehicle) vehicle).land();
            } else if (vehicle instanceof GroundVehicle) {
                ((GroundVehicle) vehicle).drive();
            }

        }

    }

}
