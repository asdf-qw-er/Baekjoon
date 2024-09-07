package Step15;

import java.util.Scanner;

public class Q05 {

	private int GetPrimeNumber(int start) {
		for (int i = start;; i++) {
			boolean isPrimeNumber = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrimeNumber = false;
					break;
				}
			}

			if (isPrimeNumber)
				return i;
		}
	}

	private void __main__() {
		Scanner scanner = new Scanner(System.in);

		int[] testCase = new int[scanner.nextInt()];
		for (int i = 0; i < testCase.length; i++)
			testCase[i] = scanner.nextInt();

		for (int i = 0; i < testCase.length; i++)
			System.out.println(GetPrimeNumber(testCase[i]));

		scanner.close();
	}

	public static void main(String[] args) {
		Q05 q = new Q05();
		q.__main__();
	}
}
