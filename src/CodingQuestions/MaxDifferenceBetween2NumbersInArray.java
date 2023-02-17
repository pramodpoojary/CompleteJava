package CodingQuestions;

import java.util.ArrayList;
import java.util.Collections;

public class MaxDifferenceBetween2NumbersInArray {

	public static void main(String[] args) {
		int[] array = { 1, 2, 7, 9, 6 };

		int diff = 0;
		for (int i = 0; i < array.length-1; i++) {
			if (Math.abs(array[i + 1] - array[i]) > diff) {
				diff = Math.abs(array[i + 1] - array[i]);
			}
		}
		System.out.println(diff);
		/// System.out.println("Max difference between any consecutive number is: " +
		/// maxDifference(array));

	}

	private static int maxDifference(int[] array) {
		ArrayList<Integer> diff = new ArrayList<Integer>();

		for (int i = 0; i < array.length - 1; i++) {
			int k = Math.abs(array[i] - array[i + 1]);
			diff.add(k);
		}

		Collections.sort(diff, Collections.reverseOrder());
		System.out.println(diff.toString());
		return diff.get(0);
	}

}
