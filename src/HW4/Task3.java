package HW4;
/*Enter 5 integer numbers. Find -position of second positive number;
    -minimum and its position in the array.*/
public class Task3 {
    public static void main(String[] args) {
        int [] numbers = {5, -3, 8, 9, 6};
        findPositionOfSecondPositiveNumber(numbers);
        findMinimumAndItsPosition(numbers);
    }

    public static void findMinimumAndItsPosition(int[] numbers) {
        int min = numbers[0];
        int imin = 0;
        int i = 0;
        while (i < numbers.length) {
            if (numbers[i] < min) {
                min = numbers[i];
                imin = i;
            }
            i++;
        }
        System.out.print("Minimum = " + min);
        System.out.println(" is in " + (imin + 1) + " place");
    }

    public static void findPositionOfSecondPositiveNumber(int[] numbers) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > 0) {
                count++;

                if (count == 2) {
                    System.out.println("position of second Positive Number is "+ (i+1));
                }
            }
        }
    }
}
