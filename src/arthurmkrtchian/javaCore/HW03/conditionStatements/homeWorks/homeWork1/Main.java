package arthurmkrtchian.javaCore.HW03.conditionStatements.homeWorks.homeWork1;

import helper.Reader;

import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException {

        float[] floats = new float[3];
        int[] integers = new int[3];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        Reader reader = new Reader();

        for (int i = 0; i < floats.length; i++) {
            System.out.println("Enter FLOAT number:");
            floats[i] = reader.readFloat("Entered value is not float, please try again:");
            if (floats[i] < -5 || floats[i] > 5) {
                System.out.printf("value %s is not belong to the range [-5,5]\n", floats[i]);
            }
        }
        System.out.println("----------------------------------------------------------------------------->");
        System.out.println("Good job! Let`s make another one.\nNow you need to enter three integers.");
        for (int i = 0; i < integers.length; i++) {
            System.out.println("Enter INTEGER:");
            integers[i] = reader.readInteger("Entered value is not integer, please try again:");

            if (integers[i] > max) {
                max = integers[i];
            }
            if (integers[i] < min){
                min = integers[i];
            }
        }

        System.out.printf("Max value is: %s\n", max);
        System.out.printf("Min value is: %s\n", min);

        System.out.println("----------------------------------------------------------------------------->");
        System.out.println("Here we go again. Lest`s see what means different HTTPError codes.\n" +
                "Enter a number from range [400:409]:");
        int errorCode = reader.readFromRange("Wrong input. Please try again.",400,405);

        HTTPError httpError;
        switch (errorCode){
            case 400:
                httpError = HTTPError.BAD_REQUEST;
                break;
            case 401:
                httpError = HTTPError.UNAUTHORIZED;
                break;
            case 402:
                httpError = HTTPError.PAYMENT_REQUIRED;
                break;
            case 403:
                httpError = HTTPError.FORBIDDEN;
                break;
            case 404:
                httpError = HTTPError.NOT_FOUND;
                break;
            case 405:
                httpError = HTTPError.METHOD_NOT_ALLOWED;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + errorCode); //сама IDE підказала.
        }
        System.out.println(httpError.getErrorName());

    }
}
