package AllHomeWorks.HomeWork3Practical.Task1;

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
        int number = 0;

        try {
            number = Integer.parseInt(br.readLine());
        } catch (NumberFormatException e) {

        }

        while (number == 0) {
            System.out.println("Number:" +number);
            System.out.println("Please input number!");
            try {
                number = Integer.parseInt(br.readLine());
            } catch (NumberFormatException e) {

            }
        }
        this.setNumber(number);
    }

    public boolean numberOdd(){
        return (this.number%2) ==1;
    }
}