import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

class ReadNumber {
    static int readNumber(int start, int end, BufferedReader br) throws Exception {
        int number = parseInt(br.readLine());
        if (number < start || number > end) {
            throw new Exception("Out of range");
        } else {
            return number;
        }
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(ReadNumber.readNumber(10, 20, br));
            } catch (NumberFormatException exception) {
                System.err.println(exception.getMessage());
            } catch (Exception exception) {
                System.err.println(exception.getMessage());
            }
        }
    }
}