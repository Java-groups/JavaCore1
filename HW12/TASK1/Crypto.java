import java.awt.*;
import java.util.Collections;
import java.util.stream.Collectors;

public class Crypto {
    public String encrypt(String str, int n) {
        return str.chars().map(c -> (char) (c + n)).collect(
                StringBuilder::new,
                StringBuilder::appendCodePoint,
                StringBuilder::append
        ).toString();
    }

    public String decrypt(String str, int n) {
        return str.chars().map(c -> (char) (c - n)).collect(
                StringBuilder::new,
                StringBuilder::appendCodePoint,
                StringBuilder::append
        ).toString();
    }
}