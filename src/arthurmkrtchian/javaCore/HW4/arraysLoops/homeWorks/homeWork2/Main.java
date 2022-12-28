package arthurmkrtchian.javaCore.HW4.arraysLoops.homeWorks.homeWork2;

//          Enter 10 integer numbers. Calculate the sum of first 5 elements if they are positive or
//          product of last 5 element in the other case.
public class Main {


    public static void main(String[] args) {
        //int[] array = {12, 46, 91, 1, 13, 78, 203, -67, 8, 10};
        int[] array = {12, 46, -91, 1, -13, 78, 203, 67, 8, 10};

        Result result = calculate(array);
        if(result.getType() == Result.Type.SUM){
            System.out.println("Sum of first five elements is: " + result.getValue());
        } else{
            System.out.println("Product of last five elements is: " + result.getValue());
        }
    }

    public static Result calculate(int[] array){
        boolean isPositive= true;
        int sum= 0;
        int product = 1;

        for (int i = 0; i < 5; i++) {
            if (array[i] > 0) {
                sum += array[i];
            } else {
                isPositive = false;
                for (int j = 5; j < array.length; j++) {
                    product = product * array[j];
                }
                break;
            }
        }

        if (isPositive){
            return new Result(sum, Result.Type.SUM);
        }
        return new Result(product, Result.Type.PRODUCT);
    }
}
