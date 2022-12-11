package HW3;

// read number of HTTP Error (400, 401,402, ...) and write the name of this error (Declare enum HTTPError)

import java.util.Scanner;

public class Task2 {

    public enum HTTPError {
        BAD_REQUEST(400), UNAUTHORIZED(401), PAYMENT_REQUIRED(402), FORBIDDEN(403), NOT_FOUND(404);
        private int codError;

        HTTPError(int error) {
            this.codError = error;
        }

        public int getCodError() {
            return codError;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input number HTTP error (400 - 404): ");
            int errorSc = scanner.nextInt();
            if (errorSc == HTTPError.BAD_REQUEST.getCodError()) {
                System.out.println("Name HTTP error: " + HTTPError.BAD_REQUEST.name());
            } else if (errorSc == HTTPError.UNAUTHORIZED.getCodError()) {
                System.out.println("Name HTTP error: " + HTTPError.UNAUTHORIZED.name());
            } else if (errorSc == HTTPError.PAYMENT_REQUIRED.getCodError()) {
                System.out.println("Name HTTP error: " + HTTPError.PAYMENT_REQUIRED.name());
            } else if (errorSc == HTTPError.FORBIDDEN.getCodError()) {
                System.out.println("Name HTTP error: " + HTTPError.FORBIDDEN.name());
            } else if (errorSc == HTTPError.NOT_FOUND.getCodError()) {
                System.out.println("Name HTTP error: " + HTTPError.NOT_FOUND.name());
            } else {
                System.out.println("Number error not correct. Input number only 400 - 404.");
            }

        }
    }
}
