package arthurmkrtchian.javaCore.HW11.exceptions.practicalTasks.practicalTask2;

//        2. Create a class Plant, which includes fields int size, Color color and Type type, and
//        constructor where these fields are initialized. Color and type are Enum. Override the
//        method toString( ). Create classes ColorException and TypeException and describe there all
//        possible colors and types of plants. In the method main create an array of five plants.
//        Check to work your exceptions.

public class Main {
    public static void main(String[] args) {
        print(fillArray());
    }

    private static Plant[] fillArray() {

        return new Plant[]{
                new Plant(20, "Red", "Tree"),
                new Plant(44, "blue", "HERB"),
                new Plant(35, "yellow", "Chameleon_flower"),
                new Plant(79, "aqua", "Climber"),
                new Plant(61, "Red", "Shrub"),
        };
    }

    private static void print(Plant[] array) {
        for (Plant plant : array) {
            System.out.println(plant.toString());
        }
    }
}
