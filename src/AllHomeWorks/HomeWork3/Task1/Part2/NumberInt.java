package AllHomeWorks.HomeWork3.Task1.Part2;

import Helper.InputHelper;

import java.io.BufferedReader;
import java.io.IOException;

public class NumberInt {
    private int numberInt;

    public void setNumberInt(int numberInt) {
        this.numberInt = numberInt;
    }
    public int getNumberInt() {
        return numberInt;
    }

    public void input(BufferedReader br) throws IOException {
        System.out.println("Enter Integer Number:");
        this.setNumberInt(InputHelper.inputInteger(br));
    }
}
