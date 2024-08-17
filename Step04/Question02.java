package Step04;

import java.util.ArrayList;
import java.util.Scanner;

public class Question02 {

	private void Function() {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		int X = scanner.nextInt();

		int[] A = new int[N];
		for (int i = 0; i < A.length; i++)
			A[i] = scanner.nextInt();

		ArrayList<Integer> resultArr = new ArrayList<Integer>();
		for (int i = 0; i < A.length; i++)
			if (A[i] < X)
				resultArr.add(A[i]);

		String result = "";
		for (int i = 0; i < resultArr.size(); i++)
			result += resultArr.get(i) + " ";
		System.out.println(result);

		scanner.close();
	}

	public static void main(String[] args) {
		Question02 q02 = new Question02();
		q02.Function();
	}
}
