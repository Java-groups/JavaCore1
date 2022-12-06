import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        out.println("Check is float in range");
        float[] floatArray = new float[3];
        RangeChecker rc = new RangeChecker();
        rc.inputFloat(floatArray, br);
        boolean isAllFloatInRange = rc.isAllInRange(floatArray, -5, 5);
        out.println(isAllFloatInRange);

        out.println("Find min max integer");
        int[] intArray = new int[3];
        MinMaxFinder finder = new MinMaxFinder();
        finder.inputInteger(intArray, br);
        out.println(finder.minMaxFinder(intArray));
    }
}