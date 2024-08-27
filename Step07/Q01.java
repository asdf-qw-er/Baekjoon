package Step07;

import java.util.Scanner;

public class Q01 {

	private void Function() {
		Scanner scanner = new Scanner(System.in);

		int r = scanner.nextInt();
		int c = scanner.nextInt();
		int[][] arr1 = new int[r][c];
		int[][] arr2 = new int[r][c];

		for (int i = 0; i < r; i++)
			for (int j = 0; j < c; j++)
				arr1[i][j] = scanner.nextInt();
		for (int i = 0; i < r; i++)
			for (int j = 0; j < c; j++)
				arr2[i][j] = scanner.nextInt();

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++)
				System.out.print((arr1[i][j] + arr2[i][j]) + " ");
			System.out.println();
		}

		scanner.close();
	}

	public static void main(String[] args) {
		Q01 q = new Q01();
		q.Function();
	}
}
