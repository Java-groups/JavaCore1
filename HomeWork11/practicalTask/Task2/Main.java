package edu.homeworks.hw11.practicalTask.Task2;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Plant> plantList = new ArrayList<Plant>();
        try{
            plantList.add(new Plant(5,"red","perennials"));
            plantList.add(new Plant(4,"green","perennials"));
            plantList.add(new Plant(2,"pink","biennials"));
            plantList.add(new Plant(3,"azure","black"));
        }
        catch (TypeException | ColorException e){
            System.out.println(e.getMessage());

        }
    }
 }
