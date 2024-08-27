package Step07;

import java.util.Scanner;

public class Q04 {

	private void Function() {
		Scanner scanner = new Scanner(System.in);

		int[][] canvas = new int[100][100];
		int caseCnt = scanner.nextInt();

		for (int i = 0; i < caseCnt; i++) {
			int r = scanner.nextInt();
			int c = scanner.nextInt();

			for (int j = r; j < r + 10; j++)
				for (int k = c; k < c + 10; k++)
					canvas[j][k] = 1;
		}

		int total = 0;
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				total += canvas[i][j];

				System.out.print(canvas[i][j] == 1 ? "*" : " ");
			}
			System.out.println();
		}
		System.out.println(total);

		scanner.close();
	}

	public static void main(String[] args) {
		Q04 q = new Q04();
		q.Function();
	}
}
