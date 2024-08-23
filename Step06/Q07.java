package Step06;

import java.util.Scanner;

public class Q07 {

	private void Function() {
		Scanner scanner = new Scanner(System.in);

		String[] arr = new String[scanner.nextInt()];
		int result = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.next();

			boolean isGroup = true;
			char[] word = arr[i].toCharArray();

			if (word.length > 2) {
				if (!isSameValueArray(word))
					for (int j = 0; j < word.length - 2; j++)
						for (int k = j + 2; k < word.length; k++)
							if (word[j] == word[k])
								isGroup = false;
			}

			if (isGroup)
				result++;
		}

		System.out.println(result);

		scanner.close();
	}

	private boolean isSameValueArray(char[] word) {
		for (int i = 0; i < word.length; i++)
			if (word[i] != word[0])
				return false;
		return true;
	}

	public static void main(String[] args) {
		Q07 q = new Q07();
		q.Function();
	}
}
