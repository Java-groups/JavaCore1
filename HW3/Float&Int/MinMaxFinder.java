import java.io.BufferedReader;
import java.io.IOException;

import static java.lang.Integer.parseInt;
import static java.lang.System.out;

public class MinMaxFinder {
    public MinMaxFinder() {
    }

    public void inputInteger(int[] intArray, BufferedReader br) throws IOException {
        out.println("Please enter three integer: ");
        for (int i = 0; i < intArray.length; i++) {
            out.print((i + 1) + ": ");
            intArray[i] = parseInt(br.readLine());
        }
    }

    public String minMaxFinder(int[] intArray) {
        int[] minMaxArray = new int[2];
        minMaxArray[0] = intArray[0];
        minMaxArray[1] = intArray[0];
        for (int i = 1; i < intArray.length; i++) {
            if (minMaxArray[0] > intArray[i]) {
                minMaxArray[0] = intArray[i];
                continue;
            }
            if (minMaxArray[1] < intArray[i]) {
                minMaxArray[1] = intArray[i];
            }
        }
        return "min: " + minMaxArray[0] + " max: " + minMaxArray[1];
    }
}
