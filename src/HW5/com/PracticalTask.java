package HW5.com;

import HW5.com.model.color.Color;
import HW5.com.model.color.ColorLine;
import HW5.com.model.color.Line;
import HW5.com.model.color.Point;
import HW5.com.model.vehicle.Car;
import HW5.com.model.vehicle.Sedan;
import HW5.com.model.vehicle.Truck;

public class PracticalTask {
    public static void main(String[] args) {
        Car[] car = new Car[3];
        car[0] = new Sedan();
        car[1] = new Truck();
        car[2] = new Sedan();

        Car car1 = new Truck();
        car1.run();

        for (int i = 0; i < car.length; i++) {
            car[i].run();
            car[i].stop();
        }

        Line[] lineArray = new Line[2];
        lineArray[0] = new Line(new Point(1,5), new Point(3,7));
        Color black = new Color("black");
        Color red = new Color("red");
        Point point1 = new Point(5,8);
        lineArray[1] = new ColorLine(new Point(3,7),point1,
                black,red);

        for (int i = 0; i < lineArray.length; i++) {
            lineArray[i].toString();
            lineArray[i].print();
        }

    }
}
