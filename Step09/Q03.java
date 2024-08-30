package Step09;

import java.util.ArrayList;
import java.util.Scanner;

public class Q03 {

	private ArrayList<Integer> GetDivisor(int num) {
		ArrayList<Integer> Divisor = new ArrayList<Integer>();

		for (int i = 1; i <= num; i++) {
			if (num % i == 0 && num != i)
				Divisor.add(i);
		}
		return Divisor;
	}

	private void isPerfect(int num, ArrayList<Integer> Divisor) {
		int total = 0;
		for (int i = 0; i < Divisor.size(); i++)
			total += Divisor.get(i);

		if (num == total) {
			System.out.print(num + " = ");
			for (int i = 0; i < Divisor.size(); i++) {
				System.out.print(Divisor.get(i));
				if (i != Divisor.size() - 1)
					System.out.print(" + ");
			}
			System.out.println();
		} else {
			System.out.println(num + " is NOT perfect.");
		}
	}

	private void Function() {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			int num = scanner.nextInt();

			if (num == -1)
				break;
			else
				isPerfect(num, GetDivisor(num));
		}

		scanner.close();
	}

	public static void main(String[] args) {
		Q03 q = new Q03();
		q.Function();
	}
}
