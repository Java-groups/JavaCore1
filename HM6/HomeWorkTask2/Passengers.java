package HM6.HomeWorkTask2;

public abstract class Passengers {
    private int passengers;

    Passengers(int passengers) {
        this.passengers = passengers;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }
}

