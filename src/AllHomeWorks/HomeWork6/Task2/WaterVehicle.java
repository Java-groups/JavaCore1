package AllHomeWorks.HomeWork6.Task2;

abstract class WaterVehicle extends Passengers implements Vehicle{
    public WaterVehicle(int passengers){
        super(passengers);
    }

    abstract boolean isSaling();

    public String toString() {
        return String.format("%s, is sailing: %s", super.toString(), isSaling());
    }
}
