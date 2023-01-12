public class Crypto {
    public String encrypt(String str, int n) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            sb.append((char)((int)c + n));
        }
        return sb.toString();
    }
    public String decrypt(String str, int n) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            sb.append((char)((int)c - n));
        }
        return sb.toString();
    }
}
