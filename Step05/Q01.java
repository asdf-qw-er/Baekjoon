package Step05;

import java.util.Scanner;

public class Q01 {

	private void Function() {
		Scanner scanner = new Scanner(System.in);

		String input = scanner.nextLine();

		System.out.println(input.charAt(scanner.nextInt() - 1));

		scanner.close();
	}

	public static void main(String[] args) {
		Q01 q = new Q01();
		q.Function();
	}
}
