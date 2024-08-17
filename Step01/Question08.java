package Step01;

import java.util.Scanner;

public class Question08 {

	private final static int BULGI = 2541 - 1998;

	private static void Function() {
		Scanner scanner = new Scanner(System.in);

		int year = scanner.nextInt();

		System.out.println(year - BULGI);

		scanner.close();
	}

	public static void main(String[] args) {
		Function();
	}
}
