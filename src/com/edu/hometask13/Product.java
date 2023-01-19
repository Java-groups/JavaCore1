package com.edu.hometask13;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Product {
    private String manufactureCategory;
    private LocalDate dateOfManufacture;
    private int price;

    public Product(String manufactureCategory, LocalDate dateOfManufacture, int price) {
        this.manufactureCategory = manufactureCategory;
        this.dateOfManufacture = dateOfManufacture;
        this.price = price;
    }

    public Product() {

    }

    public String getManufactureCategory() {
        return manufactureCategory;
    }


    public LocalDate getDateOfManufacture() {
        return dateOfManufacture;
    }


    public int getPrice() {
        return price;
    }


    public static List<Product> sortedProducts(List<Product> products) {
        return products.stream()
                .filter(product -> product.getManufactureCategory().equals("Phone"))
                .filter(product -> product.getPrice() > 3000)
                .filter(product -> product.getDateOfManufacture().isBefore(LocalDate.now().minusYears(1)))
                .sorted(Comparator.comparingInt(Product::getPrice))
                .collect(Collectors.toList());
    }
    @Override
    public String toString() {
        return
                "manufactureCategory='" + manufactureCategory + '\'' +
                ", dateOfManufacture=" + dateOfManufacture +
                ", price=" + price +
                "\n";
    }
}
