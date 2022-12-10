package HM3.HomeWork.Task1.Subtask3;

import java.util.Scanner;

public class Main {
    public enum HTTPError {
        Bad_Request, Unauthorized, Payment_Required
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the Error code");
        int enteredError = sc.nextInt();

        if (enteredError == 400) {
            System.out.println(HTTPError.Bad_Request);
        }
        if (enteredError == 401) {
            System.out.println(HTTPError.Unauthorized);
        }
        if (enteredError == 402) {
            System.out.println(HTTPError.Payment_Required);
        }
    }
}
