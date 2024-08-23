package Step06;

import java.util.Scanner;

public class Q05 {

	// ASCII
	// A : 65
	// a : 97

	private void Function() {
		Scanner scanner = new Scanner(System.in);

		char[] input = scanner.nextLine().toUpperCase().toCharArray();
		int[] count = new int[26];

		for (int i = 0; i < input.length; i++)
			count[input[i] - 65]++;

		if (HasSameValueInArray(count))
			System.out.println("?");
		else {
			int max = 0, idx = 0;
			for (int i = 0; i < count.length; i++) {
				if (max < count[i]) {
					max = count[i];
					idx = i;
				}
			}
			System.out.println((char) (idx + 65));
		}

		scanner.close();
	}

	private boolean HasSameValueInArray(int[] count) {
		int max = 0, maxCount = 0;
		for (int i = 0; i < count.length; i++)
			if (max < count[i])
				max = count[i];

		for (int i = 0; i < count.length; i++)
			if (max == count[i])
				maxCount++;

		if (maxCount > 1)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Q05 q = new Q05();
		q.Function();
	}
}
