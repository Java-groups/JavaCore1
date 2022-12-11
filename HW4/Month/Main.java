import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        out.print("Please enter number of month: ");
        out.println("Amount of days: "+Month.getAmountOfDays(parseInt(br.readLine())));
    }
}