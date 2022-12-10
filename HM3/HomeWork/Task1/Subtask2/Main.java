package HM3.HomeWork.Task1.Subtask2;

public class Main {
    public static void main(String[] args) {
        int firstNumber = 50;
        int secondNumber = 100;
        int thirdNumber = 80;

        if ((firstNumber > secondNumber) && (firstNumber > thirdNumber)) {
            System.out.println("The biggest number is " + firstNumber);
        }
        if ((secondNumber > firstNumber) && (secondNumber > thirdNumber)) {
            System.out.println("The biggest number is " + secondNumber);
        }
        if ((thirdNumber > firstNumber) && (thirdNumber > secondNumber)) {
            System.out.println("The biggest number is " + thirdNumber);
        }

        if ((firstNumber < secondNumber) && (firstNumber < thirdNumber)) {
            System.out.println("\nThe smallest number is " + firstNumber);
        }
        if ((secondNumber < firstNumber) && (secondNumber < thirdNumber)) {
            System.out.println("\nThe smallest number is " + secondNumber);
        }
        if ((thirdNumber < firstNumber) && (thirdNumber < secondNumber)) {
            System.out.println("\nThe smallest number is " + thirdNumber);
        }
    }
}
