package HW12.Homework;

public class Task1 {
    public static String encrypt(String s, int n) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] += n;
        }
        String s1 = new String(chars);
        System.out.println(s1);
        return s1;
    }
    public static String decrypt(String s, int n) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] -= n;
        }
        String s1 = new String(chars);
        System.out.println(s1);
        return s1;
    }
    public static void main(String[] args) {
        String s = "Something is here";
        int n = 3;
        s = encrypt(s,n);
        s = decrypt(s,n);

    }
}
