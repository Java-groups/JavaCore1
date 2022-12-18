import static java.lang.System.out;

public class Boat extends WaterVehicle {
    public Boat(int passengers, int volume) {
        super(passengers);
        this.volume = volume;
    }

    private int volume;

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public void isSailing() {
        out.println("Boat sailing");
    }
}
