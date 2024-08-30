package Step08;

import java.util.Scanner;

public class Q04 {

	private int Sequence(int idx) {
		int result = 2;
		for (int i = 0; i <= idx; i++)
			result += i;
		return result;
	}

	private void Function() {
		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();

		System.out.println((int) Math.pow(Sequence(num), 2));

		scanner.close();
	}

	public static void main(String[] args) {
		Q04 q = new Q04();
		q.Function();
	}
}
