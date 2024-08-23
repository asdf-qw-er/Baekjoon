package Step06;

import java.util.Scanner;

public class Q02 {

	private int[] peace = { 1, 1, 2, 2, 2, 8 };

	private void Function() {
		Scanner scanner = new Scanner(System.in);

		int[] curPeace = new int[peace.length];
		for (int i = 0; i < peace.length; i++) {
			curPeace[i] = scanner.nextInt();
			curPeace[i] = peace[i] - curPeace[i];
		}

		for (int i = 0; i < peace.length; i++)
			System.out.print(curPeace[i] + " ");

		scanner.close();
	}

	public static void main(String[] args) {
		Q02 q = new Q02();
		q.Function();
	}
}
