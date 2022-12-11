package arthurmkrtchian.javaCore.conditionStatements.practicalTasks.practicalTask4;

public class Product implements Comparable<Product>{
    private String name;
    private int quantity;
    private int price;

    public Product(String name, int quantity, int price) {
        this.name = name;
        setPrice(price);
        setQuantity(quantity);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            System.out.println("Quantity can not be less than 0\nIt`s automatically set to 0\n");
            this.quantity = 0;
        } else {
            this.quantity = quantity;
        }
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price < 0) {
            System.out.println("Price can not be less than 0\nIt`s automatically set to 0\n");
            this.price = 0;
        } else {
            this.price = price;
        }
    }

    @Override
    public int compareTo(Product o) {
        return this.getQuantity() - o.getQuantity();
    }
}
