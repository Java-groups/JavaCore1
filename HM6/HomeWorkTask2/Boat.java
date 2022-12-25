package HM6.HomeWorkTask2;

public class Boat extends WaterVehicle{
    private int volume;

    Boat(int passengers) {
        super(passengers);
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    void isSailing() {}

}
