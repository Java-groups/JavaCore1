public class Country {
    private double pricePerMinute;
    private double amountOfMinutes;
    public void setPricePerMinute(double pricePerMinute) {
        this.pricePerMinute = pricePerMinute;
    }
    public void setAmountOfMinutes(double amountOfMinutes) {
        this.amountOfMinutes = amountOfMinutes;
    }
    public double getCallAmount() {
        return pricePerMinute*amountOfMinutes;
    }
}