package com.edu.hometask11.task1;
/*1. Create method div(), which calculates the dividing of two double numbers. In main
        method input 2 double numbers and call this method. Catch all exceptions.
 */
public class DividerStarter {

    public static void main(String[] args) {
        Divider divider = new Divider();


        if (divider.getSecondNumber() == 0) {
            throw new ArithmeticException();
        }

        try {
            double c = Divider.div(divider.getFirstNumber(), divider.getSecondNumber());
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());

        }
    }
}
