import java.util.Scanner;

public class FibonaciiNumber {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int a = 0;
		int b = 1;
		int count = 2;
		System.out.println(a);
		System.out.println(b);
		while (count <= n) {
			int temp = b;
			b = a + b;
			a = temp;
			count++;
			System.out.println(b);
		}

		// System.out.println(b);

	}
}
