package Step07;

import java.util.Scanner;

public class Q02 {

	private void Function() {
		Scanner scanner = new Scanner(System.in);
		int maxValue = 0, maxRow = 0, maxCol = 0;

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				int value = scanner.nextInt();
				if (value > maxValue) {
					maxValue = value;
					maxRow = i;
					maxCol = j;
				}
			}
		}

		System.out.println(maxValue);
		System.out.println((maxRow + 1) + " " + (maxCol + 1));

		scanner.close();
	}

	public static void main(String[] args) {
		Q02 q = new Q02();
		q.Function();
	}
}
