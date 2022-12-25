package hw6.task1;

public interface Payment extends Comparable<Payment> {
    int calculatePay();

    @Override
    default int compareTo(Payment other) {
        return other.calculatePay() - this.calculatePay();
    }
}
