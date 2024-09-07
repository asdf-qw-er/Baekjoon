package Step14;

import java.util.ArrayList;
import java.util.Scanner;

public class Q06 {

	private String[] GetDeutbo(String[] arr, int N) {
		ArrayList<String> result = new ArrayList<String>();

		for (int i = 0; i < N; i++)
			for (int j = N; j < arr.length; j++)
				if (arr[i].equals(arr[j]))
					result.add(arr[i]);

		Object[] oResult = result.toArray();
		String[] sResult = new String[oResult.length];
		for (int i = 0; i < oResult.length; i++)
			sResult[i] = (String) oResult[i];

		return sResult;
	}

	private void PrintArray(String[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j].compareTo(arr[j + 1]) > 0) {
					String temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		System.out.println(arr.length);
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}

	private void __main__() {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		int M = scanner.nextInt();
		String[] arr = new String[N + M];

		for (int i = 0; i < N + M; i++)
			arr[i] = scanner.next();

		arr = GetDeutbo(arr, N);
		PrintArray(arr);

		scanner.close();
	}

	public static void main(String[] args) {
		Q06 q = new Q06();
		q.__main__();
	}
}
