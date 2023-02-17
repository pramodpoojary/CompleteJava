package CodingQuestions;

public class MinAndMaxInMultiDimArray {

	public static void main(String[] args) {
		int[][] array = { { 1, 2, 6 }, { -4, 6, 8 }, { 0, 15, 3 } };
		int min = 0;
		int max = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] < min) {
					min = array[i][j];
				}
				if (array[i][j] > max) {
					max = array[i][j];
				}
			}
		}

		System.out.println("Minimum is :" + min + " Maximum is:" + max);
	}

}
