package com.edu.hometask3.numbers;

import java.util.Scanner;

import com.edu.hometask3.numbers.MinMax;

public class MinMaxStarter {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        MinMax checkMinMax = new MinMax();
        checkMinMax.inputScanner(scan);
        checkMinMax.checkForMin();
        checkMinMax.checkForMax();
    }


}
