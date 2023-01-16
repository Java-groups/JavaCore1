package arthurmkrtchian.javaCore.HW06.OOP2.homeWorks.homeWork2;

public class Boat extends WaterVehicle{
    private int volume;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public Boat(int passengers, int volume) {
        super(passengers);
        this.volume = volume;
    }

    @Override
    public void isSailing() {
        System.out.println("The boat sails...");
    }
}
