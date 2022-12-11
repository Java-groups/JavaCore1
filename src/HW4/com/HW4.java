package HW4.com;

import HW4.com.model.Car;

import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        System.out.println("Start of first task");
        int[] monthsDay = {31,28,31,30,31,30,31,31,30,31,30,31};
        Scanner sc = new Scanner(System.in);
        sc = new Scanner(System.in);
        System.out.println("Enter number of month");
        int month = sc.nextInt();
        int day = monthsDay[month-1];
        System.out.println("Кількість днів у цьому місяці - " + day);
        System.out.println("Start of second task");
        int[] digits = new int[10];

        int sum = 0;
        HW4 hw4 = new HW4();
        sum = hw4.secondTask(digits);

        for (int i = 0; i < digits.length; i++) {
            System.out.println("Введіть цифру " + i);
            digits[i] = sc.nextInt();
        }


        System.out.println("Сума = " + sum);
        System.out.println("Start of third task");
        int[] digitsTwo = new int[5];
        int minimum = 0;
        int count = 0;
        int minPosition = 0;
        int countEvenNumber = 0;
        for (int i = 0; i < digitsTwo.length; i++) {
            System.out.println("Введіть цифру " + i);
            digitsTwo[i] = sc.nextInt();
        }
        minimum = digitsTwo[0];
        for (int i = 0; i < digitsTwo.length; i++) {
            if(minimum>digitsTwo[i]){
                minimum = digitsTwo[i];
                minPosition = i;
            }
            if(digitsTwo[i]>0){
                count++;
            }
            if(count == 2){
                System.out.println( "Позиція другого позитивного числа " + i);
            }
            if(digitsTwo[i] % 2 == 0){
                countEvenNumber++;
            }

        }
        System.out.println( "Мінімум- " + minimum + " " + "та  його індекс- " + minPosition );
        System.out.println("Кількість парних чисел " + countEvenNumber);
        System.out.println("Start of fourth task ");
        Car car1 = new Car("Audi", 1995, (float) 1.8);
        Car car2 = new Car("Slavuta", 1985, (float) 1.2);
        Car car3 = new Car("Mersedes-Benz", 2022, (float) 3.8);
        Car car4 = new Car("Lamborgini", 2020, (float) 4.8);
        Car[] car = new Car[4];
        car[0] = car1;
        car[1] = car2;
        car[2] = car3;
        car[3] = car4;
        Car temp = new Car();
        System.out.println("Enter year of production");
        int year = sc.nextInt();
        for (int i = 0; i < car.length; i++) {
            if (car[i].getYear() == year) {
                System.out.println(car[i].toString());
            }
        }
        for (int i = 0; i < car.length - 1; i++)
            for (int j = 0; j < car.length - i - 1; j++)
                if (car[j].getYear() < car[j + 1].getYear()) {
                    temp = car[j];
                    car[j] = car[j + 1];
                    car[j + 1] = temp;
                }
        System.out.println("----------------------------------");
        for (int i = 0; i < car.length; i++) {
            System.out.println(car[i]);
        }





    }

    public int secondTask(int[] digits){
        int sum = 0;
        boolean isPositive = true;
        for (int i = 0; i < digits.length ; i++) {
            if(i >= 0 && i < 5 && isPositive){
                if(digits[i]<0){
                    isPositive = false;
                    sum = 0;
                }
                sum = sum + digits[i];

            }
            if(i>= 4 && i<10 && !isPositive){
                sum = sum + digits[i];
            }
        }
        return sum;
    }
}
