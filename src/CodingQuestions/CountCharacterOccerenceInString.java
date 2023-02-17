package CodingQuestions;

public class CountCharacterOccerenceInString {

	public static void main(String[] args) {
		System.out.println(characterOccurence("Pramod Poojary", 'p'));

	}

	private static int characterOccurence(String string, char c) {
		int count = 0;
		for (int i = 0; i < string.length(); i++) {
			if (string.toUpperCase().charAt(i) == Character.toUpperCase(c)) {
				count++;
			}
		}
		return count;
	}

}
