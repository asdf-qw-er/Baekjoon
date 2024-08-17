package Step03;

import java.util.Scanner;

public class Question04 {

	private void Function() {
		Scanner scanner = new Scanner(System.in);

		int inputTotal = scanner.nextInt();
		int arrLength = scanner.nextInt();
		int total = 0;

		int[][] arr = new int[arrLength][2];
		for (int i = 0; i < arrLength; i++)
			for (int j = 0; j < 2; j++)
				arr[i][j] = scanner.nextInt();

		for (int i = 0; i < arrLength; i++)
			total += arr[i][0] * arr[i][1];

		if (total == inputTotal)
			System.out.println("Yes");
		else
			System.out.println("No");

		scanner.close();
	}

	public static void main(String[] args) {
		Question04 q04 = new Question04();
		q04.Function();
	}
}
