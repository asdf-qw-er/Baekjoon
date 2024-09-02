package Step05;

import java.util.Scanner;

public class Q09 {

//	private String Reverse1(String value) {
//		int start = 0;
//		int end = value.length() - 1;
//
//		char[] arr = value.toCharArray();
//
//		while (start < end) {
//			char temp = arr[start];
//			arr[start] = arr[end];
//			arr[end] = temp;
//
//			start++;
//			end--;
//		}
//
//		String result = new String(arr);
//
//		return result;
//	}

	private String Reverse2(String value) {
		StringBuilder sb = new StringBuilder(value);
		return sb.reverse().toString();
	}

	private void Function() {
		Scanner scanner = new Scanner(System.in);

		String input = scanner.nextLine();

		String[] s_CONST = input.split(" ");
		int[] i_CONST = new int[s_CONST.length];

		for (int i = 0; i < s_CONST.length; i++) {
			// s_CONST[i] = Reverse1(s_CONST[i]);
			s_CONST[i] = Reverse2(s_CONST[i]);

			i_CONST[i] = Integer.parseInt(s_CONST[i]);
		}

		System.out.println(i_CONST[0] > i_CONST[1] ? i_CONST[0] : i_CONST[1]);

		scanner.close();
	}

	public static void main(String[] args) {
		Q09 q = new Q09();
		q.Function();
	}
}
