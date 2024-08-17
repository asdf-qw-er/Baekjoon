package Step03;

import java.util.Scanner;

public class Question01 {

	private void Function() {
		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();

		for (int i = 1; i < 10; i++)
			System.out.println(num + " * " + i + " = " + (num * i));

		scanner.close();
	}

	public static void main(String[] args) {
		Question01 question01 = new Question01();
		question01.Function();
	}
}
