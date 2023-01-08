public class Calc {
    static double div(double one, double two) {
        if (two == 0) throw new ArithmeticException("Dividing by zero");
        return one/two;
    }
}
