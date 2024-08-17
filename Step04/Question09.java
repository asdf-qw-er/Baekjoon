package Step04;

import java.util.Scanner;

public class Question09 {

	private int[] REVERSE(int[] arr, int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;

			start++;
			end--;
		}
		return arr;
	}

	private void Function() {
		Scanner scanner = new Scanner(System.in);

		int[] basket = new int[scanner.nextInt()];
		int[][] reverse = new int[scanner.nextInt()][2];

		for (int i = 0; i < basket.length; i++)
			basket[i] = i + 1;

		for (int i = 0; i < reverse.length; i++)
			for (int j = 0; j < reverse[i].length; j++)
				reverse[i][j] = scanner.nextInt();

		for (int i = 0; i < reverse.length; i++) {
			basket = REVERSE(basket, reverse[i][0] - 1, reverse[i][1] - 1);
		}

		for (int i = 0; i < basket.length; i++)
			System.out.print(basket[i] + " ");

		scanner.close();
	}

	public static void main(String[] args) {
		Question09 q09 = new Question09();
		q09.Function();
	}
}
