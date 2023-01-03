package edu.homeworks.hw9.task2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String firstName;
        Scanner scanner = new Scanner(System.in);
        Map<String,String> personMap = new HashMap<String,String>();
        personMap.put("Bilashuk","Stepan");
        personMap.put("Berdo","Alla");
        personMap.put("Gavryluk","Bogdan");
        personMap.put("Petrenko","Denis");
        personMap.put("Taladion","Svetlana");
        personMap.put("Isaeva","Alla");
        personMap.put("Gavrt","Stepan");
        System.out.println(personMap);
        Set<String> duplicatMap = new HashSet<>(personMap.values());


        if(personMap.values().size() != duplicatMap.size()){
            System.out.println("We have two duplicates");
        }
        System.out.println(duplicatMap);

        System.out.println("Please,write name");
        firstName = scanner.nextLine();
        for (int i=0;i<personMap.size();i++){
            if(personMap.values().contains(firstName)){
                personMap.values().remove(firstName);
            }
        }

        System.out.println(personMap);




    }
 }
