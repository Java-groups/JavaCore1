package HW13;

public class Product {
    private String mFactory;
    private int mYear;
    private int mPrice;

    @Override
    public String toString() {
        return "Product{" +
                "mFactory='" + mFactory + '\'' +
                ", mYear=" + mYear +
                ", mPrice=" + mPrice +
                '}';
    }

    public String getmFactory() {
        return mFactory;
    }

    public void setmFactory(String mFactory) {
        this.mFactory = mFactory;
    }

    public int getmYear() {
        return mYear;
    }

    public void setmYear(int mYear) {
        this.mYear = mYear;
    }

    public int getmPrice() {
        return mPrice;
    }

    public void setmPrice(int mPrice) {
        this.mPrice = mPrice;
    }

    public Product(String mFactory, int mYear, int mPrice) {
        this.mFactory = mFactory;
        this.mYear = mYear;
        this.mPrice = mPrice;
    }
}
