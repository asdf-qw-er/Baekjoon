package Step10;

import java.util.Scanner;

public class Q04 {

	private int GetAnswer(int num) {
		return num * 4;
	}

	private void __main__() {
		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();
		System.out.println(GetAnswer(num));

		scanner.close();
	}

	public static void main(String[] args) {
		Q04 q = new Q04();
		q.__main__();
	}
}
