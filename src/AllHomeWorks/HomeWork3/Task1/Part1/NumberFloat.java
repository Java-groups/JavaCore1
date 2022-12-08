package AllHomeWorks.HomeWork3.Task1.Part1;

import java.io.BufferedReader;
import java.io.IOException;

public class NumberFloat {
    private float numberFloat;

    public void setNumberFloat(float numberFloat) {
        this.numberFloat = numberFloat;
    }

    public float getNumberFloat() {
        return numberFloat;
    }

    public void input(BufferedReader br) throws IOException {
        System.out.println("Enter Float Number:");
        float numberFloat = 0;
        boolean enteredFloat = false;

        try {
            numberFloat = Float.parseFloat(br.readLine());
            enteredFloat = true;
        } catch (NumberFormatException e) {
        }
        while (!enteredFloat) {
            System.out.println("Please input right float number!");
            try {
                numberFloat = Float.parseFloat(br.readLine());
                enteredFloat = true;
            } catch (NumberFormatException e) {
            }
        }

        this.setNumberFloat(numberFloat);
    }
}