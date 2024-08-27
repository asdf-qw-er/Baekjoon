package Step07;

import java.util.Scanner;

public class Q03 {

	private void Function() {
		Scanner scanner = new Scanner(System.in);

		String[] arrString = new String[5];
		char[][] arrChar = new char[5][15];

		for (int i = 0; i < 5; i++)
			arrString[i] = scanner.nextLine();
		for (int i = 0; i < 5; i++) {
			char[] buff = arrString[i].toCharArray();
			for (int j = 0; j < buff.length; j++)
				arrChar[i][j] = buff[j];
		}

		for (int i = 0; i < 15; i++)
			for (int j = 0; j < 5; j++)
				if (arrChar[j][i] != '\0')
					System.out.print(arrChar[j][i]);

		scanner.close();
	}

	public static void main(String[] args) {
		Q03 q = new Q03();
		q.Function();
	}
}
