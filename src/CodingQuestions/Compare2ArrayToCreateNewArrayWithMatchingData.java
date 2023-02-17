package CodingQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class Compare2ArrayToCreateNewArrayWithMatchingData {

	public static void main(String[] args) {
		int[] a = { 1, 4, 5, 9, 8 };
		int[] b = { 2, 5, 5, 7, 8 };

		ArrayList<Integer> compareArrayList = new ArrayList<>();

		for (int i = 0; i < a.length; i++) {
			if (a[i] == b[i]) {
				compareArrayList.add(a[i]);
			}
		}
		System.out.println(Arrays.toString(compareArrayList.toArray()));
	}

}
