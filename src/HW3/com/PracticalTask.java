package HW3.com;

import HW3.com.model.DayOfWeek;
import HW3.com.model.Product;

import java.util.Scanner;

public class PracticalTask {
    public static void main(String[] args) {
        System.out.println("Перше практичне завдання: ");
        System.out.println("Enter first number:");
        Scanner sc = new Scanner(System.in);
        sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();
        System.out.println("Enter second number:");

        sc = new Scanner(System.in);
        int secondNumber = sc.nextInt();
        System.out.println("Enter third number:");

        sc = new Scanner(System.in);
        int thirdNumber = sc.nextInt();
        int count = 0;
        if (firstNumber % 2 != 0) {
            count++;
        }
        if (secondNumber % 2 != 0) {
            count++;
        }
        if (thirdNumber % 2 != 0) {
            count++;
        }
        System.out.println("Кількість непарних чисел = " + count);
        System.out.println("Друге практичне завдання: ");
        System.out.println("Введіть число дня тижня:");
        Scanner scDay = new Scanner(System.in);
        sc = new Scanner(System.in);
        int numberDay = sc.nextInt();
        switch (numberDay) {
            case 1:
                DayOfWeek day = DayOfWeek.MONDAY;
                System.out.println(day.toString());
                break;
            case 2:
                DayOfWeek day2 = DayOfWeek.TUESDAY;
                System.out.println(day2.toString());
                break;
            case 3:
                DayOfWeek day3 = DayOfWeek.WEDNESDAY;
                System.out.println(day3.toString());
                break;
            case 4:
                DayOfWeek day4 = DayOfWeek.THURSDAY;
                System.out.println(day4.toString());
                break;
            case 5:
                DayOfWeek day5 = DayOfWeek.FRIDAY;
                System.out.println(day5.toString());
                break;
            case 6:
                DayOfWeek day6 = DayOfWeek.SATURDAY;
                System.out.println(day6.toString());
                break;
            case 7:
                DayOfWeek day7 = DayOfWeek.SUNDAY;
                System.out.println(day7.toString());
                break;
            default:
                System.out.println("No this month)");


        }
        System.out.println("Третє практичне завдання: ");
        System.out.println("Введіть назву країни:");
        Scanner scCountry = new Scanner(System.in);
        sc = new Scanner(System.in);
        String Country = sc.next();
        enum Continents {
            ASIA, EUROPE, AFRICA, SOUTH_AMERICA;
        }
        switch (Country) {
            case "Nigeria":
                Continents c1 = Continents.AFRICA;
                System.out.println(c1);
                break;
            case "China", "Japan", "Korea":
                Continents c2 = Continents.ASIA;
                System.out.println(c2);
                break;
            case "Ukraine", "France", "Germany":
                Continents c3 = Continents.EUROPE;
                System.out.println(c3);
                break;
            case "Chili", "Argentina":
                Continents c4 = Continents.SOUTH_AMERICA;
                System.out.println(c4);
                break;

            default:
                System.out.println("Enter the country");
        }
        System.out.println("Четверте практичне завдання: ");
        Product product1 = new Product("Milk", 35,2);
        Product product2 = new Product("Bread", 5,3);
        Product product3 = new Product("Soap", 29,8);
        Product product4 = new Product("Pasta", 50,1);
        Product minProduct = new Product();
        minProduct = product1;

        if(minProduct.getPrice()>product2.getPrice()){
            minProduct = product2;
        }
        if(minProduct.getPrice()>product3.getPrice()){
            minProduct = product3;
        }
        if(minProduct.getPrice()>product4.getPrice()){
            minProduct = product4;
        }
        System.out.println(minProduct.toString());


        Product maxProduct = new Product();
        maxProduct = product1;
        if(maxProduct.getQuantity()<product2.getQuantity()){
            maxProduct = product2;
        }
        if(maxProduct.getQuantity()<product3.getQuantity()){
            maxProduct = product3;
        }
        if(minProduct.getQuantity()<product4.getQuantity()){
            maxProduct = product4;
        }
        System.out.println(maxProduct.toString());



//        Product array[] = new Product[4];
//        array[0] = product1;
//        array[1] = product2;
//        array[2] = product3;
//        array[3] = product4;
//
//        minProduct = array[0];
//        for (int i = 1; i < array.length ; i++) {
//            if (minProduct.getPrice() > array[i].getPrice()){
//                minProduct = array[i];
//            }
//         }
     }
}

