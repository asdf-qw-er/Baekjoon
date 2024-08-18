package Step05;

import java.util.Scanner;

public class Q06 {

	private void Function() {
		Scanner scanner = new Scanner(System.in);

		int[] alphabetIndex = new int[26];
		for (int i = 0; i < alphabetIndex.length; i++)
			alphabetIndex[i] = -1;

		String input = scanner.nextLine();
		input = input.toLowerCase();

		for (int i = 0; i < input.length(); i++)
			if (alphabetIndex[input.charAt(i) - 97] == -1)
				alphabetIndex[input.charAt(i) - 97] = i;

		for (int i = 0; i < alphabetIndex.length; i++)
			System.out.print(alphabetIndex[i] + " ");

		scanner.close();
	}

	public static void main(String[] args) {
		Q06 q = new Q06();
		q.Function();
	}
}
