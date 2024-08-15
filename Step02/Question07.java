package Step02;

import java.util.Scanner;

public class Question07 {

	private int ReturnLargest(int[] dice) {
		int largest = -1;
		for (int i = 0; i < 3; i++)
			if (largest < dice[i])
				largest = dice[i];
		return largest;
	}

	// 알고리즘 복습필요
	private int ReturnCase(int[] dice) {
		for (int i = 0; i < dice.length; i++) {
			int count = 0;

			for (int j = 0; j < dice.length; j++) {
				if (dice[i] == dice[j])
					count++;
			}

			if (count == 3) {
				return dice[0] * 1000 + 10000;
			} else if (count == 2) {
				return dice[0] * 100 + 1000;
			}
		}

		return ReturnLargest(dice) * 100;
	}

	private void Function() {
		Scanner scanner = new Scanner(System.in);

		int[] dice = new int[3];
		dice[0] = scanner.nextInt();
		dice[1] = scanner.nextInt();
		dice[2] = scanner.nextInt();

		System.out.println(ReturnCase(dice));

		scanner.close();
	}

	public static void main(String[] args) {
		Question07 question07 = new Question07();
		question07.Function();
	}
}
