package Step13;

import java.util.Scanner;

public class Q02 {

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

	private int GetAverage(int[] arr) {
		int total = 0;
		for (int i = 0; i < arr.length; i++)
			total += arr[i];
		return total / 5;
	}

	private int GetMiddle(int[] arr) {
		return arr[2];
	}

	private void __main__() {
		Scanner scanner = new Scanner(System.in);

		int[] arr = new int[5];
		for (int i = 0; i < 5; i++)
			arr[i] = scanner.nextInt();

		arr = Sort(arr);
		System.out.println(GetAverage(arr));
		System.out.println(GetMiddle(arr));

		scanner.close();
	}

	public static void main(String[] args) {
		Q02 q = new Q02();
		q.__main__();
	}
}
