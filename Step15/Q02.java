package Step15;

import java.util.Scanner;

public class Q02 {

	private long GetCommonMultiple(long A, long B) {
		for (long i = 1; i <= A * B; i++) {
			if (i % A == 0 && i % B == 0)
				return i;
		}
		return -1;
	}

	private void __main__() {
		Scanner scanner = new Scanner(System.in);

		int A = scanner.nextInt();
		int B = scanner.nextInt();
		System.out.println(GetCommonMultiple(A, B));

		scanner.close();
	}

	public static void main(String[] args) {
		Q02 q = new Q02();
		q.__main__();
	}
}
