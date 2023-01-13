package HW13.Homework;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Product {
    private String manufactureCategory;
    private LocalDate dateOfManufacture;
    private int price;

    public String getManufactureCategory() {
        return manufactureCategory;
    }

    public void setManufactureCategory(String manufactureCategory) {
        this.manufactureCategory = manufactureCategory;
    }

    public LocalDate getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(LocalDate dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public static int compareByPrice (Product p1,Product p2) {
        return p1.getPrice()- p2.getPrice();
    }

    public Product(String manufactureCategory, LocalDate dateOfManufacture, int price) {
        this.manufactureCategory = manufactureCategory;
        this.dateOfManufacture = dateOfManufacture;
        this.price = price;
    }

    public static List<Product> sortPhones(List<Product> products) {

        List<Product> phones =
                products.stream().filter(product -> product.getManufactureCategory().equalsIgnoreCase("Phone")).
                        filter(product -> product.getPrice() > 3000).
                        filter(product -> Period.between(product.getDateOfManufacture(), LocalDate.now()).getYears() > 1).
                        sorted(Product::compareByPrice).collect(Collectors.toList());
        for (Product product:phones) {
            System.out.println(product);
        }
        return phones;
    }

    @Override
    public String toString() {
        return "Product{" +
                "manufactureCategory='" + manufactureCategory + '\'' +
                ", dateOfManufacture=" + dateOfManufacture +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Phone", LocalDate.of(2015, 1, 25), 2500));
        products.add(new Product("Laptop", LocalDate.of(2016, 5, 11), 3500));
        products.add(new Product("Mouse", LocalDate.of(2019, 4, 16), 250));
        products.add(new Product("Watch", LocalDate.of(2022, 5, 5), 850));
        products.add(new Product("Phone", LocalDate.of(2020, 3, 12), 3200));
        products.add(new Product("Phone", LocalDate.of(2019, 1, 1), 3100));
        products.add(new Product("Phone", LocalDate.of(2022, 1, 1), 4800));
        products.add(new Product("Phone", LocalDate.of(2020, 1, 1), 5200));
        products.add(new Product("Phone", LocalDate.of(2019, 1, 1), 5100));

        for (Product product:products) {
            System.out.println(product);
        }
        System.out.println();

        sortPhones(products);


    }
}
