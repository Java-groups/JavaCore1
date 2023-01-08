import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Double.parseDouble;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            double one = parseDouble(br.readLine());
            double two = parseDouble(br.readLine());
            System.out.println(Calc.div(one, two));
        } catch (ArithmeticException exception) {
            System.err.println(exception.getMessage());
        } catch (NumberFormatException exception) {
            System.err.println(exception.getMessage());
        } catch (Exception exception) {
            System.err.println(exception.getMessage());
        }
    }
}