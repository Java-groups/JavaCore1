import java.io.BufferedReader;
import java.io.IOException;

import static java.lang.Integer.parseInt;
import static java.lang.System.out;

public class ArrayOfInteger {
    int[] arrayOfInteger;

    public ArrayOfInteger(int amountOfNumbers) {
        this.arrayOfInteger = new int[amountOfNumbers];
    }

    public void setArrayOfInteger(int[] arrayOfInteger) {
        this.arrayOfInteger = arrayOfInteger;
    }

    public void fillArray(BufferedReader br) throws IOException {
        out.println("Please enter " + arrayOfInteger.length + " integer: ");
        int[] tmp = new int[arrayOfInteger.length];
        for (int i = 0; i < arrayOfInteger.length; i++) {
            tmp[i] = parseInt(br.readLine());
        }
        setArrayOfInteger(tmp);
    }

    public int findSecondPositivePosition() {
        for (int i = 0; i < arrayOfInteger.length; i++) {
            if (arrayOfInteger[i] > 0) {
                for (int j = i + 1; j < arrayOfInteger.length; j++) {
                    if (arrayOfInteger[j] > 0) {
                        return j + 1;
                    }
                }
            }
        }
        return 0;
    }

    public int[] findMinAndItsPosition() {
        int min = arrayOfInteger[0];
        int index = 0;
        for (int i = 1; i < arrayOfInteger.length; i++) {
            if (arrayOfInteger[i] < min) {
                min = arrayOfInteger[i];
                index = i;
            }
        }
        return new int[]{min, index + 1};
    }

    public int productOfAllEvenEntered() {
        int product = 1;
        for (int i = 0; i < arrayOfInteger.length; i++) {
            if (arrayOfInteger[i] != 0 && arrayOfInteger[i] % 2 == 0) {
                product *= arrayOfInteger[i];
            }
        }
        return product == 1 ? 0 : product;
    }

    public int[] sumOrProduct() {
        int sumOrProduct = 0;
        for (int i = 0; i < 5; i++) {
            if (arrayOfInteger[i] > 0) {
                sumOrProduct += arrayOfInteger[i];
            } else {
                sumOrProduct = 1;
                for (int j = arrayOfInteger.length - 1; j > arrayOfInteger.length - 5; j--) {
                    sumOrProduct *= arrayOfInteger[j];
                }
                return new int[]{1, sumOrProduct};
            }
        }
        return new int[]{-1, sumOrProduct};
    }
}
