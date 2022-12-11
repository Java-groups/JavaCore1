public class Month {
    private static final int[] amountOfDays = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static int getAmountOfDays(int monthNumber) {
        return amountOfDays[monthNumber-1];
    }
}