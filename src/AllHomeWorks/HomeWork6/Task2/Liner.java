package AllHomeWorks.HomeWork6.Task2;

public class Liner extends WaterVehicle{

    protected int floors;

    public Liner (int passengers, int floors){
        super(passengers);
        setFloors(floors);
    }

    @Override
    boolean isSaling() {
        return getFloors() > 0;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public int getFloors() {
        return floors;
    }

    public String toString() {
        return String.format("%s, floors: %s", super.toString(), getFloors());
    }
}
