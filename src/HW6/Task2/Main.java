package HW6.Task2;

public class Main {
    public static void main(String[] args) {
        Vechicle[] vechicles = new Vechicle[7];
        vechicles[0] = new Car(8);
        ((Car)vechicles[0]).setModel("Ford");
        vechicles[1] = new Helicopter(3);
        ((Helicopter)vechicles[1]).setWeight(100);
        ((Helicopter)vechicles[1]).setMaxWeight(150);
        vechicles[2] = new Boat(2);
        ((Boat)vechicles[2]).setVolume(20);
        vechicles[3] = new Bus(15);
        ((Bus)vechicles[3]).setRoute("school");
        vechicles[4] = new Motorcycle(1);
        ((Motorcycle)vechicles[4]).setMaxSpeed(350);
        vechicles[5] = new Plane(56);
        ((Plane)vechicles[5]).setMaxDistance(5000);
        vechicles[6] = new Liner(30);
        ((Liner)vechicles[6]).setFloors(2);

        for (int i = 0; i < vechicles.length; i++) {
            System.out.println(vechicles[i]);
        }







    }
}
