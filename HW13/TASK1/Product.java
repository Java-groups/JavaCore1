import java.time.LocalDate;

public class Product {
    private String category;
    private LocalDate manDate;
    private int price;

    public Product(String category, LocalDate date, int price) {
        this.category = category;
        this.manDate = date;
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public LocalDate getDate() {
        return manDate;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("Manufacture category: %s, Manufacture date: %s, Price: %d", category, manDate, price);
    }
}
