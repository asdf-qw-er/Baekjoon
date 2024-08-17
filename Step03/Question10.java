package Step03;

import java.util.Scanner;

public class Question10 {
	private void Function() {
		Scanner scanner = new Scanner(System.in);

		int starLength = scanner.nextInt();

		for (int i = 0; i < starLength; i++) {
			for (int j = 0; j < starLength - 1 - i; j++)
				System.out.print(" ");
			for (int j = 0; j < i + 1; j++)
				System.out.print("*");
			System.out.println();
		}

		scanner.close();
	}

	public static void main(String[] args) {
		Question10 q10 = new Question10();
		q10.Function();
	}
}
