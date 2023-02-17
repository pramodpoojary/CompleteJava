package CodingQuestions;

import java.util.ArrayList;

public class ArrayPairs {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 10, 50, 10, 30, 10 ,30};

		int pair = 0;
		ArrayList<Integer> ls = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (!ls.contains(i)) {
				for (int j = i + 1; j < arr.length - 1; j++) {
					if (arr[i] == arr[j]) {
						pair++;
						ls.add(j);
					}
				}
			}
		}
		System.out.println(pair);
	}

}
