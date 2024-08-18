package Step05;

import java.util.Scanner;

public class Q02 {

	private void Function() {
		Scanner scanner = new Scanner(System.in);

		System.out.println(scanner.nextLine().length());

		scanner.close();
	}

	public static void main(String[] args) {
		Q02 q = new Q02();
		q.Function();
	}
}
