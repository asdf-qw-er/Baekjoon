package Step03;

import java.util.Scanner;

public class Question12 {

	private void Function() {
		try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
				int num1 = scanner.nextInt();
				int num2 = scanner.nextInt();

				System.out.println(num1 + num2);
			}
		}
	}

	public static void main(String[] args) {
		Question12 q12 = new Question12();
		q12.Function();
	}
}
