package Step10;

import java.util.Scanner;

public class Q01 {

	private int Area(int a, int b) {
		return a * b;
	}

	private void __main__() {
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.println(Area(a, b));

		scanner.close();
	}

	public static void main(String[] args) {
		Q01 q = new Q01();
		q.__main__();
	}
}
