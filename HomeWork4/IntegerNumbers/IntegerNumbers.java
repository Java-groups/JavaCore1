package edu.homeworks.hw4.IntegerNumbers;
import java.util.Scanner;


public class IntegerNumbers {
    private int staticNum;
    private int result;
    private int resultPositive = 1;
    private int sum = 1;
    public int numberMin;

    public int getNumberMin() {
        return numberMin;
    }

    public void setNumberMin(int numberMin) {
        this.numberMin = numberMin;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    IntegerNumbers(){

    }
    public void CalculateNumbers(Scanner input) {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter numbers:");
            staticNum = input.nextInt();
            if (staticNum > 0) {
                numbers[i] = staticNum;
                if (i < 5) {
                        result = result + numbers[i];
                    }
                }

            }
        System.out.println("Result first 5 integer numbers" + result);
        for(int j = 5;j<numbers.length;j++){
            resultPositive = resultPositive + numbers[j];
        }
        System.out.println("Sum the remaining five numbers " + resultPositive);
    }

    public void SortNumbers(Scanner input) {
        int[] numbers = new int[10];
        int indexMin = 0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter numbers:");
            staticNum = input.nextInt();
            numberMin = numbers[0];
            numbers[i] = staticNum;
        }
        for (int i=0;i<numbers.length;i++){
            if(numbers[i]<numberMin){
                numberMin = numbers[i];
                indexMin = i;
            }
            if(numbers[i]%2==0){
                sum = sum * numbers[i];
            }
        }
        System.out.println("Your min number " + numberMin + " index " + indexMin);
        System.out.println("Your multiply numbers " + sum);
    }
}


