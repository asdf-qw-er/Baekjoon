package Step12;

import java.util.Scanner;

public class Q01 {

	private int GetCaseCount(int[] card, int total) {
		int result = 0;

		for (int i = 0; i < card.length - 2; i++)
			for (int j = i + 1; j < card.length - 1; j++)
				for (int k = j + 1; k < card.length; k++)
					if (card[i] + card[j] + card[k] <= total && card[i] + card[j] + card[k] > result)
						result = card[i] + card[j] + card[k];
		return result;
	}

	private void __main__() {
		Scanner scanner = new Scanner(System.in);

		int[] card = new int[scanner.nextInt()];
		int total = scanner.nextInt();

		for (int i = 0; i < card.length; i++)
			card[i] = scanner.nextInt();
		System.out.println(GetCaseCount(card, total));

		scanner.close();
	}

	public static void main(String[] args) {
		Q01 q = new Q01();
		q.__main__();
	}
}
