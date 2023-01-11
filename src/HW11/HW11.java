package HW11;

import HW11.model.CheckRangeException;

import java.util.*;

public class HW11 {
    public static double div(double a, double b) {
        try {
            if (a <= 0 | b <= 0) {
                throw new Exception("Negative value");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return a / b;
    }

    public static int readNumber(int start, int end) {

        int num = 0;
        String number;
        System.out.println("Enter number to check: ");
        Scanner sc = new Scanner(System.in);
        sc = new Scanner(System.in);

        try {
            number = sc.next();
            num = Integer.parseInt(number);
            if (num > end | num < start) {
                throw new CheckRangeException("False, this number is not in range ");
            } else {
                if (num < end && num > start) {
                    System.out.println("This number in range ");
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("No number entered");

        } catch (CheckRangeException e) {
            System.out.println("This number is not in range ");
        }
        return num;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Start of the first task");
        System.out.println("Enter first number for count div");
        Scanner sc = new Scanner(System.in);
        sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        System.out.println("Enter second number for count div");
        double num2 = sc.nextDouble();
        System.out.println("Result " + div(num1, num2));
        System.out.println("Start of the second task");
        sc = new Scanner(System.in);

        System.out.println("Enter start: ");
        int start = sc.nextInt();
        System.out.println("Enter end: ");
        int end = sc.nextInt();
        System.out.println("Enter 10 numbers [1;100] growing up in order");
        List<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {

            //readNumber(start,end);
            numbers.add(readNumber(start,end));

        }

        //Arrays.sort();
//        int[] numbe = new int[]{1,2,367,23,54 };
//        Arrays.sort(numbe);
//        for (int i = 0; i < numbe.length; i++) {
//            System.out.println(numbe[i]);
//        }
       // System.out.println(numbe);
       // numbers.sort((o1, o2) -> o1 - o2);
//        numbers.sort(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                if (o2 > o1){
//                    return 1;
//                } else if (o2 < o1){
//                    return -1;
//                } else{
//                    return 0;
//                }
//
//            }
//        });
        System.out.println("After sorting: " + numbers);
    }


}

