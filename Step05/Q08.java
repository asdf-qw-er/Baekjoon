package Step05;

import java.util.Scanner;

public class Q08 {

	private void Function() {
		Scanner scanner = new Scanner(System.in);

		String input = scanner.nextLine();

		String[] splited = input.split(" ");
		int result = 0;
		for (int i = 0; i < splited.length; i++)
			if (splited[i].length() > 0)
				result++;
		System.out.println(result);

		scanner.close();
	}

	public static void main(String[] args) {
		Q08 q = new Q08();
		q.Function();
	}
}
