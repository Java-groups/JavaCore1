package arthurmkrtchian.javaCore.HW06.OOP2.homeWorks.homeWork2;

public class Liner extends WaterVehicle{

    private int floors;

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public Liner(int passengers, int floors) {
        super(passengers);
        this.floors = floors;
    }

    @Override
    public void isSailing() {
        System.out.println("The liner sails...");
    }
}
