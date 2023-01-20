package Methods;

import java.util.Arrays;

public class varArguments {

	public static void main(String[] args) {
		num(1, 2, 3, 4, 56);

	}

	static void num(int... v) {
		System.out.println(Arrays.toString(v));

	}
}
