package Step03;

import java.util.Scanner;

public class Question09 {

	private void Function() {
		Scanner scanner = new Scanner(System.in);

		int starLength = scanner.nextInt();

		for (int i = 0; i < starLength; i++) {
			for (int j = 0; j < i + 1; j++)
				System.out.print("*");
			System.out.println();
		}

		scanner.close();
	}

	public static void main(String[] args) {
		Question09 q09 = new Question09();
		q09.Function();
	}
}
