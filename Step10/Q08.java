package Step10;

import java.util.Scanner;

public class Q08 {

	private int GetMaximumSize(int[] arr) {
		int maxLength = 0;
		int maxIdx = -1;
		int totalLength = 0;

		for (int i = 0; i < 3; i++) {
			if (maxLength < arr[i]) {
				maxLength = arr[i];
				maxIdx = i;
			}
		}
		for (int i = 0; i < 3; i++)
			if (i != maxIdx)
				totalLength += arr[i];

		if (maxLength >= totalLength)
			return totalLength * 2 - 1;
		else
			return totalLength + maxLength;
	}

	private void __main__() {
		Scanner scanner = new Scanner(System.in);

		int[] arr = new int[3];
		for (int i = 0; i < 3; i++)
			arr[i] = scanner.nextInt();
		System.out.println(GetMaximumSize(arr));

		scanner.close();
	}

	public static void main(String[] args) {
		Q08 q = new Q08();
		q.__main__();
	}
}
