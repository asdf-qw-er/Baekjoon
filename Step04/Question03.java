package Step04;

import java.util.Scanner;

public class Question03 {

	private void Function() {
		Scanner scanner = new Scanner(System.in);

		int[] arr = new int[scanner.nextInt()];
		for (int i = 0; i < arr.length; i++)
			arr[i] = scanner.nextInt();

		int max = 0;
		int min = 1000001;

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i])
				max = arr[i];
			if (min > arr[i])
				min = arr[i];
		}

		System.out.println(min + " " + max);

		scanner.close();
	}

	public static void main(String[] args) {
		Question03 q03 = new Question03();
		q03.Function();
	}
}
