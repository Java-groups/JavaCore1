package HW11_Exceptions.Dividing;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MainDiv {
    public static void main(String[] args) {
        double c;
        Div div = new Div();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            c = div.dividing(div.getA(), div.getB(), new BufferedReader(new InputStreamReader(System.in)));
            System.out.println("Результат a / b = " + c);
        } catch (DivException e) {
            System.out.println(e.getMessage());
        }

    }
}
