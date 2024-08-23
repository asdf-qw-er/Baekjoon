package Step06;

import java.util.Scanner;

public class Q03 {

	private void Function() {
		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num - i - 1; j++)
				System.out.print(" ");
			for (int j = 0; j < i * 2 + 1; j++)
				System.out.print("*");
			System.out.println();
		}
		for (int i = num - 2; i >= 0; i--) {
			for (int j = 0; j < num - i - 1; j++)
				System.out.print(" ");
			for (int j = 0; j < i * 2 + 1; j++)
				System.out.print("*");
			System.out.println();
		}

		scanner.close();
	}

	public static void main(String[] args) {
		Q03 q = new Q03();
		q.Function();
	}
}
