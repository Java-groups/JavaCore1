package AllHomeWorks.HomeWork6.Task2;

public class Boat extends WaterVehicle{
    public int volume;

    @Override
    boolean isSaling() {
        return getVolume() > 0;
    }

    public Boat(int passengers, int volume){
        super(passengers);
        setVolume(volume);
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public String toString() {
        return String.format("%s, volume: %s", super.toString(), getVolume());
    }
}
