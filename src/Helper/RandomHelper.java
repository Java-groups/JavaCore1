package Helper;

public class RandomHelper {
    public static Integer negativePositiveInteger(int max) {
        try {
            return negativePositiveInteger(max, 1);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static Integer negativePositiveInteger(int max, int minDigits) throws Exception {
        int min = (int) Math.pow(10, minDigits - 1);
        if (max < min) throw new Exception("Max value is less that minimum " + minDigits+" digits number.");

        if (Math.random() > 0.5) {
            return (int) (Math.random() * (max - min) + min);
        } else {
            return (int) ((Math.random() * (max - min) + min) * -1);
        }
    }
}
