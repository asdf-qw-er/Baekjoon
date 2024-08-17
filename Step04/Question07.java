package Step04;

import java.util.Scanner;

public class Question07 {

	private void Function() {
		Scanner scanner = new Scanner(System.in);

		int[] student = new int[30];
		for (int i = 0; i < 28; i++)
			student[scanner.nextInt() - 1] = 1;
		for (int i = 0; i < 30; i++)
			if (student[i] == 0)
				System.out.println(i + 1);

		scanner.close();
	}

	public static void main(String[] args) {
		Question07 q07 = new Question07();
		q07.Function();
	}
}
