package CodingQuestions;

public class SumOfArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };

		System.out.println("Sum of Given array is:"+sum(arr));
	}

	private static int sum(int[] arr) {
		int total = 0;
		for (int i : arr) {
			total += i;
		}

		return total;
	}

}
