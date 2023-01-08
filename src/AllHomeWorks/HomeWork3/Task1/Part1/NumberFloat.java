package AllHomeWorks.HomeWork3.Task1.Part1;

import Helper.InputHelper;

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
        this.setNumberFloat(InputHelper.inputFloat(br));
    }
}