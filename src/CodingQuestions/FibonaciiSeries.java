package CodingQuestions;

public class FibonaciiSeries {

	public static void main(String[] args) {
		int num = 9;
		int a = 0;
		int b = 1;
		int sum = 0;
		int i = 0;
		System.out.print(a + "," + b);
		while (i < num - 2) {
			i++;
			sum = a + b;
			a = b;
			b = sum;
			System.out.print("," + sum);

		}

	}

}
