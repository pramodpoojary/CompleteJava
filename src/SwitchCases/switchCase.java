package SwitchCases;

import java.util.Scanner;

public class switchCase {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String fruit = in.next();
		/*
		 * switch (fruit) { case "Mango": System.out.println("King of Fruits"); break;
		 * case "Orange": System.out.println("Roubd Fruits"); break; case "Apple":
		 * System.out.println("Red Fruits"); break; default:
		 * System.out.println("Invalid Fruit"); break;
		 * 
		 * }
		 */
		// smart swith case

		switch (fruit) {
		case "Mango" -> System.out.println("King of Fruits");
		case "Orange" -> System.out.println("Roubd Fruits");
		case "Apple" -> System.out.println("Red Fruits");
		default -> System.out.println("Invalid Fruit");

		}
		
		int day = in.nextInt();
		switch (day) {
		case 1, 2, 3, 4, 5 -> System.out.println("WeekDay");
		case 6, 7 -> System.out.println("Weekend");
		default -> System.out.println("INvalid day");

		}
	}
}
