package Step09;

import java.util.ArrayList;
import java.util.Scanner;

public class Q06 {

	private void GetPrimeFactor(int num) {
		if (num == 1)
			return;

		ArrayList<Integer> PrimeFactor = new ArrayList<Integer>();
		int temp = num;

		for (int i = 2; i <= num; i++) {
			if (temp % i == 0) {
				temp /= i;
				PrimeFactor.add(i);
				i--;
			}
		}

		for (int i = 0; i < PrimeFactor.size(); i++)
			System.out.println(PrimeFactor.get(i));
	}

	private void Function() {
		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();
		GetPrimeFactor(num);

		scanner.close();
	}

	public static void main(String[] args) {
		Q06 q = new Q06();
		q.Function();
	}
}
