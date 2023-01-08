package HW11_Exceptions.Number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadNumber {

    public int readNumber(int start, int end) throws InputException, InputException2, IOException {
        int newNumber;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input int number: ");
        try {
            newNumber = Integer.parseInt(bufferedReader.readLine());
        } catch (NumberFormatException | IOException e) {
            throw new InputException("Потрибно ціле число, дробове число або текст не задовільняє умову задачі");
        }
        if (start < newNumber && newNumber < end) {
            return newNumber;
        } else {
            throw new InputException2("Нам потрібно число у межах " + start + " до " + end);
        }
    }
}
class InputException extends Exception {
    public InputException(String message) {
        super(message);
    }
}

class InputException2 extends Exception {
    public InputException2(String message) {
        super(message);
    }
}
