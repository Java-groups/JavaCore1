package PracticalTask5.Mashin;

public class MainMashin {
    public static void main(String[] args) {
        Car[] car = new Car[4];
        car[0] = new Sedan("A5", 200, 2008);
        car[1] = new Sedan("L200", 180, 2021);
        car[2] = new Truck("Scania", 140, 2015);
        car[3] = new Truck("MAN", 100, 1996);

        for (Car i : car) {
            System.out.println(i);
        }
    }
}
