package CodingQuestions;

public class StringReverse {

	public static void main(String[] args) {
		String str = "Malayalam";

		StringBuilder stringB = new StringBuilder();

		for (int i = str.length(); i > 0; i--) {
			stringB.append(str.charAt(i - 1));
		}

		System.out.println(stringB.toString());

		if (stringB.toString().equalsIgnoreCase(str)) {
			System.out.println("String is a Palindrome");
		} else {
			System.out.println("String is not a palindrome");
		}
	}

}
