package Step15;

import java.util.Scanner;

public class Q03 {

	private void GetReduced(int a, int b, int c, int d) {
		int numerator = a * d + b * c;
		int denominator = b * d;

		for (int i = numerator; i >= 1; i--) {
			if (numerator % i == 0 && denominator % i == 0) {
				System.out.println(numerator / i + " " + denominator / i);
				break;
			}
		}
	}

	private void __main__() {
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int d = scanner.nextInt();

		GetReduced(a, b, c, d);

		scanner.close();
	}

	public static void main(String[] args) {
		Q03 q = new Q03();
		q.__main__();
	}
}
