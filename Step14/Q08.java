package Step14;

import java.util.HashSet;
import java.util.Scanner;

public class Q08 {

	private int GetSubString(String S) {
		HashSet<String> SubString = new HashSet<String>();

		for (int i = 0; i < S.length(); i++)
			for (int j = 0; j <= S.length() - i; j++)
				if (!S.substring(j, j + i).equals(""))
					SubString.add(S.substring(j, j + i));
		SubString.add(S);

		return SubString.size();
	}

	private void __main__() {
		Scanner scanner = new Scanner(System.in);

		String s = scanner.nextLine();
		System.out.println(GetSubString(s));

		scanner.close();
	}

	public static void main(String[] args) {
		Q08 q = new Q08();
		q.__main__();
	}
}
