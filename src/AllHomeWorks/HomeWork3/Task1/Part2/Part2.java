package AllHomeWorks.HomeWork3.Task1.Part2;

import java.io.BufferedReader;
import java.io.IOException;

public class Part2 {
    public static void doTask(BufferedReader br) throws IOException {
        NumberInt numberMax = null;
        NumberInt numberMin = null;

        for (int i = 0; i < 3; i++) {
            System.out.println("--------------------------------------------");

            NumberInt numberInt = new NumberInt();
            numberInt.input(br);

            if ((numberMax == null) || (numberInt.getNumberInt() > numberMax.getNumberInt())) {
                numberMax = numberInt;
            }

            if (numberMin == null || numberInt.getNumberInt() < numberMin.getNumberInt()) {
                numberMin = numberInt;

            }

        }
        System.out.println("Max number is : " +numberMax.getNumberInt());
        System.out.println("Min number is : " +numberMin.getNumberInt());

    }
}
