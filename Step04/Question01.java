package Step04;

import java.util.Scanner;

public class Question01 {

	private void Function() {
		Scanner scanner = new Scanner(System.in);

		int[] arr = new int[scanner.nextInt()];
		for (int i = 0; i < arr.length; i++)
			arr[i] = scanner.nextInt();

		int value = scanner.nextInt();
		int valueCnt = 0;
		for (int i = 0; i < arr.length; i++)
			if (arr[i] == value)
				valueCnt++;

		System.out.println(valueCnt);
		scanner.close();
	}

	public static void main(String[] args) {
		Question01 q01 = new Question01();
		q01.Function();
	}
}
