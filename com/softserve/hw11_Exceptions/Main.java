package com.softserve.hw11_Exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        Service service = new Service();
        System.out.println("Input 2 double numbers: ");
        service.setNum1(Double.parseDouble(input.readLine()));
        service.setNum2(Double.parseDouble(input.readLine()));
        System.out.println("Result of divide: ");
        System.out.println(service.div());

        System.out.println("Input 10 numbers: ");
        int[] array = new int[10];
        for (int i = 0; i < service.getRangeNumberArray().length; i++) {
            array[i] = Integer.parseInt(input.readLine());
        }
        service.setRangeNumberArray(array);
        System.out.println("Input range: ");
        System.out.println(service.readNumber(Integer.parseInt(input.readLine()), Integer.parseInt(input.readLine())));
    }

}
