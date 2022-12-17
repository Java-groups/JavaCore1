package com.softserve.practicaltask.pt4;

public class Product {
    public static void main(String[] args) {
        Product product = new Product();
        product.maxPriceItemNameAndQuantity();
    }
    private String name;
    private int price;
    private int quantity;

    public Product() {
    }

    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void maxPriceItemNameAndQuantity() {

        Product item1 = new Product("item1", 50, 1);
        Product item2 = new Product("item2", 20, 2);
        Product item3 = new Product("item3", 30, 3);
        Product item4 = new Product("item4", 40, 4);
        maxPrice (item1, item2, item3, item4);
        maxPrice (item2, item1, item3, item4);
        maxPrice (item3, item2, item1, item4);
        maxPrice (item4, item2, item3, item1);
    }

    private static void maxPrice(Product item1, Product item2, Product item3, Product item4) {
        Product product;

        if (item1.price > item2.price && item1.price > item3.price && item1.price > item4.price) {
            product = item1;
            System.out.println(product);
        }
    }

    @Override
    public String toString() {
        return "Product: " +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity;
                }
}

