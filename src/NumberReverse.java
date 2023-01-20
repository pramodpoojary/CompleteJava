
public class NumberReverse {

	public static void main(String[] args) {

		int num = 498566575;
		int revNum = 0;
		while (num > 0) {
			int rem = num % 10;
			revNum = revNum * 10 + rem;
			num /= 10;
		}

		System.out.println(revNum);
	}
}
