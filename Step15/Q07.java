package Step15;

import java.util.ArrayList;
import java.util.Scanner;

public class Q07 {

	private int GetPrimeNumber(int n) {
		int PrimeNumberCount = 0;

		for (int i = n + 1; i <= n * 2; i++) {
			boolean isPrimeNumber = true;

			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrimeNumber = false;
					break;
				}
			}

			if (isPrimeNumber)
				PrimeNumberCount++;
		}

		return PrimeNumberCount;
	}

	private void __main__() {
		Scanner scanner = new Scanner(System.in);

		ArrayList<Integer> TestCase = new ArrayList<Integer>();
		while (true) {
			int temp = scanner.nextInt();

			if (temp == 0)
				break;
			else
				TestCase.add(temp);
		}

		for (int i = 0; i < TestCase.size(); i++)
			System.out.println(GetPrimeNumber(TestCase.get(i)));

		scanner.close();
	}

	public static void main(String[] args) {
		Q07 q = new Q07();
		q.__main__();
	}
}
