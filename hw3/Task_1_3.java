package hw3;

import java.util.Scanner;

public class Task_1_3 {
    enum HttpError {
        BAD_REQUEST(400),
        UNAUTHORIZED(401),
        NOT_FOUND(404),
        I_AM_A_TEAPOT(418),
        UNKNOWN(0);

        private final int errorCode;

        HttpError(int errorCode) {
            this.errorCode = errorCode;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter HTTP error code: ");
        int errorCode = sc.nextInt();

        HttpError httpError = switch (errorCode) {
            case 400 -> HttpError.BAD_REQUEST;
            case 401 -> HttpError.UNAUTHORIZED;
            case 404 -> HttpError.NOT_FOUND;
            case 418 -> HttpError.I_AM_A_TEAPOT;
            default -> HttpError.UNKNOWN;
        };

        System.out.println("Error name is: " + httpError);
    }
}
