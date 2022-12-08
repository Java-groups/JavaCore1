package AllHomeWorks.HomeWork3.Task1.Part1;

import java.io.BufferedReader;
import java.io.IOException;

public class Part1 {
    public static void doTask(BufferedReader br) throws IOException {
        boolean numberMarker = true;

        for (int i = 0; i < 3; i++) {
            NumberFloat numberFloat = new NumberFloat();
            numberFloat.input(br);

            if (numberFloat.getNumberFloat() < -5 || numberFloat.getNumberFloat() > 5) {
                numberMarker = false;
            }

        }

        if (numberMarker) {
            System.out.println("All Numbers are placing in [-5; 5]");
        } else {
            System.out.println("Some Numbers are not placing in [-5; 5]");
        }
    }
}
