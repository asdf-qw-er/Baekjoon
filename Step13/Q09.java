package Step13;

import java.util.Scanner;

public class Q09 {

	// compareTo() 메서드
	// 반환값이 0: 두 문자열이 사전순으로 같을 때
	// 반환값이 양수: 호출하는 문자열이 비교 대상 문자열보다 사전순으로 뒤에 있을 때
	// 반환값이 음수: 호출하는 문자열이 비교 대상 문자열보다 사전순으로 앞에 있을 때

	private String[] Sort(String[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j].length() > arr[j + 1].length()
						|| (arr[j].length() == arr[j + 1].length() && arr[j].compareTo(arr[j + 1]) > 0)) {
					String temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		return arr;
	}

	private void PrintArray(String[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}

	private void __main__() {
		Scanner scanner = new Scanner(System.in);

		String[] arr = new String[scanner.nextInt()];
		for (int i = 0; i < arr.length; i++)
			arr[i] = scanner.next();

		arr = Sort(arr);
		PrintArray(arr);

		scanner.close();
	}

	public static void main(String[] args) {
		Q09 q = new Q09();
		q.__main__();
	}
}
