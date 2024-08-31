package Step12;

import java.util.Scanner;

public class Q03 {

	private int getY(int a, int b, int c, int d, int e, int f) {
		return (a * f - c * d) / (a * e - b * d);
	}

	private int getX(int a, int b, int c, int y) {
		return (c - b * y) / a;
	}

	private void __main__() {
		Scanner scanner = new Scanner(System.in);

		int a, b, c, d, e, f;
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		d = scanner.nextInt();
		e = scanner.nextInt();
		f = scanner.nextInt();

		int y = getY(a, b, c, d, e, f);
		int x = getX(a, b, c, y);

		System.out.println(x + " " + y);

		scanner.close();
	}

	public static void main(String[] args) {
		Q03 q = new Q03();
		q.__main__();
	}
}
