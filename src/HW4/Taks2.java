package HW4;

public class Taks2 {
    public static void main(String[] args) {
        int[] elements = {1, -2, 3, -4, 5, -1, 2, -2, 2, -1};
        int result = 0;
        for (int i = 0; i < 5; i++) {
            if (elements[i] > 0) {
            result += elements[i];
            }
            if (elements[i] < 0) {
                result = 1;
                for (i = 5; i < elements.length;i++) {
                    result *= elements[i];
                }

            }
        }
        System.out.println("result is " + result);




    }
}
