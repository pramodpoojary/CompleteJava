package CodingQuestions;

import java.util.Arrays;

public class sortingAnArray {

	public static void main(String[] args) {
		int[] a = { 8, 5, 6, 9, 1 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) { //change it to > if you want to sort it in ascending order
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}

		}

		System.out.println(Arrays.toString(a));

	}

}
