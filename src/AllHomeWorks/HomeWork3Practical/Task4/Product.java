package AllHomeWorks.HomeWork3Practical.Task4;

import java.io.BufferedReader;
import java.io.IOException;

public class Product {
    private String name;
    private int price;
    private int quantity;

    public Product() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void input(BufferedReader br) throws IOException {
        System.out.println("Enter Title:");
        String name = "";
        name = br.readLine();

        while (name.isEmpty()) {
            System.out.println("Title cannot be empty. Enter Title:");
            name = br.readLine();
        }
        this.setName(name);


        System.out.println("Enter Price:");
        int price = -1;
        try {
            price = Integer.parseInt(br.readLine());
        } catch (NumberFormatException e) {
        }
        while (price < 0) {
            System.out.println("Lastname cannot be empty. Enter Price:");
            try {
                price = Integer.parseInt(br.readLine());
            } catch (NumberFormatException e) {
            }
        }
        this.setPrice(price);


        System.out.println("Enter Quantity:");
        int quantity = -1;
        try {
            quantity = Integer.parseInt(br.readLine());
        } catch (NumberFormatException e) {
        }
        while (quantity < 0) {
            System.out.println("Please input right quantity!");
            try {
                quantity = Integer.parseInt(br.readLine());
            } catch (NumberFormatException e) {
            }
        }
        this.setQuantity(quantity);
    }
}


