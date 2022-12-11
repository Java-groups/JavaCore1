import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        out.print("Please enter the length of array: ");
        int length = parseInt(br.readLine());
        ArrayOfInteger arrayOfInteger = new ArrayOfInteger(length);
        arrayOfInteger.fillArray(br);
        out.println("The product of all even numbers is: "+arrayOfInteger.productOfAllEvenEntered());
        out.println("The second positive number is on "+arrayOfInteger.findSecondPositivePosition()+" position");
        int[] responseMin = arrayOfInteger.findMinAndItsPosition();
        out.println("Minimum is "+responseMin[0]+" and it is on "+responseMin[1]+" position");
        int[] responseSumOrProd = arrayOfInteger.sumOrProduct();
        out.println((responseSumOrProd[0] < 0 ? "Sum ":"Product ")+responseSumOrProd[1]);
    }
}