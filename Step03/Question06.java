package Step03;

import java.util.Scanner;

public class Question06 {

	private void Function() {
		Scanner scanner = new Scanner(System.in);

		int testCase = scanner.nextInt();
		int[][] arrCase = new int[testCase][2];

		for (int i = 0; i < testCase; i++)
			for (int j = 0; j < 2; j++)
				arrCase[i][j] = scanner.nextInt();

		for (int i = 0; i < testCase; i++)
			System.out.println(arrCase[i][0] + arrCase[i][1]);

		scanner.close();
	}

	public static void main(String[] args) {
		Question06 q06 = new Question06();
		q06.Function();
	}
}
