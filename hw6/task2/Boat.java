package hw6.task2;

public class Boat extends WaterVehicle{
    private int volume;

    @Override
    public void isSailing() {};

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
