package Strings;

public class Palindrome {
	public static void main(String[] args) {

		System.out.println(isPalindrome("123"));

	}

	public static boolean isPalindrome(String str) {

		char[] strArray = str.toLowerCase().toCharArray();

		int start = 0;
		int end = strArray.length - 1;

		while (start < end) {
			if (strArray[start] == strArray[end]) {
				start++;
				end--;
			} else {
				return false;
			}
		}
		return true;
	}
}