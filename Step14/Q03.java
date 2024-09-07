package Step14;

import java.util.HashSet;
import java.util.Scanner;

public class Q03 {

	private String[] GetCommute(String[] arr) {
		HashSet<String> Commute = new HashSet<String>();
		for (int i = 0; i < arr.length; i++) {
			String[] split = arr[i].split(" ");

			if (split[1].equals("enter"))
				Commute.add(split[0]);
			else
				Commute.remove(split[0]);
		}

		Object[] oResult = Commute.toArray();
		String[] Result = new String[oResult.length];
		for (int i = 0; i < oResult.length; i++)
			Result[i] = (String) oResult[i];

		return Result;
	}

	private void PrintArray(String[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j].compareTo(arr[j + 1]) < 0) {
					String temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}

	private void __main__() {
		Scanner scanner = new Scanner(System.in);

		String[] arr = new String[scanner.nextInt()];
		scanner.nextLine();

		for (int i = 0; i < arr.length; i++)
			arr[i] = scanner.nextLine();

		arr = GetCommute(arr);
		PrintArray(arr);

		scanner.close();
	}

	public static void main(String[] args) {
		Q03 q = new Q03();
		q.__main__();
	}
}
