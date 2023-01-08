package HW11_Exceptions.Dividing;

import java.io.BufferedReader;
import java.io.IOException;

public class Div {

    private double a;
    private double b;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double dividing(double a, double b, BufferedReader bufferedReader) throws DivException {

        int count = 0;
        while (count == 0) {
            try {
                System.out.print("Input a = ");
                setA(Double.parseDouble(bufferedReader.readLine()));
                count++;
            } catch (IOException | NumberFormatException e) {
                System.out.println("Текст - то не чісло. " + e.getMessage());
            }
        }

        count = 0;
        while (count == 0) {
            try {
                System.out.print("Input b = ");
                setB(Double.parseDouble(bufferedReader.readLine()));
                count++;
            } catch (IOException | NumberFormatException e) {
                System.out.println("Текст - то не чісло. " + e.getMessage());
            }
        }

        if (getB() == 0.0) {
            throw new DivException("Любі мої, маємо Ділення на 0!!!");
        } else {
            return getA() / getB();
        }
    }
}

class DivException extends Exception {
    public DivException(String message) {
        super("Помилка: " + message);
    }
}
