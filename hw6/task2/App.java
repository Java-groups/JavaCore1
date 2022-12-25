package hw6.task2;

public class App {
    public static void main(String[] args) {
        WaterVehicle waterVehicle = new Liner();
        Passengers p = waterVehicle;
        FlyingVehicle flyingVehicle = new Helicopter();
        Passengers p1 = flyingVehicle;

        GroundVehicle groundVehicle = new Bus();
        Passengers p2 = groundVehicle;
    }
}
