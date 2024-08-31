package Step12;

import java.util.Scanner;

public class Q06 {

	private int GetBagCount(int kg) {
		int BagCount = 5001;

		for (int i = 0; i <= kg / 3; i++) {
			int temp = kg;
			int rest = (temp - 3 * i) % 5;
			int kg5 = (temp - 3 * i) / 5;

			if (rest == 0 && BagCount > i + kg5)
				BagCount = i + kg5;
		}

		if (BagCount == 5001)
			return -1;
		return BagCount;
	}

	private void __main__() {
		Scanner scanner = new Scanner(System.in);

		int kg = scanner.nextInt();
		System.out.println(GetBagCount(kg));

		scanner.close();
	}

	public static void main(String[] args) {
		Q06 q = new Q06();
		q.__main__();
	}
}
