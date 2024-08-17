package Step04;

import java.util.Scanner;

public class Question10 {

	private void Function() {
		Scanner scanner = new Scanner(System.in);

		int[] score = new int[scanner.nextInt()];
		int max = 0;

		for (int i = 0; i < score.length; i++) {
			score[i] = scanner.nextInt();
			if (max <= score[i])
				max = score[i];
		}

		double total = 0;
		for (int i = 0; i < score.length; i++)
			total += (double) score[i] / max * 100;
		
		System.out.println(total / score.length);

		scanner.close();
	}

	public static void main(String[] args) {
		Question10 q10 = new Question10();
		q10.Function();
	}
}
