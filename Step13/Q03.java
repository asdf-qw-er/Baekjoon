package Step13;

import java.util.Scanner;

public class Q03 {

	private int[] Sort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		return arr;
	}

	private int GetCutline(int[] arr, int Cutline) {
		return arr[arr.length - Cutline];
	}

	private void __main__() {
		Scanner scanner = new Scanner(System.in);

		int[] arr = new int[scanner.nextInt()];
		int Cutline = scanner.nextInt();

		for (int i = 0; i < arr.length; i++)
			arr[i] = scanner.nextInt();

		arr = Sort(arr);
		System.out.println(GetCutline(arr, Cutline));

		scanner.close();
	}

	public static void main(String[] args) {
		Q03 q = new Q03();
		q.__main__();
	}
}
