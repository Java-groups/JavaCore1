import static java.lang.System.out;

public class Liner extends WaterVehicle{
    public Liner(int passengers, int floors) {
        super(passengers);
        this.floors = floors;
    }
    private int floors;

    public void setFloors(int floors) {
        this.floors = floors;
    }
    public int getFloors() {
        return floors;
    }

    @Override
    public void isSailing() {
        out.println("Liner sailing");
    }
}
