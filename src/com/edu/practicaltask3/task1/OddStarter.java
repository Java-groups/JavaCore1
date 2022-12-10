package com.edu.practicaltask3.task1;

import java.util.Scanner;


public class OddStarter {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        OddFinding numberCreation = new OddFinding();

        numberCreation.inputScanner(sc);
        numberCreation.checkForOdd();


    }
}
