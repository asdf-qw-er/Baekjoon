package Step05;

import java.util.Scanner;

public class Q05 {

	private void Function() {
		Scanner scanner = new Scanner(System.in);

		int length = scanner.nextInt();
		scanner.nextLine();
		String input = scanner.nextLine();

		int total = 0;
		for (int i = 0; i < length; i++) {
			// total += Character.getNumericValue(input.charAt(i));
			total += Integer.parseInt(input.substring(i, i + 1));
		}
		System.out.println(total);

		scanner.close();
	}

	public static void main(String[] args) {
		Q05 q = new Q05();
		q.Function();
	}
}
