package Step13;

import java.util.Scanner;

public class Q10 {

	public class Member {
		private int age;
		private String name;

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}

	private Member[] Sort(Member[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j].getAge() > arr[j + 1].getAge()) {
					Member temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		return arr;
	}

	private void PrintArray(Member[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i].getAge() + " " + arr[i].getName());
	}

	private void __main__() {
		Scanner scanner = new Scanner(System.in);

		Member[] arr = new Member[scanner.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Member();
			arr[i].setAge(scanner.nextInt());
			arr[i].setName(scanner.next());
		}

		arr = Sort(arr);
		PrintArray(arr);

		scanner.close();
	}

	public static void main(String[] args) {
		Q10 q = new Q10();
		q.__main__();
	}
}
