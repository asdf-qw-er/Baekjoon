package Step13;

import java.util.Scanner;

public class Q06 {

	private int[] Sort(String sArr) {
		char[] cArr = sArr.toCharArray();
		int[] arr = new int[cArr.length];

		for (int i = 0; i < cArr.length; i++)
			arr[i] = Character.getNumericValue(cArr[i]);

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		return arr;
	}

	private void PrintArray(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i]);
		System.out.println();
	}

	private void __main__() {
		Scanner scanner = new Scanner(System.in);

		String sArr = scanner.nextLine();
		int[] arr = Sort(sArr);
		PrintArray(arr);

		scanner.close();
	}

	public static void main(String[] args) {
		Q06 q = new Q06();
		q.__main__();
	}
}
