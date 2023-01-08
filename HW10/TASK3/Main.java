import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String dollarBill = "$13454.122 $13454.12 $454.12 23434$ $1 dollar bill order";
        Pattern pattern = Pattern.compile("\\$\\d+\\.[0-9]{2} ");
        Matcher m = pattern.matcher(dollarBill);
        while(m.find()) {
            System.out.println(dollarBill.substring(m.start(), m.end()));
        }
    }
}