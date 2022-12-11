package edu.homeworks.homework4.practicalTask;

import java.util.Random;

public class Array {
    public int[] array = new int[10];
    Random random = new Random();

    public int randomNumbers(){
        for (int i=0;i<array.length;i++){
            array[i] = random.nextInt(-15,15);
        }
        return 0;
    }

    public void biggestNumber(){
        int max = array[0];
        int imax = 0;
        int i = 0;

        while (i < array.length) {
            System.out.println("Numbers = " + array[i]);
            if (array[i] > max) {
                max = array[i];
                imax = i;
            }
            i++;
        }
        System.out.println("Your biggest number is " + max +" in a row " + (imax+1));
    }

    public void sumNumbers(){
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            System.out.println("Numbers = " + array[i]);
            if(array[i]>0){
                sum += array[i];
            }
        }
    }

    public void amountNegativeNumbers(){
        int amount = 0;
        for (int a : array) {
            if (a < 0) {
                amount++;
            }
        }
        System.out.println("Amount = " + amount);

    }
}
