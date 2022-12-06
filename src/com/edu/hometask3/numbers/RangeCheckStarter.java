package com.edu.hometask3.numbers;

import com.edu.hometask2.person.Person;

import java.util.Scanner;

public class RangeCheckStarter {

    public static void main(String[] args) throws Exception {


        Scanner sc = new Scanner(System.in);

        RangeCheck check = new RangeCheck();
        check.input(sc);
        check.checkForRange();


    }
}

