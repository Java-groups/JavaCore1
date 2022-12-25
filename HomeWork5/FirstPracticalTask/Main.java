package edu.homeworks.hw5.FirstPracticalTask;

public class Main {
    public static void main(String[] args) {
      Truck truck = new Truck("DAF",100,20,1000);
      truck.run();
      Sedan sedan = new Sedan("Toyota",140,20,4);
      sedan.run();

    }
}