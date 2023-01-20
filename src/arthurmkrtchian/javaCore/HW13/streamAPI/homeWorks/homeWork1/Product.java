package arthurmkrtchian.javaCore.HW13.streamAPI.homeWorks.homeWork1;

//        1. Create class Product with fields manufacture category, date of manufacture and price. Add all
//        needed methods
//        • Create list Product with 20 objects
//        • Obtain a sorted by the price list of products belong to category Phone with
//        price > 3000, and the date of manufacture was more then 1 year ago.



import java.time.LocalDate;

public class Product {
    private Category category;
    private LocalDate date;
    private Integer price;

    public Product(Category category, LocalDate date, Integer price) {
        this.category = category;
        this.date = date;
        this.price = price;
    }

    @Override
    public String toString() {
        return "category: " + category +
                ", date: " + date.toString() +
                ", price: " + "$" + price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public LocalDate getDate() {
        return date;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
