package Step05;

import java.util.Scanner;

public class Q03 {

	private void Function() {
		Scanner scanner = new Scanner(System.in);

		String[] arr = new String[scanner.nextInt()];
		for (int i = 0; i < arr.length; i++)
			arr[i] = scanner.next();

		for (int i = 0; i < arr.length; i++)
			System.out.println(String.format("%c%c", arr[i].charAt(0), arr[i].charAt(arr[i].length() - 1)));
		scanner.close();
	}

	public static void main(String[] args) {
		Q03 q = new Q03();
		q.Function();
	}
}
