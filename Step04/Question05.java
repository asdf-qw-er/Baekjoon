package Step04;

import java.util.Scanner;

public class Question05 {

	private void Function() {
		Scanner scanner = new Scanner(System.in);

		int[] basket = new int[scanner.nextInt()];
		int[][] shoot = new int[scanner.nextInt()][3];

		for (int i = 0; i < shoot.length; i++)
			for (int j = 0; j < shoot[i].length; j++)
				shoot[i][j] = scanner.nextInt();

		for (int i = 0; i < shoot.length; i++)
			for (int j = shoot[i][0] - 1; j <= shoot[i][1] - 1; j++)
				basket[j] = shoot[i][2];

		for (int i = 0; i < basket.length; i++)
			System.out.print(basket[i] + " ");
		scanner.close();
	}

	public static void main(String[] args) {
		Question05 q05 = new Question05();
		q05.Function();
	}
}
