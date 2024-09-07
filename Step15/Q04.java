package Step15;

import java.util.Scanner;

public class Q04 {

	private int GetCommonMultiple(int[] Trees) {
		int[] diff = new int[Trees.length - 1];
		int diffMax = 0, commonMultiple = 0, result = 0;

		for (int i = 1; i < Trees.length; i++) {
			diff[i - 1] = Trees[i] - Trees[i - 1];

			if (diffMax < diff[i - 1])
				diffMax = diff[i - 1];
		}

		for (int i = 2; i < diffMax; i++) {
			boolean isCommonMultiple = true;

			for (int j = 0; j < diff.length; j++)
				if (diff[j] % i != 0)
					isCommonMultiple = false;

			if (isCommonMultiple)
				commonMultiple = i;
		}

		for (int i = Trees[0]; i <= Trees[Trees.length - 1]; i += commonMultiple)
			result++;

		return result - Trees.length;
	}

	private void __main__() {
		Scanner scanner = new Scanner(System.in);

		int[] Trees = new int[scanner.nextInt()];
		for (int i = 0; i < Trees.length; i++)
			Trees[i] = scanner.nextInt();

		System.out.println(GetCommonMultiple(Trees));

		scanner.close();
	}

	public static void main(String[] args) {
		Q04 q = new Q04();
		q.__main__();
	}
}
