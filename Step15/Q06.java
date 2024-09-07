package Step15;

import java.util.Scanner;

public class Q06 {

	private void GetPrimeNumber(int M, int N) {
		for (int i = M; i <= N; i++) {
			boolean isPrimeNumber = true;

			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrimeNumber = false;
					break;
				}
			}

			if (isPrimeNumber)
				System.out.println(i);
		}
	}

	private void __main__() {
		Scanner scanner = new Scanner(System.in);

		int M = scanner.nextInt();
		int N = scanner.nextInt();

		GetPrimeNumber(M, N);

		scanner.close();
	}

	public static void main(String[] args) {
		Q06 q = new Q06();
		q.__main__();
	}
}
