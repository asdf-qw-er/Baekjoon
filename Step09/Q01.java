package Step09;

import java.util.Scanner;

public class Q01 {

	private boolean isFactor(int a, int b) {
		if (b % a == 0)
			return true;
		else
			return false;
	}

	private boolean isMultiple(int a, int b) {
		if (a % b == 0)
			return true;
		else
			return false;
	}

	private void Function() {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			int[] testCase = new int[2];
			testCase[0] = scanner.nextInt();
			testCase[1] = scanner.nextInt();

			if (testCase[0] == 0 && testCase[1] == 0)
				break;
			else {
				if (!isFactor(testCase[0], testCase[1]) && !isMultiple(testCase[0], testCase[1]))
					System.out.println("neither");
				else if (isFactor(testCase[0], testCase[1]))
					System.out.println("factor");
				else if (isMultiple(testCase[0], testCase[1]))
					System.out.println("multiple");
			}
		}

		scanner.close();
	}

	public static void main(String[] args) {
		Q01 q = new Q01();
		q.Function();
	}
}
