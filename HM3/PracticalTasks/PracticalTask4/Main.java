package HM3.PracticalTasks.PracticalTask4;

public class Main {
    public static void main(String[] args) {
        Product Product1 = new Product("TV set", 560, 12);
        Product Product2 = new Product("Washing machine", 950, 5);
        Product Product3 = new Product("Microwave", 120, 35);
        Product Product4 = new Product("Toster", 35, 50);

        if (Product1.price > Product2.price && Product1.price > Product3.price && Product1.price > Product4.price) {
            System.out.println("The most expensive item is the " + Product1.name);
        }
        if (Product2.price > Product1.price && Product2.price > Product3.price && Product2.price > Product4.price) {
            System.out.println("The most expensive item is the " + Product2.name);
        }
        if (Product3.price > Product1.price && Product3.price > Product2.price && Product3.price > Product4.price) {
            System.out.println("The most expensive item is the " + Product3.name);
        }
        if (Product4.price > Product1.price && Product4.price > Product2.price && Product4.price > Product3.price) {
            System.out.println("The most expensive item is the " + Product4.name);
        }

        if (Product1.quantity > Product2.quantity && Product1.quantity > Product3.quantity && Product1.quantity > Product4.quantity) {
            System.out.println("The biggest quantity has " + Product1.name);
        }
        if (Product2.quantity > Product1.quantity && Product2.quantity > Product3.quantity && Product2.quantity > Product4.quantity) {
            System.out.println("The biggest quantity has " + Product2.name);
        }
        if (Product3.quantity > Product1.quantity && Product3.quantity > Product2.quantity && Product3.quantity > Product4.quantity) {
            System.out.println("The biggest quantity has " + Product3.name);
        }
        if (Product4.quantity > Product1.quantity && Product4.quantity > Product2.quantity && Product4.quantity > Product3.quantity) {
            System.out.println("The biggest quantity has " + Product4.name);
        }
    }
}
