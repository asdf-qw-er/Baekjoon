package Step15;

import java.util.Scanner;

public class Q01 {

	private int GetCommonMultiple(int A, int B) {
		for (int i = 1; i <= A * B; i++) {
			if (i % A == 0 && i % B == 0)
				return i;
		}
		return -1;
	}

	private void __main__() {
		Scanner scanner = new Scanner(System.in);

		int[][] testCase = new int[scanner.nextInt()][2];

		for (int i = 0; i < testCase.length; i++) {
			testCase[i][0] = scanner.nextInt();
			testCase[i][1] = scanner.nextInt();
		}

		for (int i = -0; i < testCase.length; i++)
			System.out.println(GetCommonMultiple(testCase[i][0], testCase[i][1]));

		scanner.close();
	}

	public static void main(String[] args) {
		Q01 q = new Q01();
		q.__main__();
	}
}
