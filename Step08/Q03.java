package Step08;

import java.util.Scanner;

public class Q03 {

	private int[] GetChange(int testCase) {
		int total = testCase;
		int[] change = { 25, 10, 5, 1 };
		int[] changeCnt = new int[change.length];

		for (int i = 0; i < change.length; i++) {
			changeCnt[i] = total / change[i];
			total -= change[i] * changeCnt[i];
		}
		return changeCnt;
	}

	private void Function() {
		Scanner scanner = new Scanner(System.in);

		int[] testCase = new int[scanner.nextInt()];
		for (int i = 0; i < testCase.length; i++)
			testCase[i] = scanner.nextInt();

		for (int i = 0; i < testCase.length; i++) {
			int[] result = GetChange(testCase[i]);

			System.out.println();
			for (int j = 0; j < result.length; j++)
				System.out.print(result[j] + " ");
		}

		scanner.close();
	}

	public static void main(String[] args) {
		Q03 q = new Q03();
		q.Function();
	}
}
