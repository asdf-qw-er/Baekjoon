package Step05;

import java.util.Scanner;

public class Q10 {

	private int GetDialNum(char c) {
		switch (c) {
		case 'A':
		case 'B':
		case 'C':
			return 2;
		case 'D':
		case 'E':
		case 'F':
			return 3;
		case 'G':
		case 'H':
		case 'I':
			return 4;
		case 'J':
		case 'K':
		case 'L':
			return 5;
		case 'M':
		case 'N':
		case 'O':
			return 6;
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
			return 7;
		case 'T':
		case 'U':
		case 'V':
			return 8;
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
			return 9;
		}
		return -1;
	}

	private void Function() {
		Scanner scanner = new Scanner(System.in);

		String input = scanner.nextLine();
		int total = 0;

		input = input.toUpperCase();
		for (int i = 0; i < input.length(); i++) {
			total += GetDialNum(input.charAt(i));
		}

		System.out.println(total + input.length());

		scanner.close();
	}

	public static void main(String[] args) {
		Q10 q = new Q10();
		q.Function();
	}
}
