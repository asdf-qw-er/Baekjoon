package Step14;

import java.util.Scanner;

public class Q04 {

	private String GetPokemon(String[] arr, int idx) {
		return arr[idx - 1];
	}

	private int GetPokemon(String[] arr, String Pokemon) {
		for (int i = 0; i < arr.length; i++)
			if (arr[i].equals(Pokemon))
				return i + 1;
		return -1;
	}

	private void __main__() {
		Scanner scanner = new Scanner(System.in);

		int arrSize = scanner.nextInt();
		int quizSize = scanner.nextInt();
		String[] arr = new String[arrSize];

		// scanner.nextLine();
		for (int i = 0; i < arrSize; i++)
			arr[i] = scanner.next();

		for (int i = 0; i < quizSize; i++) {
			String stemp = scanner.next();

			try {
				int itemp = Integer.parseInt(stemp);
				System.out.println(GetPokemon(arr, itemp));
			} catch (Exception e) {
				System.out.println(GetPokemon(arr, stemp));
			}
		}

		scanner.close();
	}

	public static void main(String[] args) {
		Q04 q = new Q04();
		q.__main__();
	}
}
