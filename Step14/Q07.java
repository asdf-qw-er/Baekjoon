package Step14;

import java.util.HashSet;
import java.util.Scanner;

public class Q07 {

	private int GetDifferenceSet(int[] A, int[] B) {
		HashSet<Integer> result = new HashSet<Integer>();
		int overlap = 0;

		for (int i = 0; i < A.length; i++) {
			if (result.contains(A[i]))
				overlap++;
			result.add(A[i]);
		}
		for (int i = 0; i < B.length; i++) {
			if (result.contains(B[i]))
				overlap++;
			result.add(B[i]);
		}

		return result.size() - overlap;
	}

	private void __main__() {
		Scanner scanner = new Scanner(System.in);

		int sizeA = scanner.nextInt();
		int sizeB = scanner.nextInt();
		int[] A = new int[sizeA];
		int[] B = new int[sizeB];

		for (int i = 0; i < sizeA; i++)
			A[i] = scanner.nextInt();
		for (int i = 0; i < sizeB; i++)
			B[i] = scanner.nextInt();

		System.out.println(GetDifferenceSet(A, B));

		scanner.close();
	}

	public static void main(String[] args) {
		Q07 q = new Q07();
		q.__main__();
	}
}
