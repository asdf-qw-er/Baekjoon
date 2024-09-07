package Step15;

import java.util.Scanner;

public class Q09 {

	private int GetOpenWindowCount(int num) {
		int[] OpenWindow = new int[num + 1];
		int OpenWindowCount = 0;

		for (int i = 1; i < OpenWindow.length; i++)
			for (int j = i; j < OpenWindow.length; j += i)
				OpenWindow[j] = OpenWindow[j] == 0 ? 1 : 0;

		for (int i = 1; i < OpenWindow.length; i++)
			OpenWindowCount += OpenWindow[i];

		return OpenWindowCount;
	}

	private void __main__() {
		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();
		System.out.println(GetOpenWindowCount(num));

		scanner.close();
	}

	public static void main(String[] args) {
		Q09 q = new Q09();
		q.__main__();
	}
}
