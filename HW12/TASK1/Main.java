public class Main {
    public static void main(String[] args) {
        String str = "Hello world!";

        Crypto crypto = new Crypto();
        Cryptography<String, String> encryptor = crypto::encrypt;
        Cryptography<String, String> decryptor = crypto::decrypt;
        String encrypted = encryptor.convert(str, 3);
        System.out.println("Encrypted "+encrypted);
        String decrypted = decryptor.convert(encrypted, 3);
        System.out.println("Decrypted "+decrypted);

        Cryptography<String, String> encryptorL = (s, n) -> {
            StringBuilder sb = new StringBuilder();
            for (char c : s.toCharArray()) {
                sb.append((char)((int)c + n));
            }
            return sb.toString();
        };

        Cryptography<String, String> decryptorL = (s, n) -> {
            StringBuilder sb = new StringBuilder();
            for (char c : s.toCharArray()) {
                sb.append((char)((int)c - n));
            }
            return sb.toString();
        };

        String enc = encryptorL.convert(str,3);
        System.out.println("Encrypted "+enc);
        String dec = decryptorL.convert(enc,3);
        System.out.println("Decrypted "+dec);
    }
}