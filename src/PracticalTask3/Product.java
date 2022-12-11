package PracticalTask3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Product {

    private String name;
    private float price;
    private int quantity;

    Product() {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product [" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Float.compare(product.price, price) == 0 && quantity == product.quantity && name.equals(product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, quantity);
    }



    public static void main(String[] args) {

        Product prod1 = new Product();
        prod1.setName("MB");
        prod1.setPrice(123.6f);
        prod1.setQuantity(30);

        Product prod2 = new Product();
        prod2.setName("CPU");
        prod2.setPrice(353f);
        prod2.setQuantity(18);

        Product prod3 = new Product();
        prod3.setName("HDD");
        prod3.setPrice(89.1f);
        prod3.setQuantity(180);

        Product prod4 = new Product();
        prod4.setName("SSD");
        prod4.setPrice(56.5f);
        prod4.setQuantity(67);

        System.out.println(prod1);
        System.out.println(prod2);
        System.out.println(prod3);
        System.out.println(prod4);

        float maxPrice = 0;
        String nameMaxPrice = null;
        if (maxPrice < prod1.getPrice()) {
            maxPrice = prod1.getPrice();
            nameMaxPrice = prod1.getName();
        }
        if (maxPrice < prod2.getPrice()) {
            maxPrice = prod2.getPrice();
            nameMaxPrice = prod2.getName();
        }
        if (maxPrice < prod3.getPrice()) {
            maxPrice = prod3.getPrice();
            nameMaxPrice = prod3.getName();
        }
        if (maxPrice < prod4.getPrice()) {
            maxPrice = prod4.getPrice();
            nameMaxPrice = prod4.getName();
        }
        System.out.println("\nMost expensive product - " + nameMaxPrice);

        int maxQuantity = 0;
        String nameMaxQuantity = null;
        if (maxQuantity < prod1.getQuantity()) {
            maxQuantity = prod1.getQuantity();
            nameMaxQuantity = prod1.getName();
        }
        if (maxQuantity < prod2.getQuantity()) {
            maxQuantity = prod2.getQuantity();
            nameMaxQuantity = prod2.getName();
        }
        if (maxQuantity < prod3.getQuantity()) {
            maxQuantity = prod3.getQuantity();
            nameMaxQuantity = prod3.getName();
        }
        if (maxQuantity < prod4.getQuantity()) {
            maxQuantity = prod4.getQuantity();
            nameMaxQuantity = prod4.getName();
        }
        System.out.println("\nThe largest quantity has a product - " + nameMaxQuantity);

    }
}
