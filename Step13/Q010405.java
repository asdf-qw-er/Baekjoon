package Step13;

import java.util.Scanner;

public class Q010405 {

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

	private void PrintArray(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}

	private void __main__() {
		Scanner scanner = new Scanner(System.in);

		int[] arr = new int[scanner.nextInt()];
		for (int i = 0; i < arr.length; i++)
			arr[i] = scanner.nextInt();

		arr = Sort(arr);
		PrintArray(arr);

		scanner.close();
	}

	public static void main(String[] args) {
		Q010405 q = new Q010405();
		q.__main__();
	}
}
