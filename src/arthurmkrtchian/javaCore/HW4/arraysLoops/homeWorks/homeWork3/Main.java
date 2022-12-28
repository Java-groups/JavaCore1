package arthurmkrtchian.javaCore.HW4.arraysLoops.homeWorks.homeWork3;


//      Enter 5 integer numbers. Find
//        • position of second positive number;
//        • minimum and its position in the array.
//      Count the product of all entered even numbers.

public class Main {

    public static ArrayElement getSecondPositive(int[] array){
        int temp = 0;
        ArrayElement secondPositive = new ArrayElement();

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0){
                temp++;
            }
            if (temp == 2){
                secondPositive.setValue(array[i]);
                secondPositive.setPosition(i);
                break;
            }
        }
        return secondPositive;
    }

    public static ArrayElement getMinimum(int[] array) {
        ArrayElement minimumPosition = new ArrayElement();

        for (int i = 1; i < array.length; i++) {
            if (minimumPosition.getValue() > array[i]) {
                minimumPosition.setPosition(i);
                minimumPosition.setValue(array[i]);
            }
        }
        return minimumPosition;
    }

    public static int getEvensProduct(int[] array){
        int result = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0){
                result = result * array[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int[] array = {54, -2, -24, 7, 11};

        ArrayElement secondPositive = getSecondPositive(array);
        ArrayElement minimumPosition = getMinimum(array);


        Main.getSecondPositive(array);
        System.out.printf("Second positive number value is %s and it`s position in array is %s\n",
                secondPositive.getValue(),
                secondPositive.getPosition() + 1
        );

        Main.getMinimum(array);
        System.out.printf("Minimum value in the array is %s and it`s position is %s\n",
                minimumPosition.getValue(),
                minimumPosition.getPosition() + 1
        );

        System.out.println("The product of all even numbers is " + getEvensProduct(array));
    }


}
