package CodingQuestions;

public class MultiplicationTable {

	public static void main(String[] args) {
		System.out.println(multiply2(5, 10));

	}

	private static int multiply(int a, int j) {
		int multiple = 0;
		for (int i = 0; i < j; i++) {
			multiple += a;
		}
		return multiple;
	}

	public static int multiply2(int i, int j) {
		int multiple = 0;
		int k = 0;
		while (k < j) {
			multiple += i;
			k++;
		}

		return multiple;
	}

}
