package Step14;

import java.util.Scanner;

public class Q01 {

	private int[] GetCardCount(int[] MyCard, int[] TotalCard) {
		int[] CardCount = new int[TotalCard.length];

		for (int i = 0; i < TotalCard.length; i++)
			for (int j = 0; j < MyCard.length; j++)
				if (TotalCard[i] == MyCard[j])
					CardCount[i] += 1;
		return CardCount;
	}

	private void PrintArray(int[] result) {
		for (int i = 0; i < result.length; i++)
			System.out.print(result[i] + " ");
		System.out.println();
	}

	private void __main__() {
		Scanner scanner = new Scanner(System.in);

		int[] MyCard = new int[scanner.nextInt()];
		for (int i = 0; i < MyCard.length; i++)
			MyCard[i] = scanner.nextInt();

		int[] TotalCard = new int[scanner.nextInt()];
		for (int i = 0; i < TotalCard.length; i++)
			TotalCard[i] = scanner.nextInt();

		int[] result = GetCardCount(MyCard, TotalCard);
		PrintArray(result);

		scanner.close();
	}

	public static void main(String[] args) {
		Q01 q = new Q01();
		q.__main__();
	}
}
