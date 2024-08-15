package Step02;

import java.util.Scanner;

public class Question01 {

	// Ctrl + Shift + F : 소스코드 자동 정렬
	private static void Function() {
		Scanner scanner = new Scanner(System.in);

		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();

		if (num1 < num2)
			System.out.println("<");
		else if (num1 == num2)
			System.out.println("==");
		else
			System.out.println(">");

		scanner.close();
	}

	public static void main(String[] args) {
		Function();
	}
}
