package Step09;

import java.util.ArrayList;
import java.util.Scanner;

public class Q02 {

	private ArrayList<Integer> GetDivisor(int num) {
		ArrayList<Integer> Divisor = new ArrayList<Integer>();

		for (int i = 1; i <= num; i++) {
			if (num % i == 0)
				Divisor.add(i);
		}
		return Divisor;
	}

	private void Function() {
		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();
		int idx = scanner.nextInt();

		ArrayList<Integer> Divisor = GetDivisor(num);
		if (Divisor.size() <= idx - 1)
			System.out.println(0);
		else
			System.out.println(Divisor.get(idx - 1));

		scanner.close();
	}

	public static void main(String[] args) {
		Q02 q = new Q02();
		q.Function();
	}
}
