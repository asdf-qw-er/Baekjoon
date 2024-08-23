package Step06;

import java.util.Scanner;

public class Q08 {

	private String[] Grade = { "F", "P", "D0", "D+", "C0", "C+", "B0", "B+", "A0", "A+" };

	private void Function() {
		Scanner scanner = new Scanner(System.in);

		float totalGrade = 0;
		float totalCredit = 0;

		for (int i = 0; i < 20; i++) {
			String[] input = scanner.nextLine().split(" ");
			for (int j = 0; j < Grade.length; j++) {
				if (Grade[j].equals(input[2])) {
					if (j >= 2) {
						totalGrade += (0.5f * j) * Float.parseFloat(input[1]);
						totalCredit += Float.parseFloat(input[1]);
					} else if (j == 0)
						totalCredit += Float.parseFloat(input[1]);
					break;
				}
			}
		}

		System.out.println(totalGrade / totalCredit);

		scanner.close();
	}

	public static void main(String[] args) {
		Q08 q = new Q08();
		q.Function();
	}
}
