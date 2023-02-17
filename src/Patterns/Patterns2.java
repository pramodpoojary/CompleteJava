package Patterns;

public class Patterns2 {

	public static void main(String[] args) {
		pattern14(5);

	}

	public static void pattern8(int n) {
		for (int row = 0; row <= n; row++) {
			for (int space = n; space > row; space--) {
				System.out.print(" ");
			}

			int cols = (row * 2) + 1;
			for (int col = 0; col < cols; col++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void pattern9(int n) {
		for (int row = n; row >= 0; row--) {
			for (int space = n; space > row; space--) {
				System.out.print(" ");
			}

			int cols = (row * 2) + 1;
			for (int col = 0; col < cols; col++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void pattern13(int n) {
		for (int row = 0; row <= n; row++) {
			for (int space = n; space > row; space--) {
				System.out.print(" ");
			}

			int cols = (row * 2) + 1;
			for (int col = 0; col < cols; col++) {
				if (col == 0 || col == cols-1||row==n) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}
	
	public static void pattern14(int n) {
		for (int row = n; row >= 0; row--) {
			for (int space = n; space > row; space--) {
				System.out.print(" ");
			}

			int cols = (row * 2) + 1;
			for (int col = 0; col < cols; col++) {
				if (col == 0 || col == cols-1||row==n) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}
}
