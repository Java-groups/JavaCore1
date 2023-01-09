package HW12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class HW12 {
    public static final int START_ASCII = 97;
    public static final int END_ASCII = 122;

    public static void main(String[] args) {

        System.out.println("Start of first task");
        System.out.println("Enter string of letters:");
        Scanner sc = new Scanner(System.in);
        sc = new Scanner(System.in);
        String str = sc.nextLine();
        String encryptedMessage = encrypt(str.toLowerCase(), 3);
        decrypt(encryptedMessage, 3);

        System.out.println("Start of second task");
        System.out.println("Enter date:");
        sc = new Scanner(System.in);
        String value = sc.nextLine();
        System.out.println(testDate(value));

        System.out.println("Start of third task");
        System.out.println("Enter year:");
        int year = sc.nextInt();
        leapYear(year);

        System.out.println("Start of fourth task");
        LocalDate birthday = LocalDate.of(2004, 12, 10);
        printDays(birthday);
        System.out.println("Enter string of letters:");
        sc = new Scanner(System.in);
        String letter = sc.nextLine();


    }

    static String encrypt(String str, int shift) {
        char[] encryptArray = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) + shift) > END_ASCII) {
                encryptArray[i] = (char) ((str.charAt(i) + shift) - END_ASCII + START_ASCII - 1);
            } else {
                encryptArray[i] = (char) ((str.charAt(i) + shift));
            }

        }
        String encryptedString = new String(encryptArray);
        System.out.println("Encrypting..." + encryptedString);
        return encryptedString;
    }

    static void decrypt(String str, int shift) {
        char[] decryptedArray = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) - shift) < START_ASCII) {
                decryptedArray[i] = (char) (END_ASCII - Math.abs(str.charAt(i) - shift - START_ASCII + 1));
            } else {
                decryptedArray[i] = (char) ((str.charAt(i) - shift));
            }

        }

        String string = new String(decryptedArray);
        System.out.println("Decrypting..." + string);
    }

    public static void leapYear(int year) {
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("This is leap year");
        } else {
            System.out.println("This is not leap year");
        }
    }

    public static boolean testDate(String value) {
        boolean result = true;
        Date date = new Date();
        String format = "mm.dd.yy";
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            date = sdf.parse(value);
            if (!value.equals(sdf.format(date))) {
                result = false;
            }
        } catch (ParseException parseException) {
            parseException.printStackTrace();
        }
        return result;
    }

    public static void printDays(LocalDate birthday) {
        LocalDate afterSix = birthday.plusMonths(6);
        LocalDate afterTwelve = birthday.plusMonths(12);
        System.out.println("Day of my birthday is " + birthday.getDayOfWeek());
        System.out.println("Day of my birthday after 6 months is " + afterSix.getDayOfWeek());
        System.out.println("Day of my birthday after 12 months  is " + afterTwelve.getDayOfWeek());
    }

}

