package Helper;

public class StringHelper {
    public static String firstUppercase(String string) {
        String lower = string.toLowerCase();
        return lower.substring(0,1).toUpperCase() + string.toLowerCase().substring(1);
    }
}
