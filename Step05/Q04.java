package Step05;

import java.util.Scanner;

public class Q04 {

	private void Function() {
		Scanner scanner = new Scanner(System.in);

		String input = scanner.nextLine();
		System.out.println((int) input.charAt(0));

		scanner.close();
	}

	public static void main(String[] args) {
		Q04 q = new Q04();
		q.Function();
	}
}
