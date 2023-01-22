package HW11;

public class Task1 {


        public static void main(String[] args) {
            double a = 15.3;
            double b = 2.1;

            try {
                System.out.println(div(a, b));
            } catch (NumberFormatException | ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }

         static double div(double a, double b) {
             if (b == 0) {
                 throw new ArithmeticException("Dividing by zero is impossible");
             }
            return a/ b;
    }
    }

