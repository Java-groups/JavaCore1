package AllHomeWorks.HomeWork6.Task2;

abstract class GroundVehicle extends Passengers implements Vehicle{
    protected boolean isDriving = false;
    protected int maxSpeed;

    public GroundVehicle (int passengers){
        super(passengers);
        setMaxSpeed(maxSpeed);
    }
    abstract  void drive();

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String toString() {
        return String.format("%s, is driving: %s", super.toString(), isDriving);
    }

}
