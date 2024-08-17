package Step01;

import java.util.Scanner;

public class Question11 {

	private static void Function() {
		Scanner scanner = new Scanner(System.in);

		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();

		System.out.println(num1 + num2 + num3);

		scanner.close();
	}

	public static void main(String[] args) {
		Function();
	}
}
