package CodingQuestions;

import java.util.HashMap;

public class NumberOfTimesItemRepeatedInArray {
	public static void main(String[] args) {

		int[] a = { 1, 1, 3, 4, 3, 5, 4, 4, 5, 9 };

		HashMap<Integer, Integer> arrayMap = new HashMap<>();

		for (int i = 0; i < a.length; i++) {
			int count = 0;
			if (!arrayMap.containsKey(a[i])) {
				count++;
				for (int j = i + 1; j < a.length; j++) {

					if (a[i] == a[j]) {
						count++;
					}

				}
				arrayMap.put(a[i], count);
			}
		}

		System.out.println(arrayMap.toString());
		for (int key : arrayMap.keySet()) {

			if (arrayMap.get(key) == 1) {
				System.out.println(arrayMap.get(key));
			}
		}
	}

}
