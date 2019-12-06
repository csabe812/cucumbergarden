package cucumbergarden;

public class HelloWorldPalindrome {
	public static boolean IsPalindrome(String string) {
		char[] chars = string.toCharArray();
		int charLength = chars.length - 1;
		for (int i = 0; i < chars.length / 2; i++) {
			if (chars[i] != chars[charLength]) {
				return false;
			}
			charLength--;
		}
		return true;
	}
}
