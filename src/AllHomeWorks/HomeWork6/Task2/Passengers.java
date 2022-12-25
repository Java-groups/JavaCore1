package AllHomeWorks.HomeWork6.Task2;

abstract class Passengers {
    protected int passengers;

    public Passengers(int passengers){
        setPassengers(passengers);
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getPassengers() {
        return passengers;
    }

    public String toString() {
        return String.format("Passengers count: %s", getPassengers());
    }
}
