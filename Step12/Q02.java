package Step12;

import java.util.Scanner;

public class Q02 {

	private int GetCreator(int N) {
		for (int i = 1; i < N; i++) {
			int Creator = i;
			int temp = i;

			while (temp != 0) {
				Creator += temp % 10;
				temp /= 10;
			}

			if (Creator == N)
				return i;
		}
		return 0;
	}

	private void __main__() {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		System.out.println(GetCreator(N));

		scanner.close();
	}

	public static void main(String[] args) {
		Q02 q = new Q02();
		q.__main__();
	}
}
