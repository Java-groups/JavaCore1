package AllHomeWorks.HomeWork3.Task1.Part2;

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
        int numberInt = 0;
        boolean enteredInt = false;

        try {
            numberInt = Integer.parseInt(br.readLine());
            enteredInt = true;
        } catch (NumberFormatException e) {
        }
        while (!enteredInt) {
            System.out.println("Please input right float number!");
            try {
                numberInt = Integer.parseInt(br.readLine());
                enteredInt = true;
            } catch (NumberFormatException e) {
            }
        }

        this.setNumberInt(numberInt);
    }
}
