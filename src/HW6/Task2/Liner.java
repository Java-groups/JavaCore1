package HW6.Task2;

public class Liner extends WaterVehicle{
    private int floors;

    public Liner(int passengers) {
        super(passengers);
    }

    @Override
    public void isSailing() {
        super.isSailing();
    }

    @Override
    public String toString() {
        return "Liner{" +
                "floors = " + floors + ", passengers = " + getPassengers() +
                '}';
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }
}
