package Lesson12.task_2;

import java.util.stream.Stream;

public class PlantApp {
    public static void main(String[] args) {
        Plant[] plants = new Plant[5];
        try {
            plants[0] = new Plant("Rose", "Red", 200);
            plants[1] = new Plant("Tulip", "White", 50);
            plants[2] = new Plant("Cornflower", "Blue", 30);
            plants[3] = new Plant("Rose", "Yellow", 250);
            plants[4] = new Plant("Dog", "Black", 37);
        } catch (Plant.ColorException | Plant.TypeException e) {
            System.out.println("Error: " + e.getMessage());
        }
        Stream.of(plants).forEach(System.out::println);
    }
}
