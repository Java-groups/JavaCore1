package AllHomeWorks.HomeWork11Practical.Task2;

import Helper.RandomHelper;
import Helper.StringHelper;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Task2 {
    public static void doTask(BufferedReader br) throws IOException {
        ArrayList<Plant> plantList = new ArrayList<>();

        ArrayList<String> typesList = new ArrayList<>(
                Arrays
                        .stream(Type.values())
                        .map(type -> StringHelper.firstUppercase(type.getType()))
                        .toList()
        );
        typesList.add("Some invalid type");

        ArrayList<String> colorsList = new ArrayList<>(
                Arrays
                        .stream(Color.values())
                        .map(color -> StringHelper.firstUppercase(color.getColor()))
                        .toList()
        );
        colorsList.add("Some invalid color");

        for (int i = 0; i < 5; i++){
            try {
                plantList.add(
                    new Plant(
                            RandomHelper.randomElementFromList(typesList),
                            RandomHelper.randomElementFromList(colorsList),
                            RandomHelper.positiveInteger(100)
                    )
                );
            } catch (ColorException | TypeException e) {
                System.err.println(e.getMessage() + "\n");
            }
        }

        for (Plant plant : plantList) {
            plant.info();
        }

    }
}
