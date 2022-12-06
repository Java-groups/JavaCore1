package edu.homeworks.homework3;

import java.util.*;

public class Numbers {
    private int result;
    private HTTPError httpError;
    ArrayList<Float> numbers = new ArrayList<>();
    ArrayList<Integer> arrMixMax = new ArrayList<>();


    public void NumbersLessMore(Scanner input){
        System.out.println("Enter the length of the array");
        result = input.nextInt();
        for (int i = 0;i<result;i++){
            System.out.println("Enter a number with a comma for example 4,7");

            numbers.add(input.nextFloat());
            if(numbers.get(i)>5 || numbers.get(i)<-5){
                numbers.remove(i);
                System.out.println("Your added number more 5 or less -5");
                break;
            }


        }
        for (int j=0;j<numbers.size();j++){
            if(-5.0< numbers.get(j) && numbers.get(j)<5.0){
                System.out.println("Your numbers "+numbers.get(j)+" more -5 and less 5");
            }
            else if(-5.0 > numbers.get(j)) {
                System.out.println("Your number "+numbers.get(j)+" less -5");
            }
            else if(5.0 < numbers.get(j)){
                System.out.println("Your number "+numbers.get(j)+" more 5");
            }
        }
    }
    public void NumberMinMax(Scanner input){
        System.out.println("Enter the length of the array");
        result = input.nextInt();
        for(int i=0;i<result;i++){
            System.out.println("Enter integer number = ");
            arrMixMax.add(input.nextInt());
        }
        System.out.println("Your max number = " + Collections.max(arrMixMax));
        System.out.println("Your min number = " + Collections.min(arrMixMax));
    }

    public void HTTPErrors(Scanner input){
        System.out.println("Write the error number : ");
        result = input.nextInt();
        switch (result){
            case 400 : System.out.println(HTTPError.Bad_Request);
            break;
            case 401 : System.out.println(HTTPError.Unauthorized);
            break;
            case 402 : System.out.println(HTTPError.PaymentRequired);
            break;
            case 403 : System.out.println(HTTPError.Forbidden);
            break;
            case 404 : System.out.println(HTTPError.NotFound);
            break;
            default: System.out.println("You wrote an unknown number");

        }
    }


}


