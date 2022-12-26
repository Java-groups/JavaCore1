package com.softserve.hw4.Car2;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        CarService cs = new CarService();
        cs.inputCarInfo();
        cs.outputCarInfo();
    }
}
