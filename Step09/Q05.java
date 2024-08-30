package Step09;

import java.util.ArrayList;
import java.util.Scanner;

public class Q05 {

	private ArrayList<Integer> GetDivisor(int num) {
		ArrayList<Integer> Divisor = new ArrayList<Integer>();

		for (int i = 1; i <= num; i++)
			if (num % i == 0)
				Divisor.add(i);
		return Divisor;
	}

	private void GetPrimeNumber(int start, int end) {
		int primeTotal = 0;
		int min = -1;

		for (int i = start; i <= end; i++) {
			ArrayList<Integer> Divisor = GetDivisor(i);
			if (Divisor.contains(1) && Divisor.contains(i) && Divisor.size() == 2) {
				primeTotal += i;
				if (min == -1)
					min = i;
			}
		}

		if (min == -1)
			System.out.println(-1);
		else
			System.out.println(primeTotal + "\n" + min);
	}

	private void Function() {
		Scanner scanner = new Scanner(System.in);

		int start = scanner.nextInt();
		int end = scanner.nextInt();

		GetPrimeNumber(start, end);

		scanner.close();
	}

	public static void main(String[] args) {
		Q05 q = new Q05();
		q.Function();
	}
}
