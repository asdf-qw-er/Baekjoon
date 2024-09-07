package Step15;

import java.util.ArrayList;
import java.util.Scanner;

public class Q08 {

	private int GetGoldBachCount(int num) {
		ArrayList<Integer> Common = new ArrayList<Integer>();
		int result = 0;

		for (int i = 2; i < num; i++) {
			boolean isCommon = true;

			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isCommon = false;
					break;
				}
			}

			if (isCommon)
				Common.add(i);
		}

		for (int i = 0; i < Common.size(); i++)
			for (int j = i; j < Common.size(); j++)
				if (Common.get(i) + Common.get(j) == num)
					result++;

		return result;
	}

	private void __main__() {
		Scanner scanner = new Scanner(System.in);

		int[] arr = new int[scanner.nextInt()];
		for (int i = 0; i < arr.length; i++)
			arr[i] = scanner.nextInt();

		for (int i = 0; i < arr.length; i++)
			System.out.println(GetGoldBachCount(arr[i]));

		scanner.close();
	}

	public static void main(String[] args) {
		Q08 q = new Q08();
		q.__main__();
	}
}
