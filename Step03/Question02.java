package Step03;

import java.util.Scanner;

public class Question02 {

	private void Function() {
		Scanner scanner = new Scanner(System.in);

		int testCaseCnt = scanner.nextInt();
		int[][] testCase = new int[testCaseCnt][2];

		for (int i = 0; i < testCaseCnt; i++) {
			testCase[i][0] = scanner.nextInt();
			testCase[i][1] = scanner.nextInt();
		}

		for (int i = 0; i < testCaseCnt; i++)
			System.out.println(testCase[i][0] + testCase[i][1]);

		scanner.close();
	}

	public static void main(String[] args) {
		Question02 question02 = new Question02();
		question02.Function();
	}
}
