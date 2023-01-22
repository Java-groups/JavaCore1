package AllHomeWorks.HomeWork13.Task1;

import java.util.*;
import java.util.stream.Stream;

public class Product {
    public String manufactureCategory;
    public int manufactureDate;
    public int price;

    public Product(String manufactureCategory, int manufactureDate, int price ){
        this.manufactureCategory = manufactureCategory;
        this.manufactureDate = manufactureDate;
        this.price = price;
    }

    public String getManufactureCategory() {
        return manufactureCategory;
    }

    public int getManufactureDate() {
        return manufactureDate;
    }

    public int getPrice() {
        return price;
    }

    public void setManufactureCategory(String manufactureCategory) {
        this.manufactureCategory = manufactureCategory;
    }

    public void setManufactureDate(int manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    static Optional<String> mostPopularCategory(Stream<Product> products) {
        Map<String, Integer> categoryMap = new HashMap<>();

        products.forEach(product ->
                categoryMap.put(
                        product.getManufactureCategory(),
                        categoryMap.getOrDefault(product.getManufactureCategory(), 0) + 1
                )
        );
        Optional<Map.Entry<String, Integer>> popular =
                categoryMap
                        .entrySet()
                        .stream()
                        .max(Map.Entry.comparingByValue());


        return popular.map(Map.Entry::getKey);
    }
}
