package edu.homeworks.hw13.homeWork.Task1;

import java.time.LocalDate;
import java.util.Date;

public class Product {
    private String manufactureCategory;
    private double price;
    private LocalDate date;

    public String getManufactureCategory() {
        return manufactureCategory;
    }

    public void setManufactureCategory(String manufactureCategory) {
        this.manufactureCategory = manufactureCategory;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Product(String manufactureCategory, double price, LocalDate date) {
        this.manufactureCategory = manufactureCategory;
        this.price = price;
        this.date = date;
    }

    @Override
    public String toString(){
        return "Category = " + getManufactureCategory() +
                "\n Price = " + getPrice() +
                "\n Date = " + getDate();
    }
}
