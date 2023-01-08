package HM11.HomeWorkTask1;

public class Main {
    static double div(double num1, double num2) {
        return num1 / num2;
    }

    public static void main(String[] args) {
        double number1 = 5.456;
        double number2 = 2.456;

        try {
            System.out.println(div(number1, number2));
        } catch (NumberFormatException | ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
