package Step08;

import java.util.Scanner;

public class Q01 {

	private int Pow(int a, int x) {
		int result = 1;
		for (int i = 0; i < x; i++)
			result *= a;
		return result;
	}

	private int GetDemicalNum(char c) {
		return c - 65 + 10;
	}

	private void Function() {
		Scanner scanner = new Scanner(System.in);

		String[] input = scanner.nextLine().split(" ");
		char[] B = input[0].toCharArray();
		int result = 0;

		for (int i = 0; i < B.length; i++)
			result += Pow(Integer.parseInt(input[1]), Math.abs(i - B.length + 1)) * GetDemicalNum(B[i]);

		System.out.println(result);

		scanner.close();
	}

	public static void main(String[] args) {
		Q01 q = new Q01();
		q.Function();
	}
}
