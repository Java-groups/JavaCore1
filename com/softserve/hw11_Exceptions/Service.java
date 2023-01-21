package com.softserve.hw11_Exceptions;

public class Service {

    private double num1;
    private double num2;
    private double div;
    private int[] rangeNumberArray = new int[10];

    public int[] getRangeNumberArray() {
        return rangeNumberArray;
    }

    public void setRangeNumberArray(int[] rangeNumberArray) {
        this.rangeNumberArray = rangeNumberArray;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getDiv() {
        return div;
    }

    public void setDiv(double div) {
        this.div = div;
    }

    public Double div() {
        try {
            div = num1 / num2;
        } catch (Exception e) {
            System.out.println("You can't divide on 0 and input strings!");
        }
        return div;
    }

    public Integer readNumber(int start, int end) {
        try {
            for (int i = 0; i < rangeNumberArray.length; i++) {
                if (rangeNumberArray[i] > start && rangeNumberArray[i] < end) {
                    System.out.println(rangeNumberArray[i]);
                }
            }

        } catch (Exception e) {
            System.out.println("Number is not in range of: " + start + " - " + end);
        }
        throw new ArithmeticException("Number is out of range");
    }
}
