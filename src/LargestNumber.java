import java.util.Scanner;

public class LargestNumber {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();

		int max = a;
		if (max < b) {
			max = b;
		}
		if (max < c) {
			max = c;
		}

		System.out.println(max);

		// Math.max(a,b);

		System.out.println(Math.max(c, Math.max(a, b)));
	}
}
