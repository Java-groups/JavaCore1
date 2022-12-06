import java.io.BufferedReader;
import java.io.IOException;

import static java.lang.Float.parseFloat;
import static java.lang.System.out;

public class RangeChecker {
    public void inputFloat(float[] floatArray, BufferedReader br) throws IOException {
        out.println("Please enter three float: ");
        for (int i = 0; i < floatArray.length; i++) {
            out.print((i + 1) + ": ");
            floatArray[i] = parseFloat(br.readLine());
        }
    }

    public boolean isAllInRange(float[] floatArray, int lowRangeLimit, int highRangeLimit) {
        for (float i : floatArray) {
            if (i < lowRangeLimit || i > highRangeLimit)
                return false;
        }
        return true;
    }
}
