package com.edu.hometask3.numbers;

import java.util.Scanner;

public class ErrorsStarter {
    static String errorCode;

    public static void main(String[] args) {

        System.out.println("Please, input error`s code: ");

        Scanner sc = new Scanner(System.in);
        errorCode = sc.nextLine();

        switch (errorCode) {

            case "400":
                System.out.println("This code is for " + ErrorsStore.BAD_REQUEST);
                break;
            case "401":
                System.out.println("This code is for " + ErrorsStore.UNAUTHORIZED);
                break;
            case "402":
                System.out.println("This code is for " + ErrorsStore.PAYMENT);
                break;
            case "403":
                System.out.println("This code is for " + ErrorsStore.FORBIDDEN);
                break;

            default:
                System.out.println("Unknown error code");

        }

    }

}


