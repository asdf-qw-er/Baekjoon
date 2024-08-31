package Step10;

import java.util.HashSet;
import java.util.Scanner;

public class Q07 {

	private void GetType(HashSet<Integer> Size) {
		if (Size.size() == 3)
			System.out.println("Scalene");
		else if (Size.size() == 2)
			System.out.println("Isosceles");
		else if (Size.size() == 1)
			System.out.println("Equilateral");
	}

	private boolean IsInvalid(int[] arr) {
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
			return true;
		return false;
	}

	private void __main__() {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			int[] arr = new int[3];
			for (int i = 0; i < 3; i++)
				arr[i] = scanner.nextInt();

			if (arr[0] == 0 && arr[1] == 0 && arr[2] == 0)
				break;

			if (!IsInvalid(arr)) {
				HashSet<Integer> Size = new HashSet<Integer>();
				for (int i = 0; i < 3; i++)
					Size.add(arr[i]);
				GetType(Size);
			} else {
				System.out.println("Invalid");
			}
		}

		scanner.close();
	}

	public static void main(String[] args) {
		Q07 q = new Q07();
		q.__main__();
	}
}
