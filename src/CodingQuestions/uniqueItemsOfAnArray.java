package CodingQuestions;

import java.util.HashSet;
import java.util.Set;

public class uniqueItemsOfAnArray {

	public static void main(String[] args) {
		int[] array = { 1, 1, 3, 4, 5, 6, 7, 8, 9, 8 };

		Set<Integer> arraySet = new HashSet<Integer>();

		for (int i : array) {
			arraySet.add(i);
		}

		System.out.println(arraySet.toString());

	}

}
