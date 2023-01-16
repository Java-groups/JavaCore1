package arthurmkrtchian.javaCore.HW04.arraysLoops.practicalTasks.practicalTask1;

public class Main {


//   Create an array of ten integers. Display
//       - the biggest of these numbers;
//       - the sum of positive numbers in the array;
//       - the amount of negative numbers in the array.
//   What values there are more: negative or positive?


        static String line = ("--------------------------------------------------------------\n");

        static int getMaxValue(int[] array){
            int max = array[0];
            for (int i = 0; i < array.length; i++) {
                if (array[i] > max) { max = array[i];}
            }
            return max;
        }

        static int getSumOfPositives(int[] array){
            int sumOfPositive = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] > 0){sumOfPositive += array[i];}
            }
            return sumOfPositive;
        }

        static int getAmountOfNegatives(int[] array){
            int amount = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] < 0){ amount++; }
            }
            return amount;
        }

        static String getMoreNumbers(int[] array){
            int amountOfNegative = getAmountOfNegatives(array);
            if ((array.length - amountOfNegative) > (array.length / 2)){
                return "positive";
            }
                return "negative";
        }

        public static void main(String[] args) {
            int[] array = { -3, 14, 45, 4, 11, -27, 54, 6, 73, 92};

            System.out.println(line+"\tThe biggest number in the array is: " + getMaxValue(array));
            System.out.println(line+"\tThe sum of positive numbers in the array is: " + getSumOfPositives(array));
            System.out.println(line+"\tThe amount of negative numbers in the array is: " + getAmountOfNegatives(array));
            System.out.printf(line+"\tArray contains more %s numbers\n%s", getMoreNumbers(array), line);

        }

}
