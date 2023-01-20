package Patterns;

public class Pattern1 {

	public static void main(String[] args) {
		pattern11(5);

	}

	public static void pattern1(int n) {
		for (int row = 0; row <= n; row++) {
			for (int col = 0; col <= row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

	public static void pattern2(int n) {
		for (int row = 0; row <= n; row++) {
			for (int col = 0; col <= n; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

	public static void pattern3(int n) {
		for (int row = 0; row <= n; row++) {
			for (int col = n; col >= row; col--) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

	public static void pattern4(int n) {
		for (int row = 0; row <= n; row++) {
			for (int col = 0; col <= row; col++) {
				System.out.print(col + 1);
			}
			System.out.println();
		}

	}

	public static void pattern5(int n) {
		for (int row = 0; row <= 2 * n; row++) {
			int totalColsInRow = row > n ? 2 * n - row : row;
			for (int col = 0; col <= totalColsInRow; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

	public static void pattern8(int n) {
		for (int row = 0; row <= n; row++) {
			for (int space = n; space > row; space--) {
				System.out.print(" ");
			}
			for (int col = 0; col <= row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}
	
	public static void pattern11(int n) {
		for (int row = 1; row <= 2*n; row++) {
			int totalspaces = row > n ? 2 * n - row+1 : row;
			for (int space = 0; space <= totalspaces; space++) {
				System.out.print(" ");
			}
			int totalcols = row > n ? 2 * n - row+1 : row;
			for (int col = n; col >=  totalcols; col--) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}
	
	static void pattern17(int n) {
        for (int row = 1; row <= 2 * n; row++) {

            int c = row > n ? 2 * n - row: row;

            for (int space = 0; space < n-c; space++) {
                System.out.print("  ");
            }

            for (int col = c; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= c; col++) {
                System.out.print(col + " ");
            }

            System.out.println();
        }
    }
	
	

}
