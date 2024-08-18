package Step05;

import java.util.Scanner;

public class Q11 {

	private void Function() {
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 100; i++)
			System.out.println(scanner.nextLine());

		scanner.close();
	}

	public static void main(String[] args) {
		Q11 q = new Q11();
		q.Function();
	}
}
