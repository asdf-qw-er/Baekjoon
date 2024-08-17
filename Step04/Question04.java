package Step04;

import java.util.Scanner;

public class Question04 {

	public class MAX {
		private int idx = 0;
		private int value = 0;

		public int getIdx() {
			return idx;
		}

		public void setIdx(int idx) {
			this.idx = idx;
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}
	}

	private void Function() {
		Scanner scanner = new Scanner(System.in);

		int[] arr = new int[9];
		for (int i = 0; i < arr.length; i++)
			arr[i] = scanner.nextInt();

		MAX max = new MAX();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max.getValue()) {
				max.setIdx(i);
				max.setValue(arr[i]);
			}
		}

		System.out.println(max.getValue());
		System.out.println(max.getIdx() + 1);

		scanner.close();
	}

	public static void main(String[] args) {
		Question04 q04 = new Question04();
		q04.Function();
	}
}
