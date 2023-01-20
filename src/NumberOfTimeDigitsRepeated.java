
public class NumberOfTimeDigitsRepeated {
	public static void main(String[] args) {

		int num = 498566575;
		int countNum = 7;
		int count = 0;
		while (num > 0) {
			int rem = num % 10;
			if (rem == countNum) {
				count++;
			}
			num = num / 10;
		}

		System.out.println(count);
	}

}
