package Step09;

import java.util.ArrayList;
import java.util.Scanner;

public class Q04 {

	private ArrayList<Integer> GetDivisor(int num) {
		ArrayList<Integer> Divisor = new ArrayList<Integer>();

		for (int i = 1; i <= num; i++)
			if (num % i == 0)
				Divisor.add(i);
		return Divisor;
	}

	private int GetPrimeNumber(int[] testCase) {
		int count = 0;

		for (int i = 0; i < testCase.length; i++) {
			ArrayList<Integer> Divisor = GetDivisor(testCase[i]);
			if (Divisor.contains(1) && Divisor.contains(testCase[i]) && Divisor.size() == 2)
				count++;
		}
		return count;
	}

	private void Function() {
		Scanner scanner = new Scanner(System.in);

		int[] testCase = new int[scanner.nextInt()];
		for (int i = 0; i < testCase.length; i++)
			testCase[i] = scanner.nextInt();

		System.out.println(GetPrimeNumber(testCase));

		scanner.close();
	}

	public static void main(String[] args) {
		Q04 q = new Q04();
		q.Function();
	}
}
