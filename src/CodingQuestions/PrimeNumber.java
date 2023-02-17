package CodingQuestions;

public class PrimeNumber {

	public static void main(String[] args) {
		int num = 99;
		System.out.println(isPrime(num));
	}

	private static boolean isPrime(int num) {
		if (num == 0 || num == 1) {
			return true;
		}
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

}
