package HM3.HomeWork.Task1.Subtask1;

public class Main {
    public static void main(String[] args) {
        float firstNumber = 5.5F;
        float secondNumber = 32.8F;
        float thirdNumber = 8.1F;

        if ((firstNumber > -5 && firstNumber < 5) && (secondNumber > -5 && secondNumber < 5) && (thirdNumber > -5 && thirdNumber < 5)) {
            System.out.println("All three numbers belong to the range [-5; 5]");
        }
        else {
            System.out.println("All three numbers don't belong to the range [-5; 5]");
        }
    }
}
