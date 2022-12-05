package HW3;

public class Task2 {
    public static void main(String[] args) {
        int a = 25;
        int b = 2;
        int c = -54;
        int maxNumber = 0;
        int minNumber = 0;
        if (a<b && a<c) {
            minNumber = a;
        } else if (b<c) {
            minNumber = b;
            } else  {
            minNumber = c;
        }
        System.out.println("minimum number is " + minNumber);

        if (a>b && a>c) {
            maxNumber = a;
        } else if (b>c) {
            maxNumber = b;
        } else  {
            maxNumber = c;
        }
        System.out.println("maximum number is " + maxNumber);

    }

    }

