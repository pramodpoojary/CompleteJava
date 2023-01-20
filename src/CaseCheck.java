import java.util.Scanner;

public class CaseCheck {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		char ch = in.next().trim().charAt(0);
		System.out.println(ch);

		if (ch > 'a' && ch < 'z') {
			System.out.print("Character is in Lower Case");
		} else {
			System.out.print("Character is in Upper Case");
		}
	}
}
