package Step03;

import java.util.Scanner;

public class Question08 {

	private void Function() {
		Scanner scanner = new Scanner(System.in);

		int testCase = scanner.nextInt();
		int[][] arrCase = new int[testCase][2];

		for (int i = 0; i < testCase; i++)
			for (int j = 0; j < 2; j++)
				arrCase[i][j] = scanner.nextInt();

		for (int i = 0; i < testCase; i++)
			System.out.println(String.format("Case #%d: %d + %d = %d", i + 1, arrCase[i][0], arrCase[i][1],
					arrCase[i][0] + arrCase[i][1]));

		scanner.close();
	}

	public static void main(String[] args) {
		Question08 q08 = new Question08();
		q08.Function();
	}
}
