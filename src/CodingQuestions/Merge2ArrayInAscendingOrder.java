package CodingQuestions;

import java.util.Arrays;

public class Merge2ArrayInAscendingOrder {
	public static void main(String[] args) {

		int[] a = { 1, 3, 4, 6 };
		int[] b = { 2, 5, 8, 5 };

		int[] c = new int[a.length + b.length];

		System.arraycopy(a, 0, c, 0, a.length);
		System.arraycopy(b, 0, c, a.length, b.length);
		int temp = 0;
		for (int i = 0; i < c.length - 1; i++) {
			for (int j = i + 1; j < c.length; j++) {
				if (c[i] > c[j]) {
					temp = c[i];
					c[i] = c[j];
					c[j] = temp;
				}
			}
		}
		//Arrays.sort(c);
		System.out.print(Arrays.toString(c));
	}
}
