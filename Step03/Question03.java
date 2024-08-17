package Step03;

import java.util.Scanner;

public class Question03 {

	private void Function() {
		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();

		int total = 0;
		for (int i = 1; i <= num; i++)
			total += i;

		System.out.println(total);
		scanner.close();
	}

	public static void main(String[] args) {
		Question03 question03 = new Question03();
		question03.Function();
	}
}
