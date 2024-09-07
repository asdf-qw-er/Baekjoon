package Step14;

import java.util.HashSet;
import java.util.Scanner;

public class Q02 {

	private int GetSetCount(String[] arr, int criteria) {
		int SetCount = 0;
		HashSet<String> UniqueString = new HashSet<String>();

		for (int i = 0; i < criteria; i++)
			UniqueString.add(arr[i]);

		for (int i = criteria; i < arr.length; i++)
			if (UniqueString.contains(arr[i]))
				SetCount++;

		return SetCount;
	}

	private void __main__() {
		Scanner scanner = new Scanner(System.in);

		int criteria = scanner.nextInt();
		int size = scanner.nextInt();
		String[] arr = new String[size + criteria];

		scanner.nextLine();
		for (int i = 0; i < arr.length; i++)
			arr[i] = scanner.next();

		System.out.println(GetSetCount(arr, criteria));

		scanner.close();
	}

	public static void main(String[] args) {
		Q02 q = new Q02();
		q.__main__();
	}
}
