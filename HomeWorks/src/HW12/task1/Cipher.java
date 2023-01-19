package HW12.task1;

public class Cipher {
	
	/**
	 * Create two methods String encrypt(String s, int n) and String decrypt(Stirng s, int n)
	 * Method encrypt should take a string and return coded string where every letter is moved
	 * on n positions in alphabet (e.g. encrypt("abc", 3) returns "def“). Method decrypt should
	 * return decoded value
	 */
	
	public static void main(String[] args) {
		String message = "This settence is to show encrypt and decrypt methods!";
		System.out.println(encrypt(message, 3));

		System.out.println(decrypt(encrypt(message, 3), 3));
	}

	public static String encrypt(String s, int n) {
		StringBuilder sb = new StringBuilder();
		for (char c : s.toCharArray()) {
			if (c != ' ') {
				sb.append((char) (c + n));
			} else {
				sb.append(c);
			}
		}
		return sb.toString();
	}

	public static String decrypt(String s, int n) {
		StringBuilder sb = new StringBuilder();
		for (char c : s.toCharArray()) {
			if (c != ' ') {
				sb.append((char) (c - n));
			} else {
				sb.append(c);
			}
		}
		return sb.toString();
	}
}
