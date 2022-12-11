package HW3.com;

import HW3.com.model.Breed;
import HW3.com.model.Dog;
import HW3.com.model.HTTPError;

import java.util.Scanner;

public class HW3 {

    public  static void main(String[] args) {
        System.out.println("Enter first float number:");
        Scanner sc = new Scanner(System.in);


        sc = new Scanner(System.in);

        float fNum1 = sc.nextFloat();
        System.out.println("Enter second float number:");
        sc = new Scanner(System.in);
        float fNum2 = sc.nextFloat();
        System.out.println("Enter third float number:");
        sc = new Scanner(System.in);
        float fNum3 = sc.nextFloat();
        System.out.println(fNum1+ " " + fNum2 + " " + fNum3);
        if (fNum1>= -5 && fNum1<=5){
            System.out.println(fNum1+ " У діапазоні [-5;5] ");
        }
        if (fNum2>= -5 && fNum2<=5){
            System.out.println(fNum2+ " У діапазоні [-5;5] ");
        }
        if (fNum3>= -5 && fNum3<=5){
            System.out.println(fNum3+ " У діапазоні [-5;5] ");
        }
        System.out.println("Початок другого завдання");
        int iNum1 = sc.nextInt();
        System.out.println("Enter second integer number:");
        sc = new Scanner(System.in);
        int iNum2 = sc.nextInt();
        System.out.println("Enter third integer number:");
        sc = new Scanner(System.in);
        int iNum3 = sc.nextInt();
        if(iNum1>iNum2 && iNum1>iNum3){
            System.out.println(iNum1 + " is the biggest number");
        }else{
            if(iNum2>iNum1 && iNum2>iNum3){
                System.out.println(iNum2 + " is the biggest number");
            }else{
                if(iNum3>iNum2 && iNum3>iNum2){
                    System.out.println(iNum3 + " is the biggest number");
                }
            }
        }
        if(iNum1<iNum2 && iNum1<iNum3){
            System.out.println(iNum1 + " is the smallest number");
        }else{
            if(iNum2<iNum1 && iNum2<iNum3){
                System.out.println(iNum2 + " is the smallest number");
            }else{
                if(iNum3<iNum2 && iNum3<iNum2){
                    System.out.println(iNum3 + " is the smallest number");
                }
            }
        }
        System.out.println("Введіть число помилки: ");
        Scanner scError = new Scanner(System.in);
        sc = new Scanner(System.in);
        String error = sc.nextLine();
        switch (error) {
            case "404":
                HTTPError c1 = HTTPError.NOT_FOUND;
                System.out.println(c1);
                break;
            case "401":
                HTTPError c2 = HTTPError.UNAUTHORIZED;
                System.out.println(c2);
                break;
            case "406":
                HTTPError c3 = HTTPError.NOT_ACCETABLE;
                System.out.println(c3);
                break;
            case "409":
                HTTPError c4 = HTTPError.CONFLICT;
                System.out.println(c4);
                break;


            default:
                System.out.println("Enter the error");
        }
        Breed breed;
        Dog dog1 = new Dog("Lexi", 5,Breed.БУЛЬДОГ);
        Dog dog2 = new Dog("Kylie", 9,Breed.БІШОН_ФРІЗЕ);
        Dog dog3 = new Dog("Rex", 17,Breed.ОВЧАРКА);
        if(dog1.getName()==dog2.getName() ){
            System.out.println("Помилка");
        }
        if(dog1.getName() == dog3.getName()){
            System.out.println("Помилка");
        }
        if(dog2.getName()==dog3.getName() ){
            System.out.println("Помилка");
        }
        if(dog1.getAge()>dog2.getAge() && dog1.getAge()>dog3.getAge()){
            System.out.println(dog1.getName()+ "-" + dog1.getBreed());
        }
        if(dog2.getAge()>dog1.getAge() && dog2.getAge()>dog3.getAge()){
            System.out.println(dog2.getName()+ "-" + dog2.getBreed());
        }
        if(dog3.getAge()>dog2.getAge() && dog3.getAge()>dog1.getAge()){
            System.out.println(dog3.getName()+ "-" + dog3.getBreed());
        }



    }



    }



