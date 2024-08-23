package Step06;

import java.util.Scanner;

public class Q06 {

	private void Function() {
		Scanner scanner = new Scanner(System.in);

		String input = scanner.nextLine();
		String[] croatiaPatterns = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };

		for (int i = 0; i < 8; i++)
			input = input.replace(croatiaPatterns[i], "*");
		System.out.println(input.length());

		scanner.close();
	}

	public static void main(String[] args) {
		Q06 q = new Q06();
		q.Function();
	}
}
