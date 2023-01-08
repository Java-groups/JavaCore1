package AllHomeWorks.HomeWork3Practical.Task1;

import Helper.InputHelper;

import java.io.BufferedReader;
import java.io.IOException;

public class Number {
    private int number;

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

    public void input(BufferedReader br) throws IOException {
        System.out.println("Enter Number:");
        int number = InputHelper.inputInteger(br);
        this.setNumber(number);
    }

    public boolean numberOdd(){
        return (this.number%2) ==1;
    }
}