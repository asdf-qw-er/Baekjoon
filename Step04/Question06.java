package Step04;

import java.util.Scanner;

public class Question06 {

	private int[] SWAP(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;

		return arr;
	}

	private void Function() {
		Scanner scanner = new Scanner(System.in);

		int[] basket = new int[scanner.nextInt()];
		int[][] swap = new int[scanner.nextInt()][2];

		for (int i = 0; i < basket.length; i++)
			basket[i] = i + 1;

		for (int i = 0; i < swap.length; i++)
			for (int j = 0; j < swap[i].length; j++)
				swap[i][j] = scanner.nextInt();

		for (int i = 0; i < swap.length; i++) {
			basket = SWAP(basket, swap[i][0] - 1, swap[i][1] - 1);
		}

		for (int i = 0; i < basket.length; i++)
			System.out.print(basket[i] + " ");
		scanner.close();
	}

	public static void main(String[] args) {
		Question06 q06 = new Question06();
		q06.Function();
	}
}
