package Step02;

import java.util.Scanner;

public class Question03 {

	private void Function() {
		Scanner scanner = new Scanner(System.in);

		int year = scanner.nextInt();

		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			System.out.println("1");
		else
			System.out.println("0");

		scanner.close();
	}

	public static void main(String[] args) {
		Question03 question03 = new Question03();
		question03.Function();
	}
}
