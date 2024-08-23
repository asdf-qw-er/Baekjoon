package Step06;

import java.util.Scanner;

public class Q04 {

	private int Palindrome(String s) {
		int start = 0;
		int end = s.length() - 1;

		while (start < end) {
			if (s.charAt(start) != s.charAt(end))
				return 0;
			start++;
			end--;
		}
		return 1;
	}

	private void Function() {
		Scanner scanner = new Scanner(System.in);

		String input = scanner.nextLine();
		System.out.println(Palindrome(input));

		scanner.close();
	}

	public static void main(String[] args) {
		Q04 q = new Q04();
		q.Function();
	}
}
