package Step03;

import java.util.Scanner;

public class Question05 {

	private void Function() {
		Scanner scanner = new Scanner(System.in);

		int longByte = scanner.nextInt();

		String result = "";
		for (int i = 0; i < longByte / 4; i++)
			result += "long ";
		result += "int";

		System.out.println(result);

		scanner.close();
	}

	public static void main(String[] args) {
		Question05 q05 = new Question05();
		q05.Function();
	}
}
