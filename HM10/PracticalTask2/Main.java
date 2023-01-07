package HM10.PracticalTask2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter surname, name and patronymic divided by comma (without spaces)");
        String enteredValue = sc.next();
//      Kukliak,Roman,Stepanovych

        String[] arr = enteredValue.split(",");

        System.out.println(arr[0] + " " + arr[1].substring(0, 1) + "." + arr[2].substring(0, 1) + ".");
        System.out.println(arr[1]);
        System.out.println(arr[1] + " " + arr[2] + " " + arr[0]);
    }
}
