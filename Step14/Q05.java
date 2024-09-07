package Step14;

import java.util.Scanner;

public class Q05 {

	private int[] GetCardCount(int[] N, int[] M) {
		int[] result = new int[M.length];

		for (int i = 0; i < M.length; i++)
			for (int j = 0; j < N.length; j++)
				if (M[i] == N[j])
					result[i]++;
		return result;
	}

	private void PrintArray(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	private void __main__() {
		Scanner scanner = new Scanner(System.in);

		int[] N = new int[scanner.nextInt()];
		for (int i = 0; i < N.length; i++)
			N[i] = scanner.nextInt();

		int[] M = new int[scanner.nextInt()];
		for (int i = 0; i < M.length; i++)
			M[i] = scanner.nextInt();

		int[] result = GetCardCount(N, M);
		PrintArray(result);

		scanner.close();
	}

	public static void main(String[] args) {
		Q05 q = new Q05();
		q.__main__();
	}
}
