package HW4;
/* Enter 10 integer numbers.
 Calculate the sum of first 5 elements if they are positive or product of last 5 element in the other case.
 */
public class Task2 {
    public static void main(String[] args) {


        int [] numbers = {5, 10, -4, 11, 2, 3, 2, 8, 6, 1};

        int sum = 0;
        int prod = 1;
        int count= 0;
        for (int i = 0; i < 5; i++) {

            if (numbers[i]>0) {
                count++;
                sum = sum + numbers[i];
            }
            else {
                for (i = 5; i < numbers.length; i++) {
                    prod = prod* numbers[i];
                }
                System.out.println("Product of 5 last numbers: " + prod);
            }

            if (count == 5) {
                System.out.println("Sum of 5 first numbers =  " + sum);
            }

        }

    }
}
