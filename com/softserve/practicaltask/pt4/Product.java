package com.softserve.practicaltask.pt4;

public class Product {
    public static void main(String[] args) {

    }
    private String name;
    private int price;
    private int quantity;
    private int maxPrice1;
    private int maxPrice2;

    public Product() {
    }

    public Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void maxPrice() {
        Product product = new Product();

        Product item1 = new Product("item1", 10, 1);
        Product item2 = new Product("item2", 20, 2);
        Product item3 = new Product("item3", 30, 3);
        Product item4 = new Product("item4", 40, 4);

        if (item1.price > item2.price) {
            Product maxPrice1 = new Product(item1.name, item1.quantity);
            product.maxPrice1 = item1.price;
        } else {
            Product maxPrice1 = new Product(item2.name, item2.quantity);
            product.maxPrice1 = item2.price;
        }
        if (item3.price > item4.price) {
            Product maxPrice2 = new Product(item3.name, item3.quantity);
            product.maxPrice2 = item3.price;
        } else {
            Product maxPrice2 = new Product(item4.name, item4.quantity);
            product.maxPrice2 = item4.price;
        }
        if (product.maxPrice1 > product.maxPrice2) {
            System.out.println(maxPrice1);
        } else {
            System.out.println(maxPrice2);
        }
    }
}
