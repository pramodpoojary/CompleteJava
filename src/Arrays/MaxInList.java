package Arrays;

import java.util.ArrayList;

public class MaxInList {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 1, 55, 2, 3 };
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);

		System.out.println(reverseArray(arr));
	}

	private static ArrayList<Integer> reverseArray(int[] arr) {
		ArrayList<Integer> revList = new ArrayList<Integer>();
		for (int i = (arr.length - 1); i >= 0; i--) {
			revList.add(arr[i]);
		}
		return revList;
	}
}
