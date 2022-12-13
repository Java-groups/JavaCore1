package HM4.PracticalTasks.PracticalTask1;

//Task description
//        Create an array of ten integers. Display
//        the biggest of these numbers;
//        the sum of positive numbers in the array;
//        the amount of negative numbers in the array.
//        What values there are more: negative or positive?


public class Main {
    public static void main(String[] args) {
        int[] array = {-1, 5, 6, -8, 1, 9, 7, -2, 6, 9};

        //Biggest number
        int biggestNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > biggestNumber) {
                biggestNumber = array[i];
            }
        }
        System.out.println("The biggest number is " + biggestNumber);

        //sum of positive numbers
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                sum = sum + array[i];
            }
        }
        System.out.println("The sum of positive numbers is " + sum);

        //amount of negative numbers
        int amountNeg = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                amountNeg++;
            }
        }
        System.out.println("The amount of negative numbers is " + amountNeg);

        //values comparison
        int amountPos = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                amountPos++;
            }
        }
        if (amountPos > amountNeg) {
            System.out.println("There are more positive values than negative");
        }
        else {System.out.println("There are more negative values than positive");}
    }
}
