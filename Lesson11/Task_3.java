package Lesson11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_3 {
    public static void main(String[] args) {
        String[] userNames = {"John56", "AmAnda_76", "NY", "ImAgInE_dRaGoNs_2008", "%hhdj"};

        Pattern p = Pattern.compile("^[a-zA-Z0-9_-]{3,15}$");

        for (String userName : userNames) {
            Matcher m = p.matcher(userName);
            System.out.printf("%s %s\n", userName, m.matches());
        }
    }
}
